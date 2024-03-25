package ConditionalAndLoops;

public class ScopeOfVariable {
	public static void main(String[] args) {
//		Scope of variable 'a' is line 6 2nd last curly bracket
		int a=10;
//		int a=100; is not allowwed
//		double a=10.12; is also not allowd
		System.out.println(a);
		a=100;// only updated the created 'a'ariable
		
		if(a>=100) {
//			Scope of variable 'b' is only in if statement
			int b=8;
			System.out.println(b);
			int c=12;
			System.out.println(c);
		}
		else {
//			Scope of variable 'c' is only in else statement
			int c=232;
			System.out.println(c);
			int b=10;
			System.out.println(b);
		}
//		System.out.println(b);
//		System.out.println(c);
		System.out.println(a);
		
		int b1=10;
		while(b1<=15) {
			int j=10;
			System.out.println(j);
			b1++;
			j++;
		}
		System.out.println(b1);
//		System.out.println(j);  scope of j in only while loop not outside the while loop
		
		int k1=100;
		int k2=200;
		while(k1<=104) {
			
			k1++;
			k2++;
		}
		System.out.println(k1);
		System.out.println(k2);
		
	}
}
