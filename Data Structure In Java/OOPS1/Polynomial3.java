package OOPS1;

import java.util.Scanner;

class Polynomial11{
	int degCoeff[];
	
	public Polynomial11() {
		degCoeff=new int[10];
	}
	public void setCoefficient(int degree,int coeff) {
		if(degree > degCoeff.length-1) {
//			create a new array with size=degree+1
			int temp[]=degCoeff;
			degCoeff=new int[degree+1];
//			copy value from temp to degcoeff
			for(int i=0;i<temp.length;i++) {
				degCoeff[i]=temp[i];
			}
		}
		degCoeff[degree]=coeff;
	}
//	print all the terms (Only terms with non zero coefficients are to be printed) in increasing order of degree
	public void print() {
		for(int i=0;i<degCoeff.length;i++) {
			if(degCoeff[i]!=0) {
				System.out.print(degCoeff[i]+"x"+i+" ");
			}
		}
	}
	
//	Add two polynomoials and returns  a new polynomials which has result
	public Polynomial11 add(Polynomial11 p) {
		Polynomial11 ans=new Polynomial11();
		int plen1=this.degCoeff.length;
		int plen2=p.degCoeff.length;
		int len=Math.min(plen1,plen2);
		int i;
		for(i=0;i<len;i++) {
			ans.setCoefficient(i, this.degCoeff[i]+p.degCoeff[i]);
		}
		while(i<plen1) {
			ans.setCoefficient(i, this.degCoeff[i]);
			i++;
		}
		while(i<plen2) {
			ans.setCoefficient(i, p.degCoeff[i]);
			i++;
		}
		return ans;
	}
//	Subtracts two polynomials and returns  a new polynomials which has result
	public Polynomial11 subtract(Polynomial11 p) {
		Polynomial11 ans=new Polynomial11();
		int plen1=this.degCoeff.length;
		int plen2=p.degCoeff.length;
		int len=Math.min(plen1,plen2);
		int i;
		for(i=0;i<len;i++) {
			ans.setCoefficient(i, this.degCoeff[i]-p.degCoeff[i]);
		}
		while(i<plen1) {
			ans.setCoefficient(i, this.degCoeff[i]);
			i++;
		}
		while(i<plen2) {
			ans.setCoefficient(i, -p.degCoeff[i]);
			i++;
		}
		return ans;
	}
	
	public int getCoeff(int degree) {
		if(degree < this.degCoeff.length) {
			return degCoeff[degree];
		}
		else {
			return 0;
		}
	}
	
//	Multiply two polynomial and returns  a new Polynomial which has result
	public Polynomial11 multiply(Polynomial11 p) {
		Polynomial11 ans=new Polynomial11();
		for(int i=0;i<this.degCoeff.length;i++) {
			for(int j=0;j<p.degCoeff.length;j++) {
				int termdeg=i+j;
				int termCoeff=this.degCoeff[i]*p.degCoeff[j];
				int oldCoeff=ans.getCoeff(termdeg);
				ans.setCoefficient(termdeg,termCoeff + oldCoeff);
			}
		}
		return ans;
	}
	
}


public class Polynomial3 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			int degree1[] = new int[n];
			for(int i = 0; i < n; i++){
				degree1[i] = s.nextInt();
			}
			int coeff1[] = new int[n];
			for(int i = 0; i < n; i++){
				coeff1[i] = s.nextInt();
			}
			Polynomial first = new Polynomial();
			for(int i = 0; i < n; i++){
				first.setCoefficient(degree1[i],coeff1[i]);
			}
			n = s.nextInt();
			int degree2[] = new int[n];
			for(int i = 0; i < n; i++){
				degree2[i] = s.nextInt();
			}
			 int coeff2[] = new int[n];
			for(int i = 0; i < n; i++){
				coeff2[i] = s.nextInt();
			}
			Polynomial second = new Polynomial();
			for(int i = 0; i < n; i++){
				second.setCoefficient(degree2[i],coeff2[i]);
			}
			int choice = s.nextInt();
			Polynomial result;
			switch(choice){
			// Add
			case 1: 
				 result = first.add(second);
				result.print();
				break;
			// Subtract	
			case 2 :
				 result = first.subtract(second);
				result.print();
				break;
			// Multiply
			case 3 :
				 result = first.multiply(second);
				result.print();
				break;
			}

		}

	}