package Array1;
import java.util.Scanner;
public class FindingLargestElement_5 {

	public static int largestofnum(int[] arr) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			
		}
		return max;
	}
	public static int[] takeinput() {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the "+i+"th element");
			arr[i]=s.nextInt();
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=takeinput();
		int result=largestofnum(arr);
		System.out.print("largest number in array is:");
		System.out.println(result);
	}

}
