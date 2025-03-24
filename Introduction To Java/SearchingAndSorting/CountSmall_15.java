// package SearchingAndSorting;
import java.util.*;
import java.util.Scanner;

public class CountSmall_15 {
    public static int[] CountSmall(int a[],int b[],int n,int m){
        Arrays.sort(b);
        for(int i=0;i<n;i++){
            int low=0,high=m-1,count=0;
            while(low<=high){
                int mid=(low+high)/2;
                if(b[mid]<=a[i]){
                    count=mid+1;
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
            a[i]=count;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int m=s.nextInt();
        int b[]=new int[m];
        for(int j=0;j<m;j++){
            b[j]=s.nextInt();
        }
        CountSmall(a,b,n,m);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
