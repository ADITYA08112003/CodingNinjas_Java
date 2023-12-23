package OOPS1;

//Part1
class FunctionClass1 {
	private int numerator;
	private int denominator;
	
	public FunctionClass1(int numerator,int denominator) {
		this.numerator=numerator;
		this.denominator=denominator;
		Simplify();
	}
//	private void Simplify() {
//		int gcd=1;
//		int smaller=Math.min(numerator, denominator);
//		for(int i=2;i<=Smaller;i++) {
//			if(numerator%i==0 && denominator%i==0) {
//				gcd=i;
//				break;
//			}
//		}
//		numerator=numerator/gcd;
//		denominator=denominator/gcd;
//		
//	}

	private void Simplify() {
		int gcd=1;
		int smaller=Math.min(numerator, denominator);
		for(int i=smaller;i>=2;i--) {
			if(numerator%i==0 && denominator%i==0) {
				gcd=i;
				break;
			}
		}
		numerator=numerator/gcd;
		denominator=denominator/gcd;
		
	}
	public void Increment() {
		numerator=numerator+denominator;
		Simplify();
	}

	public void print() {
		System.out.println(numerator+"/"+denominator);
		
	}
}

//Part2
class FunctionClass2 {
	private int numerator;
	private int denominator;
	
	public FunctionClass2(int numerator,int denominator) {
		if(denominator==0) {
			denominator=1;
		}
		this.numerator=numerator;
		this.denominator=denominator;
		simplify();// this is used to simplify the fraction
	}
	
	public void setNumerator(int num) {
		this.numerator=num;
		simplify();
	}

	public int getNumerator() {
		return numerator;
	}
	public void setDenominator(int num) {
		if(num==0) {
			return;
		}
		this.denominator=num;
		simplify();
	}
	public int getDenominator() {
		return denominator;
	}
	private void simplify() {
		int gcd=1;
		int smaller=Math.min(numerator, denominator);
			for(int i=1;i<=smaller;i++) {
				if(numerator%i==0 && denominator%i==0) {
					gcd=i;
					
				}
			}
			numerator=numerator/gcd;
			denominator=denominator/gcd;
		}

	public void print() {
		// TODO Auto-generated method stub
		System.out.println(numerator+"/"+denominator);
	}
	
}

public class FunctionCLassMethod1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Part1
		System.out.println("Part1:");
		FunctionClass1 f1=new FunctionClass1(8,28);
		f1.print();
		f1.Increment();// Increment is used to +1 add to fraction
		f1.print();
		System.out.println();
		
		System.out.println("Part2:");
		FunctionClass2 f2=new FunctionClass2(12,34);
		f2.print();// print value of 12/34 is 6/17
		
//		change the numerator value
		f2.setNumerator(18);
		f2.getNumerator();
		f2.print();
		
//		change the denominator value
		f2.setDenominator(12);
		f2.getDenominator();
		f2.print();
		
	}

}