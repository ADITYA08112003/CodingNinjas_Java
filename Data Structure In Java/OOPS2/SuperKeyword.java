package OOPS2;


class Vehicle3{
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
class Car4 extends Vehicle3{
	int numdoors;
//	Function Overriding
	public void Print() {
		super.Print();
		System.out.println("Car "+" numdoors:"+numdoors);
	}
}
class Bicycle4 extends Vehicle3{
	
}
class Tcar extends Vehicle3{
	int numdoors1;
	int maxspeed;
	public void Print() {
		super.Print();
		System.out.println("Tcar "+"numdoor1:"+numdoors1);
	}
	public void MaxSpeed() {
		super.maxspeed=1000;
		System.out.println(maxspeed +" "+super.maxspeed );
	}
	
}
public class SuperKeyword {
	public static void main(String[] args) {
		Vehicle3 v=new Vehicle3();
		v.setcolor("Red");
		v.maxspeed=19;
		v.Print();
		
		Car4 c=new Car4();
		c.setcolor("Black");
		c.maxspeed=100;
		c.numdoors=6;
		c.Print();
		
		
		Bicycle4 b=new Bicycle4();
		b.maxspeed=10;
		b.setcolor("Yellow");
		b.Print();
		
		Tcar tc=new Tcar();
		tc.setcolor("White");
		tc.maxspeed=120;
		tc.numdoors1=10;
		tc.MaxSpeed();
		tc.Print();
		
		
		
		
	}

}
