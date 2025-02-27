// package Array1;
import java.util.Scanner;
public class ArrayWithFunction_12 {

	public static void printarray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static int[] increment(int[] input) {
		int n=input.length;
		input=new int[n];
		for(int i=0;i<n;i++) {
			input[i]=input[i]+1;
		}
		return input;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		arr=increment(arr);
		printarray(arr);
	}

}
