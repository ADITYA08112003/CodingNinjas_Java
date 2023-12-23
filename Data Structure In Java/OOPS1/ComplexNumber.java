package OOPS1;
import java.util.Scanner;

class ComplexNumClass1 {
	
	private int real;
	private int imaginary;
	public ComplexNumClass1(int real,int imaginary)
    {
        this.real=real;
        this.imaginary=imaginary;
    }
    public void plus(ComplexNumClass1 c2)
    { 
    	this.real =(this.real+c2.real);
        this.imaginary=this.imaginary+c2.imaginary;
     
    }
    public void multiply(ComplexNumClass1 c2)
    {
    	
        int temp=this.real;  
        this.real = (this.real*c2.real)-(this.imaginary*c2.imaginary);
        this.imaginary =temp*c2.imaginary+this.imaginary*c2.real; 
            
    }
    public void print()
    {
        System.out.println(this.real+" + "+"i"+this.imaginary );
    }
}



public class ComplexNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int real1 = s.nextInt();
		int imaginary1 = s.nextInt();
		ComplexNumClass1 c1 = new ComplexNumClass1(real1, imaginary1);
		c1.print();
		
		int real2 = s.nextInt();
		int imaginary2 = s.nextInt();
		ComplexNumClass1 c2 = new ComplexNumClass1(real2, imaginary2);
		c2.print();
		
		System.out.println("choice 1 is for adding   choice 2 is for multiplying");
		int choice = s.nextInt();

		 
		if(choice == 1) {
			// Add
			c1.plus(c2);
			c1.print();
		}
		else if(choice == 2) {
			// Multiply
			c1.multiply(c2);
			c1.print();
		}
		else {
			return;
		}	
	}

}
