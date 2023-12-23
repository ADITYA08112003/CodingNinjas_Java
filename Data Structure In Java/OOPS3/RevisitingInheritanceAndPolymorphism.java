package OOPS3;
//Part1
class Vehicle{
	int maxspeed;
	
	public Vehicle() {
		System.out.println("Vehicle's Constructor");
		maxspeed=60;
	}
	
	public Vehicle(int maxspeed) {
		System.out.println("Vehicles Constructor");
		this.maxspeed=maxspeed;
	}
	
	public void Print() {
		System.out.println(" maxspeed:"+maxspeed);
	}
}
class Car extends Vehicle{
	int numDoors;
	int numGears;
	public Car() {
		System.out.println("Car Constructor");
		numDoors=4;
		numGears=6;
	}
	public Car(int numDoors,int maxspeed) {
		super(maxspeed);
		System.out.println("Car Constructor");
		this.numDoors=numDoors;
	}
	
	public void Print() {
		System.out.println("Car "+" numdoors:"+numDoors);
	}
}
//part2
class Vehicle1{
	int maxspeed1;
	
	public Vehicle1(int maxspeed1) {
		System.out.println("Vehicles Constructor");
		this.maxspeed1=maxspeed1;
	}
	
}
class Car1 extends Vehicle1{
	int numDoors;
	int numGears;
	public Car1() {
		super(100);
		System.out.println("Car Constructor");
		numDoors=4;
		numGears=6;
	}
	public Car1(int numDoors,int maxspeed1) {
		super(maxspeed1);
		System.out.println("Car Constructor");
		this.numDoors=numDoors;
	}	
}

public class RevisitingInheritanceAndPolymorphism {
	public static void main(String[] args) {
//		inheritnce concept
//		part1
		System.out.println("Part1:");
		Vehicle v=new Vehicle();
		System.out.println();
		
		Car c=new Car();
		System.out.println();
//		part2
		System.out.println("Part2:");
		Car1 c1=new Car1();
		System.out.println();
		
//		Polymorphism concept
		Vehicle v1=new Vehicle();
		v1=new Car();
		v1.Print(); //v.print calls the car print function
//		v1.numDoor=10; v1 is pointing to Car but Car have inherting to Vehicle	
	}
}
