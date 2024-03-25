package ConditionalAndLoops;

public class RelationalAndLogicalOperator {
	public static void main(String[] args) {
//		Relational Operator
		int a=10,b=10;
		System.out.println("Relational Operator::");
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		
//		Logical Operator
//		&& "And" || "Or" ! "Not"
		System.out.println("Logical Operator::");
		System.out.println(true && false);
		System.out.println(true || false);
		System.out.println(!true);
		System.out.println(!false);
		System.out.println(a>10 && b>10);
		System.out.println(a==10 && b==10);
		
//		Question
		int v1=10,v2=20;
		if((v2=100)==v1) {
			System.out.println(v2+100);
		}
		else {
			System.out.println(v2);
		}
	}
}
