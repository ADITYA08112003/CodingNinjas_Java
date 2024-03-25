package RecursionAssignment;

import java.util.Scanner;

public class StairCase {
//	Time Complexity:O(3^N)
//	Space Complexity:O(N)
//	where N is Size of Input Array
	public static int Staircase(int n) {
		if(n<0) {
			return 0;
		}
		if(n==0) {
			return 1;
		}
		return Staircase(n-1)+Staircase(n-2)+Staircase(n-3);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(Staircase(n));
	}
}
