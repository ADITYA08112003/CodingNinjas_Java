// package SearchingAndSorting;

import java.util.Scanner;

public class FindSquareRoot_11 {
    // Time Complexity:O(N)
    // Space Complexity:O(1)
    public static int FindSquareRoot1(long n){
        long k=0;
        int i=0;
        while(i>=0){
            long val=k*k;
            if(val>n){
                return i-1;
            }
            k++;
            i++;
        }
        return -1;
    }
    // Time Complexity:O(logN)
    // Space Complexity:O(1)
    public static int FindSquareRoot2(long N){
        if(N==0 || N==1){
            return (int)N;
        }
        long i=2,j=N;
        while(i<j){
            long mid =(i+j)/2;
            if(mid <= (N/mid)){
                i=mid+1;
            }
            else{
                j=mid;
            }
        }
        return (int)i-1;
    }
    public static int FindSquareRoot3(long N){
        int val=(int)Math.sqrt(N);
        return val;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        long n=s.nextLong();
        System.out.println(FindSquareRoot1(n));
        System.out.println(FindSquareRoot2(n));
        System.out.println(FindSquareRoot3(n));
    }
}
