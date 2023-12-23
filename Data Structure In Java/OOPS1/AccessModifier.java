package OOPS1;



class Modifier{
//	defaut access Modifier is accessible within same packages
	String name;
	int rollNumber;
	
	
//	private access modifier is accessible within same class
	private int rollNumber1;
	private String name1;
	
//	public Access Modifier is accessible within same and different packages
	public String name2;
	public int rollNumber2;
}

public class AccessModifier {
	public static void main(String[] args) {
		
//		default Access
		System.out.println("Default Access Modifier::");
		Modifier d1=new Modifier();
		Modifier d2=new Modifier();
		System.out.println(d1);
		System.out.println(d2);
		d1.name="Aditya";
		d2.name="Shitanshu";
		d1.rollNumber=19;
		d2.rollNumber=100;
		System.out.println(d1.name+" "+d1.rollNumber);
		System.out.println(d2.name+" "+d2.rollNumber);
		
		System.out.println();
		System.out.println();
		
//		private Access
		System.out.println("Private Access Modifier::");
		Modifier p1=new Modifier();
		Modifier p2=new Modifier();
		System.out.println(p1);
		System.out.println(p2);
		p1.name="Aditya";
//		s1.rollNumber=10; is not valid because rollNumber in class is private
		p2.name="Shitanshu";
//		s2.rollNumber=100; 
		System.out.println(p1.name);
		System.out.println(p2.name);

		System.out.println();
		System.out.println();
		
		
		
//		public Access
		System.out.println("Public Access Modifier::");
		Modifier s1=new Modifier();
		s1.name2="aditya";
		s1.rollNumber2=10;
		System.out.println(s1);
		System.out.println(s1.name2+" "+s1.rollNumber2);
	}
	
}
