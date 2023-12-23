package OOPS2;

import java.util.Scanner;

class Vehicle5{
	
	private String color;
	int maxspeed;
	
	public String getcolor() {
		return color;
	}
	public void setcolor(String color) {
		this.color=color;
	}
	
	public Vehicle5() {
		System.out.println("Vehicle's Constructor");
	}
	
	public void Print() {
		System.out.println("Vehicle color:"+color+" maxspeed:"+maxspeed);
	}
	
	public Vehicle5(int maxspeed) {
		this.maxspeed=maxspeed;
	}
}
class Car6 extends Vehicle5{

	int numdoors;
	
	public Car6() {
		System.out.println("Car's Constructor");
	}
	
	public Car6(int numdoors) {
		this.numdoors=numdoors;
	}
	
	public void Print() {
//		super.Print();
		System.out.println("Car "+" numdoors:"+numdoors);
	}
		
}
class maruti1 extends Car6{
	public maruti1() {
		System.out.println("Maruti's Constructor");
	}
	
}
class tata1 extends Vehicle5{
	int max;
	public tata1(int max) {
		super(max);
		this.max=max;
		System.out.println("MAX "+max);
	}
}


public class Polymorphism {
	public static void main(String[] args) {
		Vehicle5 v1=new Car6(5);//Every Car is Vehicle
		System.out.println();
		Vehicle5 v2=new tata1(100);//Every tata is Vehicle
		System.out.println();
		
		Vehicle5 v=new Car6(4);
		v.maxspeed=120;
//		v.numdoors=6; this is complie time 
		v.Print();//Car print function calls
		
		Vehicle5 s1;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n==0) {
			System.out.println("S1 is Car function");
			s1=new Car6(10);
			
		}
		else {
			System.out.println("s1 is Vehicle function");
			s1=new Vehicle5();
		}
		s1.Print();
		
		
//		Car6 c=new Vehicle5(); is false because Every Vehicle is not a Car
		
		
		
		
		
		
	}
}
