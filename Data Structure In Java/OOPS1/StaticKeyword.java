package OOPS1;

//part1

class StaticKeyword1 {
	String name;
	final private int rollNumber;
	double cgpa;
	final static double CoversionFactor=0.95;
	static int numstudent;
	
	public StaticKeyword1(String name,int rollNumber) {
		this.name=name;
		this.rollNumber=rollNumber;
		numstudent++;
	}
	
}

//part2
class StaticKeyword2 {
	String name;
	final private int rollNumber;
	double cgpa;
	public static final double conversionfactor=0.87;
	private static int numstudent;
	
	public static int getNumstudent() {
//		System.out.println(rollNumber); this is non static variable then it is not used in static function
		return numstudent;		
	}
	public StaticKeyword2(String name) {
		this.name=name;
		numstudent++;
		this.rollNumber=numstudent;
	}
}


public class StaticKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		part1
		
		System.out.println("PART1::");
		System.out.println();
		System.out.println(StaticKeyword1.numstudent);// this is a correct way to excess a static variable
//		System.out.println(StaticKeyword1.name); this is non static variable
		System.out.println("S1 :");
		StaticKeyword1 s1=new StaticKeyword1("Aditya",100);
		System.out.println(s1.numstudent);
		System.out.println();
		System.out.println("S2 :");
		StaticKeyword1 s2=new StaticKeyword1("Shitanshu",8);
		System.out.println(s2.numstudent);// this is not correct way to excess a static variable
		System.out.println();
		System.out.println(StaticKeyword1.numstudent);// this is a correct way to excess a static variable
		
		StaticKeyword1.numstudent=10;
		System.out.println(s1.numstudent);
		System.out.println(StaticKeyword1.CoversionFactor);//this is default final static variable 
		
//		part2
		System.out.println("PART2::");
		System.out.println();
		System.out.println(StaticKeyword2.getNumstudent());
		System.out.println("S3 :");
		StaticKeyword2 s3=new StaticKeyword2("Aditya");
		System.out.println(s3.getNumstudent());
		System.out.println();
		
		System.out.println("S4:");
		StaticKeyword2 s4=new StaticKeyword2("Shitanshu");
		System.out.println(s4.getNumstudent());
	}

}