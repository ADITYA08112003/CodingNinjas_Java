// package SearchingAndSorting;

import java.util.Scanner;

public class Sort012_12 {
    public static void swap(int arr[],int l,int h){
        int temp=arr[l];
        arr[l]=arr[h];
        arr[h]=temp;
    }
    public static void Sort(int arr[]){
        int i=0,nz=0,nt=arr.length-1;
        while(i<=nt){
            if(arr[i]==0){
                swap(arr,i,nz);
                i++;
                nz++;
            }
            else if(arr[i]==1){
                i++;
            }
            else{
                swap(arr,i,nt);
                nt--;
            }
        }
    }
    public static void Print(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        Sort(arr);
        Print(arr);
        
    }
}
