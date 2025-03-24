// package SearchingAndSorting;

import java.util.Scanner;

public class FindInversionUsingSelectionSort_5 {
    public static int FindInversionUsingSelectionSort(int arr[],int n){
        int sum=0;
        for(int i=0;i<n-1;i++){
            int min=Integer.MAX_VALUE;
            int mi=-1;
            for(int j=i;j<n;j++){
                if(min>arr[j]){
                    min=arr[j];
                    mi=j;
                }
            }
            sum+=mi-i;
            int temp=arr[mi];
            arr[mi]=arr[i];
            arr[i]=temp;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println(FindInversionUsingSelectionSort(arr,n));
    }
}
