package OOPS2;

public class ExceptionHandling2 {
	
	public static int fact(int n)throws Exception2 {
		if(n<0) {
			throw new Exception2();
		}
		
		int ans=1;
		for(int i=1;i<=n;i++) {
			ans*=i;
		}
		return ans;
	}
	
	public static void main(String[] args) {
		try {
			System.out.println(fact(-2));
			System.out.println("Within Try");
		} catch (Exception2 e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("Negative Number Exception");
		}
		System.out.println("Main1");
		
		
		System.out.println();
		System.out.println();
		try {
			System.out.println(fact(10));
			System.out.println("Within Try");
		} catch (Exception2 e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("Negative Number Exception");
		}
		
		
//		Genric Execption
		try {
			System.out.println(fact(-1));
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("Genric Exception");
		}
	}
}
