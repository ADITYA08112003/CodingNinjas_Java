// package SearchingAndSorting;
import java.util.*;
import java.util.Scanner;

public class FindPairWithSmallestDifference_14 {
    // Time Complexity:O(NlogN)
    // Space Complexity:O(1)
    public static int FindPairWithSmallestDifference(int arr1[],int n,int arr2[],int m){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i=0,j=0,min=Integer.MAX_VALUE;
        while(i<n && j<m){
            min=Math.min(min,Math.abs(arr1[i]-arr2[j]));
            if(arr1[i]<arr2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        return min;
    }
   public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=s.nextInt();
    }
    int m=s.nextInt();
    int arr1[]=new int[m];
    for(int i=0;i<m;i++){
        arr1[i]=s.nextInt();
    }
    System.out.println(FindPairWithSmallestDifference(arr,n,arr1,m));
   } 
}
