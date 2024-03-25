package ConditionalAndLoops;

import java.util.Scanner;

public class Loop {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n) {
			System.out.println("Hello");
			i++;
		}
//		Print N Natural Number
		int j=1;
		while(j<=n) {
			System.out.println(j);
			j++;
		}
//		While(Condition); is not executed a while loops
		while(10==10);
	}
}
