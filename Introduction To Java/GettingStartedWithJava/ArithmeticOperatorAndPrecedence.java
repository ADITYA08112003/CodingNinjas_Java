package GettingStartedWithJava;

public class ArithmeticOperatorAndPrecedence {
	public static void main(String[] args) {
		int a=100;
		int b=3;
//		Adding +
		int add=a+b;
		System.out.println(add);
//		subtract -
		int sub=a-b;
		System.out.println(sub);
//		Multiplication *
		int mul=a*b;
		System.out.println(mul);
//		Division /
		int div=a/b;
		System.out.println(div);
//		Modulo %
		int mod=a%b;
		System.out.println(mod);
		
//		According to BODMAS
		System.out.println(3+2/5);//firstly solved 2/5=0 then 3+0=3
		System.out.println(3*2/5);//firstly 3*2=6 then 6/5=1
		System.out.println(10/2*3);//firstly 10/2=5 then 5*3=15
	}
}
