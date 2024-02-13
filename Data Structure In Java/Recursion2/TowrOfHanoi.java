package Recursion2;

import java.util.Scanner;

public class TowrOfHanoi {
	public static void TOH(int disks,char Source,char Auxiliary,char Destination) {
		if(disks==0) {
			return ;
		}
		TOH(disks-1, Source, Destination, Auxiliary);
		System.out.println(Source+"->"+Destination);
		TOH(disks-1, Auxiliary, Source, Destination);
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		TOH(n,'A','B','C');
	}
}
