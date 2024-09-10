package Test1Basic;

import java.util.Scanner;

//Time Complexity:O(minimum(x,y))
//Space Complexity:O(1)
public class GreatestCommonDivisor {
	public static void Process1(int x,int y) {
		int temp,gcd;
		while(y!=0) {
			temp=y;
			x=x%y;
			y=x;
			x=temp;
		}
		gcd=x;
		System.out.println(gcd);
	}
	public static void Pro1Helper(int x,int y) {
		int val=1;
		for(int i=y;i>0;i--) {
			if(x%i==0 && y%i==0) {
				val=i;
				break;
			}
		}
		System.out.println(val);
	}
	public static void Process2(int x,int y) {
		if(x>=y) {
			Pro1Helper(x,y);
		}
		else {
			Pro1Helper(y,x);
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++) {
			int x=s.nextInt();
			int y=s.nextInt();
			System.out.println("Process1:");
			Process1(x,y);
			System.out.println("Process2:");
			Process2(x,y);
			
		}
	}
}
