package OOPS2;

class Vehicle2{
	private String color;
//	Protected modifier is used 
	protected int  maxspeed;
	
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
class Car3 extends Vehicle2{
	int numdoors;
//	Function Overriding
	public void Print() {
		System.out.println("Car color:"+getcolor()+" maxspeed:"+maxspeed+" numdoors:"+numdoors);
	}
}
class Bicycle3 extends Vehicle2{
	
}

class Truck extends Vehicle2{
	int maxLoadingCapacity;
	public void Print() {
		System.out.println("Car color:"+getcolor()+"  maxspeed:"+maxspeed +"  maxLoadingCapacity:"+maxLoadingCapacity);
	}
	
}

public class ProtectedModifier {
	public static void main(String[] args) {
		Vehicle2 v=new Vehicle2();
		v.setcolor("Red");
		v.maxspeed=19;
		v.Print();
		
		Car3 c=new Car3();
		c.setcolor("Black");
		c.maxspeed=100;
		c.numdoors=6;
		c.Print();
		
		
		Bicycle3 b=new Bicycle3();
		b.maxspeed=10;
		b.setcolor("Yellow");
		b.Print();
		
		Truck t=new Truck();
		t.maxLoadingCapacity=1000;
		t.Print();
	}

}
