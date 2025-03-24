// package SearchingAndSorting;
import java.util.Scanner;
public class MergeTwoSortedArray_10 {

	public static void printarray(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static int[] mergestwosortedarray(int[] arr1,int[] arr2) {
		int n=arr1.length;
		int m=arr2.length;
		int[] arr=new int[n+m];
		int i=0,j=0,k=0;
		while(i<n && j<m) {
			if(arr1[i]<=arr2[j]) {
				arr[k]=arr1[i];
				i++;
				k++;
			}
			else {
				arr[k]=arr2[j];
				j++;
				k++;
			}
		}
		while(i<n) {
			arr[k]=arr1[i];
			i++;
			k++;
		}
		
		while(j<m) {
			arr[k]=arr2[j];
			j++;
			k++;
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of array1::");
		int n=s.nextInt();
		int arr1[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("arr1["+i+"]::");
			arr1[i]=s.nextInt();
		}
		System.out.print("Enter the size of array2:: ");
		int m=s.nextInt();
		int arr2[]=new int[m];
		for(int j=0;j<m;j++) {
			System.out.println("arr2["+j+"]::");
			arr2[j]=s.nextInt();
		}
		int arr3[]=mergestwosortedarray(arr1,arr2);
		printarray(arr3);

	}
}
