package OOPS3;

interface InterfaceIntro {
	boolean isMotorized();//same as public abstract boolean isMotorized();
	String GetCompany();// same as public abstract String GetCompany();
	
}

class Vehicle8 implements InterfaceIntro{

	@Override
	public boolean isMotorized() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String GetCompany() {
		// TODO Auto-generated method stub
		return "ADITYA";
	}
	void Print() {
		System.out.println("Vehicle print");
	}
	
}

public class InterfaceIntroduction {
	public static void main(String[] args) {
		Vehicle8 V=new Vehicle8();
//		InterfaceIntro VI=new InterfaceIntro();
		InterfaceIntro VI;//creating Reference
		
//		polymorphism
		VI=new Vehicle8();
//		VI.Print();//we cannot specific any Vehicle specific context
		System.out.println(VI.GetCompany());//Only Access the properties of Interface
		
	}
}
