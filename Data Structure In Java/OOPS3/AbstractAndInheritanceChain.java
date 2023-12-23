package OOPS3;

abstract class Vehicle7{
	private String color;
	int maxspeed;
	
	public Vehicle7() {
		color="Red";
		System.out.println("Vehicle's Constructor");
		maxspeed=60;
	}
	
	public Vehicle7(int maxspeed) {
		color="Red";
		System.out.println("Vehicles Constructor");
		this.maxspeed=maxspeed;
	}
	public String getcolor() {
		return color;
	}
	public void setcolor(String color) {
		this.color=color;
	}
	
	public void Print() {
		System.out.println("Vehicle color:"+color+" maxspeed:"+maxspeed);
	}
//	1st abstract 
	public abstract boolean isMotorized();
//	2nd abstract
	public abstract String getCompany();
}

abstract class Car4 extends Vehicle7{
	int numDoors;
	int numGears;
	public Car4() {
		System.out.println("Car Constructor");
		numDoors=4;
		numGears=6;
	}
	public Car4(int numDoors,int maxspeed) {
		super(maxspeed);
		System.out.println("Car Constructor");
		this.numDoors=numDoors;
	}
	
	public void Print() {
		System.out.println("Car "+" numdoors:"+numDoors);
	}
	@Override
//	unimplemeneted method
	public boolean isMotorized() {
	
		return true;
	}
}
class BMW extends Car4{

	@Override
//	unimplement method
	public String getCompany() {
		return "BMW";
	}
	
}

abstract class Bicycle1 extends Vehicle7{

	@Override
	public boolean isMotorized() {
		
		return false;// or true
	}
	
}



public class AbstractAndInheritanceChain {
	public static void main(String[] args) {
		Vehicle7 V;
//		V=new Car4();
//		V=new Bicyle1();
	
		V=new BMW();
		System.out.println();
		V.Print();
		System.out.println();
		System.out.println(V.isMotorized());
		System.out.println();
		System.out.println(V.getCompany());
		
	}
}
