package ConditionalAndLoops;

import java.util.Scanner;

public class RemarkStudent {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n>75 && n<=100) {
			System.out.println("Distinction");
		}
		else if(n>50 && n<=75) {
			System.out.println("Average");
		}
		else if(n>35 && n<=50) {
			System.out.println("Below Average");
		}
		else {
			System.out.println("Falied");
		}
	}
}
