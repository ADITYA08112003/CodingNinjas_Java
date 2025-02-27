// package Array1;

public class ArrayOperation_1 {

	public static void main(String[] args) {
		int []arr=new int[5];
		arr[0]=12;
		arr[3]=23;
		System.out.println(arr[0]);
		System.out.println(arr[3]);
//		arr[-1]=18; are not allowed
//		arr[5]=10; are not allowed
		System.out.println(arr[1]);//default value=0
		System.out.println(arr[2]);//default value=0
		
		char []c=new char[10];
		double []d=new double[10];
		long []l=new long[10];
		String a[]=new String[10];
		System.out.println(c[0]+"\t"+d[0]+"\t"+l[0]+"\t"+a[0]);
	}

}
