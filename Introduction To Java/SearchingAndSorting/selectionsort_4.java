// package SearchingAndSorting;
import java.util.*;
import java.util.Scanner;
public class selectionsort_4{

	public static void selectionsort(int[] arr) {
		int n=arr.length;
		int[] nums=new int[n];
		
		for(int i=0;i<n-1;i++) {
			// Insert Elemnet at ith position
			int min=Integer.MAX_VALUE;
			int minIndex=-1;
			for(int j=i;j<n;j++) {
				// Finding the minimum Element among j positions
				if(arr[j]<min) {
					min=arr[j];
					minIndex=j;
				}
			}
			// Swap Element at minIndex with ith Element
			int temp=arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=temp;
		}
		
	}
	public static void printarray(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("arr["+i+"]::");
			arr[i]=s.nextInt();
		}
		selectionsort(arr);
		printarray(arr);
		
	}

}
