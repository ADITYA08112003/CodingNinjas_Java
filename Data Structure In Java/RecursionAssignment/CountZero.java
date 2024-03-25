package RecursionAssignment;

import java.util.Scanner;

public class CountZero {

//	Process1
//	Time Complexity:O(logN)
//	Space Complexity:O(logN)
	public static int CountofZero1(int n) {
		if(n==0) {
			return 1;
		}
		if(n<10) {
			return 0;
		}
		int c=0;
		if(n%10==0) {
			c++;
		}
		return c+CountofZero1(n/10);
	}
//	Process2
//	Time Complexity:O(logN)
//	Space Complexity:O(logN)
	public static int CountofZero2(int n) {
		if(n<10) {
			if(n==0) {
				return 1;
			}
			else {
				return 0;
			}
		}
		if(n%10==0) {
			return 1+CountofZero2(n/10);
		}
		else {
			return CountofZero2(n/10);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println("Process1:");
		System.out.println(CountofZero1(n));
		System.out.println();
		System.out.println("Process2:");
		System.out.println(CountofZero2(n));
	}

}
