package OOPS3;

//part1
class Vehicle3{
	
	final private String color;//this is final variable
	int maxspeed;

	public Vehicle3() {
		color="Red";
		System.out.println("Vehicle's Constructor");
		maxspeed=60;
	}
	
	public Vehicle3(int maxspeed) {
		color="Red";
		System.out.println("Vehicles Constructor");
		this.maxspeed=maxspeed;
	}
	
	public String getcolor() {
		return color;
	}
	public void setcolor(String color) {
//		this.color=color; this not assigned because final variable are uesd in color
	}
}

//part2
class Vehicle4{
//	this is used final method in print function
//	final public void print() {} are same as below
	public final void print() {
		System.out.println("Vehicle method");
	}
	public Vehicle4() {
		System.out.println("Vehicle4 Constructor");
	}
}
class Car2 extends Vehicle4{
//	this is due to final method is used in vehicle4 of print function then it is not overriding in car2 of print function
//	public void print() {
//		System.out.println("Car method");
//	}
	
	public Car2() {
		System.out.println("Car2 Constructor");
	}
}


//part3
//this is used final class in Vehicle5
final class Vehicle5{
	public Vehicle5() {
		System.out.println("Vehicle5 Constructor");
	}
}

//this is due to final class of Vehicle5 is uesd in Bike
//class Bike extends Vehicle5{
//	
//}

public class FinalKeyword {
	public static void main(String[] args) {
//		part1
//		final Variable
		System.out.println("Part1");
		Vehicle3 v=new Vehicle3();
		System.out.println();
		Vehicle3 v1=new Vehicle3(100);
		System.out.println();
		
//		part2
//		final method
		System.out.println("Part2");
		Vehicle4 v2=new Vehicle4();
		v2.print();
		Car2 c1=new Car2();
		System.out.println();
		
//		part3
//		final class
		System.out.println("Part3");
		Vehicle5 v3=new Vehicle5();
		
		
	}
}
