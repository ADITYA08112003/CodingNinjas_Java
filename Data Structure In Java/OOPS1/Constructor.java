package OOPS1;

//part1
class Constructor1 {
	public String name;
	private int rollNumber;
//	this is my first Constructor1 of type 2 argument Constructor
	public  Constructor1(String n,int num) {
		name=n;
		rollNumber=num;
	}
//	this is my second Constructor1 of type 1 argument Constructor
	public Constructor1(String n) {
		name=n;
//		rollNumber=10;  this is initialised the rollNumber
//		if rollNumber not to be initialised then give 0
	}
//	this is my third Constructor1 of type default Constructor
	public Constructor1() {
		name="Amrit raj";
		rollNumber=199;
	}
	public int getRollNumber() {
		return this.rollNumber;
	}
	public void print() {
		System.out.println(name+" "+rollNumber);
	}
}



//part2

class Constructor2 {
	public String name;
	private int rollNumber;
	
	public Constructor2(String name,int rollNumber) {
		this.name=name;
		this.rollNumber=rollNumber;
	}
	public void print() {
		System.out.println(name+" "+rollNumber);
	}
}


public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		part1
		System.out.println("Part1::");
		System.out.println();
		
		System.out.println("S1 property::");
		System.out.println();
		Constructor1 s1=new Constructor1("Aditya",100);
		System.out.println(s1);
		System.out.println(s1.name+ " "+s1.getRollNumber());
		System.out.println();
		
		System.out.println("S2 property::");
		System.out.println();
		Constructor1 s2=new Constructor1("Shitanshu",18);
		System.out.println(s2);
		System.out.println(s2.name+" "+s2.getRollNumber());
		System.out.println();
		
		System.out.println("S3 property::");
		System.out.println();
		Constructor1 s3=new Constructor1("Shitanshu");
		System.out.println(s3);
		System.out.println(s3.name);
		System.out.println();
		
		System.out.println("S4 property::");
		System.out.println();
		Constructor1 s4=new Constructor1();
		System.out.println(s4);
		System.out.println(s4.name+" "+s4.getRollNumber());
		System.out.println();
		System.out.println();
		s1.print();
		s2.print();
		s3.print();
		s4.print();
		
		System.out.println();
		System.out.println("S5 property::");
		Constructor1 s5=new Constructor1("Aditya",1000);
		s5.print();
		System.out.println();
		
//		part2
		System.out.println("Part2::");
		System.out.println();
		
		System.out.println("S11 propert::");
		Constructor2 s11=new Constructor2("Aditya",19);
		System.out.println(s11);
		s11.print();
	}

}