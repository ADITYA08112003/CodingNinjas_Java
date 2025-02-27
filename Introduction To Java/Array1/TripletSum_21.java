import java.util.Scanner;

public class TripletSum_21 {
    public static int TripletSum(int arr[],int target){
        int n=arr.length;
        int count=0;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.print("Enter the Target Value:");
        int target=s.nextInt();
        System.out.println(TripletSum(arr,target));
    }
    
}
