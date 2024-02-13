package Recursion2;

import java.util.Scanner;

public class QuickSort {
	public static void Print(int arr[]) {
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}
	
	public static void QuickSortProc1(int[] arr,int si,int ei) {
		if(si>=ei) {
			return;
		}
		int pivotIndex=PartitionProc1(arr,si,ei);
		QuickSortProc1(arr,si,pivotIndex-1);
		QuickSortProc1(arr, pivotIndex+1, ei);
	}
	public static int PartitionProc1(int arr[],int si,int ei) {
		int pivotElement=arr[si];
		int SmallerNumCount=0;
		for(int i=si+1;i<=ei;i++) {
			if(arr[i]<pivotElement) {
				SmallerNumCount++;
			}
		}
		int temp=arr[si+SmallerNumCount];
		arr[si+SmallerNumCount]=pivotElement;
		arr[si]=temp;
		int i=si;
		int j=ei;
		while(i<j) {
			if(arr[i]<pivotElement) {
				i++;
			}
			else if(arr[j]>=pivotElement) {
				j--;
			}
			else {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
		}
		return si+SmallerNumCount;
	}
	
//	Process2
	
	  public static void quickSort(int[] arr, int low, int high) {
	        if (low < high) {
	             int pivotIndex = partition(arr, low, high);

	            quickSort(arr, low, pivotIndex - 1);
	            quickSort(arr, pivotIndex + 1, high);
	        }
	    }

	    public static int partition(int[] arr, int low, int high) {
	        int pivot = arr[high];
	        int i = low - 1;
	        for (int j = low; j < high; j++) {
	           if (arr[j] <= pivot) {
	                i++;
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }

	        int temp = arr[i + 1];
	        arr[i + 1] = arr[high];
	        arr[high] = temp;

	        return i + 1;
	    }

	    public static void main(String[] args) {
	        Scanner s=new Scanner(System.in);
	        int n=s.nextInt();
	        int arr[]=new int[n];
	        for(int i=0;i<n;i++) {
	        	arr[i]=s.nextInt();
	        }
	        int arr2[]=arr.clone();
//	        Process1
	        System.out.println("Process1:");
	        QuickSortProc1(arr, 0, n-1);
	        Print(arr);
	        System.out.println();
//	        Process2
	        System.out.println("Process2:");
	        quickSort(arr2, 0, n-1);
	        Print(arr2);
	        
	    }

}
