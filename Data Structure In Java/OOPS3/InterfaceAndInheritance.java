package OOPS3;
//part1
interface VehicleInterface{
	double PI=3.14;
	boolean IsMotoried();
	
	String GetCompany();
}

class Vehicle9 implements VehicleInterface{

	@Override
	public boolean IsMotoried() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String GetCompany() {
		// TODO Auto-generated method stub
		return "Aditya";
	}
	void print() {
		System.out.println(PI);
	}
}

//part2
class Vehicle11{
	void Print() {
		System.out.println("Vehicle Part");
	}
}

//class can be parallely be extends class and implementing an interface
class Car5 extends Vehicle11 implements VehicleInterface{
	@Override
	public boolean IsMotoried() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String GetCompany() {
		// TODO Auto-generated method stub
		return "Aditya";
}
interface CarInterface{
	int numgear();
	int PI=3;
}
//class can be done more than one interface
class Car6 extends Vehicle11 implements VehicleInterface , CarInterface{
	@Override
	public boolean IsMotoried() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String GetCompany() {
		// TODO Auto-generated method stub
		return "Aditya";
	}
	
//	this is carinterface abstract class method
	public int numgear() {
		return 5;
	}
//	void Print() {
//		System.out.println(PI);
//	}
}

public class InterfaceAndInheritance {
	public static void main(String[] args) {
		System.out.println("Part1:");
		Vehicle9 v=new Vehicle9();
		VehicleInterface v1;
		v1=new Vehicle9();
		System.out.println(v1.PI);
		System.out.println(v1.GetCompany());
		System.out.println();
		
		System.out.println("Part2:");
		
	}
}
}
