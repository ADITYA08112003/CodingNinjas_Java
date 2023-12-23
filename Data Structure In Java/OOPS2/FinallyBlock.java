package OOPS2;

public class FinallyBlock {
	public static int fact(int n)throws FinallyException {
		if(n<0) {
			throw new FinallyException();
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
		} catch (FinallyException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("Negative Number Exception");
		}
		finally {
			System.out.println("Finally Block is Exceuted as 1.");
		}
		System.out.println("Main1");
		
		
		System.out.println();
		System.out.println();
		try {
			System.out.println(fact(10));
			System.out.println("Within Try");
		} catch (FinallyException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("Negative Number Exception");
		}
		finally {
			System.out.println("Finally Block is Exceuted as 2.");
		}
	}
}
