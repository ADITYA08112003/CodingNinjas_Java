// package SearchingAndSorting;

import java.util.Scanner;

public class FindClosestIndex_3 {
    public static int FindClosestIndex(int arr[],int left,int right,int target){
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return left-1;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("Target:");
        int target=s.nextInt();
        int val=FindClosestIndex(arr,0,n-1,target);
        System.out.println("Ans:"+val);
    }
}
