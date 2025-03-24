// package SearchingAndSorting;
import java.util.Scanner;
public class BinarySearch_2 {
	
	public static int binarysearch(int[] arr,int target) {
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(arr[mid]>target) {
				end=mid-1;
			}
			else if(arr[mid]<target) {
				start=mid+1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("size of array is::");
		int n=s.nextInt();
		int[] arr=new int[n];
		System.out.println("array is sorted ::");
		for(int i=0;i<n;i++) {
			System.out.print("arr["+i+"]::");
			arr[i]=s.nextInt();
		}
		System.out.print("target element in array is::");
		int target=s.nextInt();
		int index=binarysearch(arr,target);
		System.out.println("index is::"+index);
	}

}
