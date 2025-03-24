// package SearchingAndSorting;

import java.util.Scanner;

public class InsertionSort_8 {
    public static void Print(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void InsertionSort(int arr[],int n){
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        InsertionSort(arr,n);
        Print(arr);
    }
    
}
