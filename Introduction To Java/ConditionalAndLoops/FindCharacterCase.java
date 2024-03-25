package ConditionalAndLoops;

import java.util.Scanner;

public class FindCharacterCase {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char c=s.next().charAt(0);
//		1st Way
		
		int val=c;
//		'A'=65 'Z'=90 'a'=97 'z'=122
		if(val>=65 && val<=90) {
			System.out.println("1");
		}
		else if(val>=97 && val<=122) {
			System.out.println("0");
		}
		else {
			System.out.println("-1");
		}
		
//		2nd Way
		
		if(c>='A' && c<='Z') {
			System.out.println("1");
		}
		else if(c>='a' && c<='z') {
			System.out.println("0");
		}
		else {
			System.out.println("-1");
		}
	}
}
