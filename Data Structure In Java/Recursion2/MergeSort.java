package Recursion2;

import java.util.Scanner;

public class MergeSort {
	public static void Print(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
//	Process1
//	Time Complexity:O(N*logN)
//	Space Complexity:O(N)
	 public static void MergeSortProc1(int[] arr, int l, int r){
	        if (l < r) {
	            // Find the middle point to divide the array into two halves
	            int mid = (l + r) / 2;

	            // Sort the first and second halves recursively
	            MergeSortProc1(arr, l, mid);
	            MergeSortProc1(arr, mid+1, r);

	            // Merge the sorted halves
	            merge(arr, l, mid, r);
	        }
	    }

	    private static void merge(int[] arr, int l, int mid, int r) {
	        // Find sizes of two subarrays to be merged
	        int n1 = mid - l + 1;
	        int n2 = r - mid;

	        // Create temporary arrays to hold the data
	        int[] leftArr = new int[n1];
	        int[] rightArr = new int[n2];

	        // Copy data to temporary arrays
	        for (int i = 0; i < n1; i++) {
	            leftArr[i] = arr[l + i];
	        }
	        for (int j = 0; j < n2; j++) {
	            rightArr[j] = arr[mid + 1 + j];
	        }

	        // Merge the temporary arrays back into the original array
	        int i = 0, j = 0, k = l;
	        while (i < n1 && j < n2) {
	            if (leftArr[i] <= rightArr[j]) {
	                arr[k] = leftArr[i];
	                i++;
	            } else {
	                arr[k] = rightArr[j];
	                j++;
	            }
	            k++;
	        }

	        // Copy remaining elements of leftArr[] if any
	        while (i < n1) {
	            arr[k] = leftArr[i];
	            i++;
	            k++;
	        }

	        // Copy remaining elements of rightArr[] if any
	        while (j < n2) {
	            arr[k] = rightArr[j];
	            j++;
	            k++;
	        }
	    }
	
	
	
//	Process2
//		Time Complexity:O(N*logN)
//		Space Complexity:O(N)
	public static void MergeSortProc2(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return; 
        }

        int mid = arr.length / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[arr.length - mid];

        
        for (int i = 0; i < mid; i++) {
            leftArray[i] = arr[i];
        }
        for (int i = mid; i < arr.length; i++) {
            rightArray[i - mid] = arr[i];
        }
        MergeSortProc2(leftArray);
        MergeSortProc2(rightArray);
        MergeProc2(arr, leftArray, rightArray);
    }

    private static void MergeProc2(int[] arr, int[] leftArray, int[] rightArray) {
        int leftLength = leftArray.length;
        int rightLength = rightArray.length;
        int i = 0, j = 0, k = 0;

        while (i < leftLength && j < rightLength) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k++] = leftArray[i++];
            } else {
                arr[k++] = rightArray[j++];
            }
        }

        while (i < leftLength) {
            arr[k++] = leftArray[i++];
        }
        while (j < rightLength) {
            arr[k++] = rightArray[j++];
        }
    }

    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++) {
    	   arr[i]=s.nextInt();
       }
       int arr1[]=arr.clone();
//       Process1
       System.out.println("Process1:");
       MergeSortProc1(arr,0,n-1);
       Print(arr);
       System.out.println();
//       Process2
       System.out.println("Process2:");
       MergeSortProc2(arr1);
       Print(arr1);
       
    }

}
