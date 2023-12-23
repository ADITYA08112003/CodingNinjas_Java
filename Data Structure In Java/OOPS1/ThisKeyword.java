package OOPS1;

//part1
class This1{
	public String name;
	private int rollNumber;
	
	public int getRollNumber() {
		return rollNumber;
	}
	
//	below code give default value of rollNumber due to local variable is to be same as object.variable
//	mean that rollNumber = rollNumber
//	public void setRollNumber(int rollNumber) {
//		if(rollNumber<=0) {
//			return;
//		}
//		rollNumber=rollNumber;
//	}
	public void setRollNumber(int num) {
		if(num<=0) {
			return;
		}
		rollNumber=num;
	}
}

//part2

class This2{
	public String name;
	private int rollNumber;
	
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		if(rollNumber<=0) {
			return;
		}
		System.out.println("this keyword:"+this); //this keyword is also give a reference of object
		this.rollNumber=rollNumber;
//		this.rollNumber is reference to current object
	}
}
public class ThisKeyword {
	public static void main(String[] args) {
//		part1
		This1 s1=new This1();
		s1.name="aditya";
		System.out.println(s1);
		s1.setRollNumber(100);
		System.out.println(s1.name+" "+s1.getRollNumber());
		
//		part2
		This2 s2=new This2();
		s2.name="aditya";
		System.out.println("s1::"+s2);// this and s1 have same reference
		s2.setRollNumber(100);
		System.out.println(s2.name+" "+s2.getRollNumber());
		
		
		This2 s3=new This2();
		System.out.println("s2::"+s3);// s2 and this have same reference but different than s1
		s3.setRollNumber(18);
	}
}
