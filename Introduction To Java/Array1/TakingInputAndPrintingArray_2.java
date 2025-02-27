// package Array1;
import java.util.Scanner;
public class TakingInputAndPrintingArray_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the "+i+"th index");
			arr[i]=s.nextInt();
		}
		System.out.println("array are print in row");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("array are print in columns");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
