package OOPS1;

class FinalKeyword1 {
	String name;
//	initialised the final variables
	final double cgpa=8.2;
//	decalared the final variable
	final private int rollNumber;
//	rollNumber is always defined in Constructor
	
	public FinalKeyword1() {
		name="Aditya";
		rollNumber=2;
//		cgpa=393;
	}
	public FinalKeyword1(String name) {
		this.name=name;
		rollNumber=39;
//		cgpa=0.94;
	}
	public FinalKeyword1(String name,int rollNumber) {
		this.name=name;
		this.rollNumber=rollNumber;
//		cgpa=.784;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	
	
}

public class FinalKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("S1 :");
		FinalKeyword1 s1=new FinalKeyword1();
		System.out.println(s1);
		System.out.println(s1.name+" "+s1.getRollNumber()+" "+s1.cgpa);
//		s1.cgpa=19;
//		System.out.println(s1.cgpa);
		System.out.println();
		System.out.println("S2 :");
		FinalKeyword1 s2=new FinalKeyword1("Shitanshu");
//		s2.cgpa=.39;
		System.out.println(s2);
		System.out.println(s2.name+" "+s2.getRollNumber()+" "+s2.cgpa);
		System.out.println();
		
		System.out.println("S3 :");
		FinalKeyword1 s3=new FinalKeyword1("ADRAJ",36);
		System.out.println(s3);
		System.out.println(s3.name+" "+s3.getRollNumber()+" "+s3.cgpa);
		System.out.println();
	}

}
