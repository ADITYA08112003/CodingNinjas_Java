package OOPS3;
//part1
class Vehicl1{
	int maxspeed;
	String company;
	public Vehicl1(int maxspeed, String company) {
		super();
		this.maxspeed = maxspeed;
		this.company = company;
	}
//	vehicl1 method
	public void print() {
		System.out.println(maxspeed+" "+company);
	}
	
}
//part2
interface printInterface{
	void print1();
}

//part2
class Vehicl2 implements printInterface{
	int maxspeed;
	String company;
	public Vehicl2(int maxspeed, String company) {
		super();
		this.maxspeed = maxspeed;
		this.company = company;
	}
//	vehicl2 method
	public void print1() {
		System.out.println(maxspeed+" "+company);
	}
	
}

//part3
class Studen implements printInterface{
	int rollNumber;

	public Studen(int rollNumber) {
//		super();
		this.rollNumber = rollNumber;
	}

	@Override
	public void print1() {
		System.out.println(rollNumber);
		
	}
	
}

public class BoundedGeneric {
//	part1
	public static <T extends Vehicl1>  void printArray(T arr[]) {
		for(int i=0;i<arr.length;i++) {
			arr[i].print();
		}
	}
//	part2
	public static <T extends printInterface> void PrintArray(T arr[]) {
		for(int i=0;i<arr.length;i++) {
			arr[i].print1();
		}
	}
	
	public static void main(String[] args) {
		
//		part1
		System.out.println("Part1");
		Vehicl1 v[]=new Vehicl1[5];
		for(int i=0;i<v.length;i++) {
			v[i]=new Vehicl1(10*i,"aditya");
		}
		printArray(v);
		System.out.println();
		
//		Part2
		System.out.println("Part2");
		Vehicl2 v1[]=new Vehicl2[5];
		for(int i=0;i<v1.length;i++) {
			v1[i]=new Vehicl2(10*i,"aditya");
		}
		PrintArray(v1);
		System.out.println();
		
//		part3
		System.out.println("Part3");
		Studen s[]=new Studen[5];
		for(int i=0;i<s.length;i++) {
			s[i]=new Studen(10*i+1);
		}
		PrintArray(s);
		
	}
}
