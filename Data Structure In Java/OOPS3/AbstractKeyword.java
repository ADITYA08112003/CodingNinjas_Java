package OOPS3;


//part1
class V{
	
//	v is not know about the isMotoried method  of abstract method 
	public boolean isMotoried() {
		return true;
	}
}
class C extends V{
	
}
class B extends C{
	
}

//part2 
abstract class V1{
//	Abstarct keyword indicating that declaration is incompleted in class or method,etc.
	public abstract boolean IsMotoried();
}

public class AbstractKeyword {
	public static void main(String[] args) {
		
	}
}
