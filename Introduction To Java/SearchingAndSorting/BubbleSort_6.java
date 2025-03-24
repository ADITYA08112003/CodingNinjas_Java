// package SearchingAndSorting;
import java.util.Scanner;
public class BubbleSort_6 {

	public static void printarray(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void bubblesort(int[] arr, int n) {
        //Your code goes here
        for(int i=0;i<n-1;i++){
			// n-1 Rounds
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }

        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("enter the size of array::");
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("arr["+i+"]::");
			arr[i]=s.nextInt();
		}
		bubblesort(arr,n);
		printarray(arr);
	}

}
