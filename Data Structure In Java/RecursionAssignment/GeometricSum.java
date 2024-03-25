package RecursionAssignment;

import java.util.Scanner;

public class GeometricSum {
	public static double GeoSum(int n) {
		if(n==0) {
			return 1;
		}
		double p=GeoSum(n-1);
		double val=1/Math.pow(2, n);
		return p+val;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(GeoSum(n));
	}

}
