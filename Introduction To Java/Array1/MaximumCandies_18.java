import java.util.Scanner;

public class MaximumCandies_18 {
    public static boolean[] MaximumCandies(int arr[],int n,int val){
        int max=arr[0];
        for(int i=1;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        boolean ans[]=new boolean[n];
        for(int i=0;i<n;i++){
            if(arr[i]+val>max){
                ans[i]=true;
            }
            else{
                ans[i]=false;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.print("Enter the Extra Candies:");
        int val=s.nextInt();
        boolean ans[]=MaximumCandies(arr,n,val);
        for(boolean I:ans){
            System.out.print(I+" ");
        }
    }
}
