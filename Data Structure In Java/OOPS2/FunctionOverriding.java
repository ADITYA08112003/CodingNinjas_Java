package OOPS2;

class Vehicle1{
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
class Car2 extends Vehicle1{
	int numdoors;
//	Function Overriding
	public void Print() {
		System.out.println("Car color:"+getcolor()+" maxspeed:"+maxspeed+" numdoors:"+numdoors);
	}
}
class Bicycle2 extends Vehicle1{
	
}
public class FunctionOverriding {
	public static void main(String[] args) {
		Vehicle1 v=new Vehicle1();
		v.setcolor("Red");
		v.maxspeed=19;
		v.Print();
		
		Car2 c=new Car2();
		c.setcolor("Black");
		c.maxspeed=100;
		c.numdoors=6;
		c.Print();
		
		
		Bicycle2 b=new Bicycle2();
		b.maxspeed=10;
		b.setcolor("Yellow");
		b.Print();
	}

}
