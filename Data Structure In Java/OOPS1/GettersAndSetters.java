package OOPS1;


//part1
class GetterSetterUse1{
	public String name;
	private int rollNumber; // rollNumber give 0
//	rollNumber is initalised then give initalised value 
	
	
	public int getrollNumber() {
		return rollNumber;
	}
}


//part2
class GetterSetterUse2 {
	public String name;
	private int rollNumber;
	
	public int getRollNumber() {
		
		return rollNumber;
	}
	public void setRollNumber(int num) {
		if(num<=0) {
			return;
		}
		rollNumber=num;
	}
}


public class GettersAndSetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		part1
		System.out.println("Part1::");
		GetterSetterUse1 s1=new GetterSetterUse1();
		s1.name="Aditya";
		System.out.println(s1);
		System.out.println(s1.name);
//		s1.getrollNumber give return rollNumber and in private rollnumber is not initalised then give 0 
		System.out.println(s1.getrollNumber());
		System.out.println();
		
		
//		part2
		System.out.println("Part2::");
		GetterSetterUse2 s2=new GetterSetterUse2();
		s2.name="Aditya";
		System.out.println(s2);
		System.out.println(s2.name);
		s2.setRollNumber(-100);
		System.out.println(s2.name+" "+s2.getRollNumber());
		s2.setRollNumber(100);
		System.out.println(s2.name+" "+s2.getRollNumber());
	}
}