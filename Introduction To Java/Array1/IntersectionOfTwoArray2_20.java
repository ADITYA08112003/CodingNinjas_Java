import java.util.Scanner;

public class IntersectionOfTwoArray2_20 {
    public static void IntersectionOfTwoArray2(int arr1[],int arr2[]){
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    arr2[j]=Integer.MIN_VALUE;
                    System.out.print(arr1[i]+" ");
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Size of Array1:");
        int n=s.nextInt();
        System.out.print("Enter the Array1:");
        int arr1[]=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=s.nextInt();
        }
        System.out.print("Enter the Size of Array2:");
        int m=s.nextInt();
        System.out.print("Enter the Array2:");
        int arr2[]=new int[m];
        for(int i=0;i<m;i++){
            arr2[i]=s.nextInt();
        }
        IntersectionOfTwoArray2(arr1,arr2);
    }
}
