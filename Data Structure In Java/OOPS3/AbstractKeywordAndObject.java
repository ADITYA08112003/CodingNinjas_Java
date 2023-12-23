package OOPS3;

abstract class Vehicle6{
	private String color;
	int maxspeed;
	
	public Vehicle6() {
		color="Red";
		System.out.println("Vehicle's Constructor");
		maxspeed=60;
	}
	
	public Vehicle6(int maxspeed) {
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
	public abstract boolean isMotorized();
	
}
//abstract class Car3 extends Vehicle5{//method1 to abstract subclass mean Car3 accept the incompleteness
class Car3 extends Vehicle6{
	int numDoors;
	int numGears;
	public Car3() {
		System.out.println("Car Constructor");
		numDoors=4;
		numGears=6;
	}
	public Car3(int numDoors,int maxspeed) {
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
//method2 to abstract subclass by isMotorised method as show below is unimplemented method
class Bicycle extends Vehicle6{

	@Override
	public boolean isMotorized() {
		
		return false;// or true
	}
	
}

public class AbstractKeywordAndObject {
	public static void main(String[] args) {
//		Vehicle5 v=new Vehicle5();
//		Car3 c=new Car3();
		
//		this is also a polymorphism concept
		Vehicle6 v;// creating reference of a vehicle
		Car3 c=new Car3();
		System.out.println();
		v=new Car3();
		System.out.println();
		v.Print();
		System.out.println();
		System.out.println(v.isMotorized());
		System.out.println();
		v=new Bicycle();
		System.out.println(v.isMotorized());
		
		
	}
}
