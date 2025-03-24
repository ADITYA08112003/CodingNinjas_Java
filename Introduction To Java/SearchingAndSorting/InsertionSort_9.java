// package SearchingAndSorting;
import java.util.Scanner;
public class InsertionSort_9 {

	public static void printarray(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void insertionsort(int[] arr) {
		int n=arr.length;
		for(int i=1;i<n;i++) {
			// Insert ith element in Sorted Portion
			int j=i-1;
			int temp=arr[i];
			while(j>=0 && arr[j]>temp) {
				arr[j+1]=arr[j];
				j--;
			}
			// Position will be j+1
			arr[j+1]=temp;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("arr["+i+"]::");
			arr[i]=s.nextInt();
		}
		insertionsort(arr);
		printarray(arr);
	}

}
