// package SearchingAndSorting;

import java.util.Scanner;

public class FindKthSmallest_7 {
    public static int FindKthSmallest(int arr[],int k){
        for(int i=0;i<k;i++){
            int min=Integer.MAX_VALUE;
            int mi=-1;
            for(int j=i;j<arr.length;j++){
                if(min>arr[j]){
                    min=arr[j];
                    mi=j;
                }
            }
            int temp=arr[mi];
            arr[mi]=arr[i];
            arr[i]=temp;
        }
        return arr[k-1];
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.print("Enter the K for Kth Smallest Element:");
        int k=s.nextInt();
        System.out.println(FindKthSmallest(arr,k));
    }
}
