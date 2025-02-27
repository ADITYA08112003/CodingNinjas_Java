import java.util.Scanner;

public class SwapAlternate_16 {
    public static int[] SwapAlternate(int arr[]){
        for(int i=0;i<arr.length-1;i+=2){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int ans[]=SwapAlternate(arr);
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}
