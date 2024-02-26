package HowIsDataStored;

public class TypeCasting {
	public static void main(String[] args) {
//		convert char tot int directly
		char ch='a';
		int i=ch;
		System.out.println(i);
//		Not convert int to char directly
//		ch=i
		
//		Convert int to char by (char)
		ch=(char)i;
		System.out.println(ch);
//		ch=ch+1; is invalid because ch+1 is give integer but LHS is char
		ch=(char)(ch+1);
		System.out.println(ch);
		
//		convert short to int
		short s=18;
		int k=s;
		System.out.println(k);
//		short a=k; is incorrect because larger data size is not change directly in smaller data size
//		convert int to short 
		short s1=(short)(k);
		System.out.println(s1);
		
//		int a2=10.7; is incorrect because 10.7 is double 
		int a2=(int)10.7;
		System.out.println(a2);
		
//		float f1=10.7; is incorrect because 10.7 is double of size 8 bytes and LHS is float of size 4 bytes
		float f1=10.7f;
		float f2=(float)10.7;
		System.out.println(f1+" "+f2);
		
		System.out.println(5+5);//int+int=int
		System.out.println(4.2+7);//double+int=double
		System.out.println(6.3+4.6);//double+double=double
		System.out.println(5/12);//int/int=int
		System.out.println((double)23/64);//double
		System.out.println(23.4/87);//double/int=double
	}
}
