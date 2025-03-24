// package SearchingAndSorting;
import java.util.*;
import java.util.Scanner;

public class SecondLargestInArray_13 {
    public static int SecondLargestInArray1(int arr[],int n){
        int i,first=Integer.MIN_VALUE,second=Integer.MIN_VALUE;
        for(i=0;i<n;i++){
            first=Math.max(arr[i],first);
        }
        for(i=0;i<n;i++){
            if(arr[i]!=first){
                second=Math.max(second,arr[i]);
            }
        }
        if(second==Integer.MIN_VALUE){
            return -1;
        }
        else{
            return second;
        }
    }
    public static int SecondLargestInArray2(int arr[],int n){
        Arrays.sort(arr);
        for(int i=n-2;i>=0;i--){
            if(arr[i]!=arr[i+1]){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println(SecondLargestInArray1(arr,n));
        System.out.println(SecondLargestInArray2(arr,n));
    }
}
