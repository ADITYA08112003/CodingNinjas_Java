package OOPS1;

class FunctionClass3 {
	private int numerator;
	private int denominator;
	
	public FunctionClass3(int numerator,int denominator) {
		if(denominator==0) {
			denominator=1;
		}
		this.numerator=numerator;
		this.denominator=denominator;
		simplify();
	}
	public void simplify() {
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
		System.out.println(numerator+"/"+denominator);
	}
	
	public void add(FunctionClass3 f2) {
//		First fraction is the fraction on which function is called
//		Second fraction is passed as argumnet
		
		this.numerator=this.numerator*f2.denominator+this.denominator*f2.numerator;
		this.denominator=this.denominator*f2.denominator;
		simplify();
	}
	
	public static FunctionClass3 add(FunctionClass3 f1,FunctionClass3 f2) {
		int NewNum=f1.denominator*f2.numerator+f1.numerator*f2.denominator;
		int NewDeno=f1.denominator*f2.denominator;
		FunctionClass3 f3=new FunctionClass3(NewNum,NewDeno);
		return f3;
	}
}



public class FunctionCLassMethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionClass3 f1=new FunctionClass3(12,40);
		f1.print();
//		add the f1 and f2 in simplify form and add in f1
		FunctionClass3 f2=new FunctionClass3(24,84);
		f1.add(f2);
		f1.print();
		
//		add f1 and f2 in f3 
		FunctionClass3 f3=FunctionClass3.add(f1,f2);
		f3.print();
	}

}