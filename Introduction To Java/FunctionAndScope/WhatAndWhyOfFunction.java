package FunctionAndScope;
import java.util.Scanner;
public class WhatAndWhyOfFunction {

public static int factorial(int num) {
	int fact=1;
	for(int j=1;j<=num;j++) {
		fact*=j;
	}
	return fact;
}



	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int r=s.nextInt();
		int factN=factorial(n);
		int factR=factorial(r);
		int factNR=factorial(n-r);
		int result=factN/(factR*factNR);
		System.out.println(result);
	}

}
