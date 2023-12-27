package Recursion1;

import java.util.Scanner;

public class SumOfArray {
	
//	process1
//	Recursive method
//	Time Complexity:O(N)
//	Space Complexity:O(N)
	 public static int SumArray1(int[] arr, int n) {
	        if (n == 0) {
	            return 0;
	        }
	        return arr[n-1] + SumArray1(arr, n-1);
	 }
	 
//	 process2
	 public static int SumArray2(int []arr) {
		 if(arr.length==0) {
			 return 0;
		 }
		 int smallArr[]=new int[arr.length-1];
		 for(int i=1;i<arr.length;i++) {
			 smallArr[i-1]=arr[i];
		 }
		 int smallAns=arr[0]+SumArray2(smallArr);
		 return smallAns;
	 }
	 
//	 process3
//	 Time Complexity:O(N)
//	 Space Complexity:O(1)
	 public static int SumArray3(int[] arr) {
		 int sum=0;
		 for(int j : arr) {
			 sum+=j;
		 }
		 return sum;
	 }

	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(System.in);
	      int n=s.nextInt();
	      int arr[]=new int[n];
	      for(int i=0;i<n;i++) {
	    	  arr[i]=s.nextInt();
	      }
	     
	      System.out.println("Sum of Array by process1 :" + SumArray1(arr, n));
	      System.out.println("Sum of Array by process2 :"+SumArray2(arr));
	      System.out.println("Sum of Array by process3 :"+SumArray3(arr));
	 }
		
}


