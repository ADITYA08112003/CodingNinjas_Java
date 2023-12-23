package OOPS2;

class Vechile{
	String color;
	int maxspeed;
	public void print() {
		System.out.println("Vechile color :"+color+" ,maxspeed :"+maxspeed);
	}
}

class Car extends Vechile{
	int numdoors;
}
class Bicycle extends Vechile{
	
}

public class CodeUsingInheritance {
	public static void main(String[] args) {
		Vechile v=new Vechile();
//		print() is give null value to be print()
		v.print();
		
		v.color="Red";
		v.print();
		
		Car c=new Car();
		c.color="Black";
		c.maxspeed=100;
		c.numdoors=4;
		c.print();
		
		Bicycle b=new Bicycle();
		b.color="Green";
		b.maxspeed=10;
		b.print();
	}
	
}
