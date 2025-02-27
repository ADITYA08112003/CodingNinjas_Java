import java.util.Scanner;

public class FindUnique_19 {
    
    public static int FindUnique1(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length;j++){
                if(i!=j && arr[i]==arr[j]){
                    break;
                }
                if(j==arr.length-1){
                    return arr[i];
                }
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
        System.out.println("Process1:"+FindUnique1(arr));
    }
}
