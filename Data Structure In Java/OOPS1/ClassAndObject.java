package OOPS1;
// 1

class Student {

	String name;
	int rollNumber;

}
public class ClassAndObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner s=new Scanner(Source);
		Student s1=new Student();// s1,s2 are the object and student() are class
		Student s2=new Student();
		System.out.println(s1);// s1 give address which is package.class@address
		System.out.println(s2);// s1,s2 are stored in stack and class are stored in heap memory
		
		System.out.println(s1.name+ " "+s1.rollNumber); // s1.name give null because name is String(non-primitive datatype)  and s1.rollNumber give 0 because rollnumber is integer(primitive datatype)
		System.out.println(s2.name+" "+s2.rollNumber);
		
		s1.name="Aditya Raj";
		s1.rollNumber=10;
		s2.name="Shitanshu";
		s2.rollNumber=23;
		System.out.println(s1.name+" "+s1.rollNumber);
		System.out.println(s2.name+" "+s2.rollNumber);

	}

}
