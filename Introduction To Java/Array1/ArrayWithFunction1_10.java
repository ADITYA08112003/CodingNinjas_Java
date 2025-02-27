// package Array1;
import java.util.Scanner;
public class ArrayWithFunction1_10 {

	public static void printarray(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void incrementarray(int[] input) {
		int n=input.length;
		for(int i=0;i<n;i++) {
			input[i]=input[i]+1;
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
//		array stored two thing first is reference and second is size of array
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		incrementarray(arr);
		printarray(arr);
	}

}
