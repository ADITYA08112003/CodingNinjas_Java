package OOPS2;

class Vehicle4{
	
	private String color;
	int maxspeed;
	
	public String getcolor() {
		return color;
	}
	public void setcolor(String color) {
		this.color=color;
	}
	
	public Vehicle4() {
		System.out.println("Vehicle's Constructor");
	}
	
	public void Print() {
		System.out.println("Vehicle color:"+color+" maxspeed:"+maxspeed);
	}
	
	public Vehicle4(int maxspeed) {
		this.maxspeed=maxspeed;
	}
}
class Car5 extends Vehicle4{

	int numdoors;
	
	public Car5() {
		System.out.println("Car's Constructor");
	}
	
	public Car5(int numdoors) {
		this.numdoors=numdoors;
	}
	
	public void Print() {
		super.Print();
		System.out.println("Car "+" numdoors:"+numdoors);
	}
		
}
class maruti extends Car5{
	public maruti() {
		System.out.println("Maruti's Constructor");
	}
	
}
class tata extends Vehicle4{
	int max;
	public tata(int max) {
		super(max);
		this.max=max;
		System.out.println("MAX "+max);
	}
}


public class InheritanceAndConstructor {
	public static void main(String[] args) {
		Vehicle4 v=new Vehicle4();// vehicle constructor called only vehicle Property
		System.out.println();
		Car5 c=new Car5();// car constructor called first vehicle then after car Property
		System.out.println();
		maruti m=new maruti();// maruti constructor called first vehicle then car then maruti
		System.out.println();
		
		Car5 c1=new Car5(10);
		c1.Print();
		System.out.println();
		
		tata t=new tata(100);
		System.out.println();
		t.Print();
		
		
	}
}
