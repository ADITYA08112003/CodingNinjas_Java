package OOPS2;

class Vehicle6{
	
	private String color;
	int maxspeed;
	
	public String getcolor() {
		return color;
	}
	public void setcolor(String color) {
		this.color=color;
	}
	
	public Vehicle6() {
		System.out.println("Vehicle's Constructor");
	}
	
	public void Print() {
		System.out.println("Vehicle color:"+color+" maxspeed:"+maxspeed);
	}
	
	public Vehicle6(int maxspeed) {
		this.maxspeed=maxspeed;
	}
}
class Car7 extends Vehicle6{

	int numdoors;
	
	public Car7() {
		System.out.println("Car's Constructor");
	}
	
	public Car7(int numdoors) {
		this.numdoors=numdoors;
	}
	
	public void Print() {
//		super.Print();
		System.out.println("Car "+" numdoors:"+numdoors);
	}
		
}

class Bicycle5 extends Vehicle6{
	
}

public class ClassCastAndObjectClass {
	public static void main(String[] args) {
		Vehicle6 v=new Car7(19);
		Car7 c=(Car7) v;// This class cast
		c.numdoors=10;
		c.Print();
		
		Vehicle6 v1=new Car7(12);
//		v1=new Bicycle5(); due to this line code is run time error(not Complie time)
		Car7 c1=(Car7)v1;
		c1.numdoors=4;
		
//		Object class is SuperClass of any class of java
		Object o=new Vehicle6(188);
		Vehicle6 v3=new Vehicle6();
		v3.getcolor();
		
	}
}
