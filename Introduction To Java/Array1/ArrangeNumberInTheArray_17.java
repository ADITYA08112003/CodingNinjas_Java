import java.util.Scanner;

public class ArrangeNumberInTheArray_17 {
    // Process1
    public static void ArrangeNumberInTheArray1(int arr[],int n){
        int st=0,end=n-1,val=1;
        while(st<=end){
            if(val%2!=0){
                arr[st++]=val++;
            }
            else{
                arr[end--]=val++;
            }
        }
    }
    // Process2
    public static void ArrangeNumberInTheArray2(int arr[],int n){
        int low=0,high=n-1,ele=1;
        while(low<high){
            arr[low++]=ele++;
            arr[high--]=ele++;
            if(n%2!=0){
                arr[low]=ele;
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
        ArrangeNumberInTheArray1(arr,n);
        System.out.println("Process1:");
        Print(arr);
        System.out.println();
        int arr1[]=new int[n];
        ArrangeNumberInTheArray2(arr1, n);
        System.out.println("Process2:");
        Print(arr1);
    }
}
