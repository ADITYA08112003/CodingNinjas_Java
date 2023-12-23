package OOPS2;

public class ExceptionHandling1 {
//	3
	
	public static int divide(int a,int b) throws Exception1 {
		if(b==0) {
			throw new Exception1();
		}
		return a/b;
	}
	
	public static void main(String[] args) {
		try {
			divide(10,0);
			System.out.println("Within Try");
		} catch (Exception1 e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("Divide by zero exception raised ");
		}
		System.out.println("Main1");
		System.out.println();
		System.err.println();
		
		try {
			divide(10,5);
			System.out.println("Within Try");
		} catch (Exception1 e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("Divide by zero exception raised ");
			
		}
		System.out.println("Main2");
	}
	
	
	
	
//	1
//	public static int divide(int a,int b) {
//		if(b==0) {
//			throw new ArithmeticException();
//		}
//		return a/b;
//	}
	
//	1
//	public static void main(String[] args)  {
//
//		
////		This is runtime error because String is null 
////		String s=null;
////		System.out.println(s.length());
//		
////		System.out.println(4/0); This is runtime error 
////		all these are exception 
//		
//		divide(10,0);
		
//	}
	
//	2
//	public static int divide(int a,int b) throws Exception1 {
//		if(b==0) {
//			throw new Exception1();
//		}
//		return a/b;
//	}
	
	

//	2
//	public static void main(String[] args) throws Exception1 {
//		divide(10,0);
//	}
	
}
