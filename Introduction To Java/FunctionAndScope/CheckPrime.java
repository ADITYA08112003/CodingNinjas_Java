package FunctionAndScope;
import java.util.Scanner;
public class CheckPrime {
	//check number is prime or not
//	Part1
		public static boolean isPrime1(int n) {
			boolean flag=true;
			int i=2;
			for(;i<=n/2;i++) {
				if(n%2==0) {
					flag=false;
					break;
				}
			}
			if(flag) {
				return true;
			}
			else {
				return false;
			}
		}
//		Part2
	 public static boolean isPrime2(int x)
	 {
	     for(int i=2;i<x/2;i++)
	     {
	         if(x%i==0)
	         return false;
	     }
	     return true;

	 }
	 public static void main (String[] args) {
		 Scanner s=new Scanner(System.in);
		 int n=s.nextInt();
//		 Part1
	     System.out.print("Part1::\n");
		 System.out.println(isPrime1(n));
//		 Part2
		 System.out.print("\nPart2::\n");
		 System.out.println(isPrime2(n));
		 
	     
	 }

}
