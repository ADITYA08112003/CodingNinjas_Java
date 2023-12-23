package OOPS2;

class Vehicle{
	private String color;
	int maxspeed;
	
	public String getcolor() {
		return color;
	}
	public void setcolor(String color) {
		this.color=color;
	}
	
	public void Print() {
		System.out.println("Vehicle color:"+color+" maxspeed:"+maxspeed);
	}
}
class Car1 extends Vehicle{
	int numdoors;
	public void PrintCar() {
		System.out.println("Car color:"+getcolor()+" maxspeed:"+maxspeed+" numdoors:"+numdoors);
	}
}
class Bicycle1 extends Vehicle{
	
}

public class InheritanceandPrivateMember {
	public static void main(String[] args) {
		Vehicle v=new Vehicle();
		v.setcolor("Red");
		v.maxspeed=19;
		v.Print();
		
		Car1 c=new Car1();
		c.setcolor("Black");
		c.maxspeed=100;
		c.numdoors=6;
		c.PrintCar();
		c.Print();
		
		Bicycle1 b=new Bicycle1();
		b.maxspeed=10;
		b.setcolor("Yellow");
		b.Print();
	}
	
	

}
