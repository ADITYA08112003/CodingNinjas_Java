package FunctionAndScope;
import java.util.Scanner;
public class WritingMoreFunction {
//Part1
	public static int sum(int a,int b) {
		int ans=a+b;
		return ans;
	}
//	Part2
	public static double sum(int a,int b,double c) {
		double ans=a+b+c;
		return ans;
	}
//	Part3
	public static void printevenNum() {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=2;i<=n;i+=2) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
//	Part4
	public static void printeven(int start,int end) {
		if(start%2!=0) {
			start++;
		}
		for(int i=start;i<=end;i+=2) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
//		Part1
		System.out.println("Part1:");
		int ans=sum(a,b);
		System.out.println(ans);
//		Part2
		System.out.println("Part2:");
		int n=s.nextInt();
		int n1=s.nextInt();
		double ans1=sum(n,n1,100.3);
		System.out.println(ans1);
//		Part3
		System.out.println("Part3:");
		printevenNum();
//		Part4
		System.out.println("Part4:");
		int start=s.nextInt();
		int end=s.nextInt();
		printeven(start,end);

	}

}
