package ConditionalAndLoops;

import java.util.Scanner;

public class FaharenheitToCelsius {
//	Time Complexity:O(N)
//	Space Complexity:O(1)
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
//		(f-32)/9=c/5
		int start=s.nextInt();
		int end=s.nextInt();
		int step=s.nextInt();
		while(start<=end) {
			int val=(start-32)*5/9;
			System.out.println(start+" "+val);
			start+=step;
		}
	}
}
