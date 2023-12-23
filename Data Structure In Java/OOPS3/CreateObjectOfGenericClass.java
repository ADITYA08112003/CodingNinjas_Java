package OOPS3;

//Part1
class Pair2<T>{
	private T first;
	private T second;
	public Pair2(T first,T second) {
		this.first=first;
		this.second=second;
	}
	public T getFirst() {
		return first;
	}
	public void setFirst(T first) {
		this.first=first;
	}
	public T getSecond() {
		return second;
	}
	public void setSecond(T second) {
		this.second=second;
	}
}

public class CreateObjectOfGenericClass {
	public static void main(String[] args) {
//		Part1
		System.out.println("Part1");
		System.out.println("Integer type Pair Class:");
		Pair2<Integer> pI=new Pair2<Integer>(100,23);
		System.out.println(pI.getFirst()+" "+pI.getSecond());
		pI.setFirst(12);
		pI.setSecond(99);
		System.out.println(pI.getFirst()+pI.getSecond());
		System.out.println();
		
		System.out.println("String type Pair Class:");
		Pair2<String> pS=new Pair2<String>("Aditya","Shitanshu");
		System.out.println(pS.getFirst()+" "+pS.getSecond());
		pS.setFirst("ADRAJ");
		pS.setSecond("SHI");
		System.out.println(pS.getFirst()+" "+pS.getSecond());
		System.out.println();
		
		System.out.println("Double type Pair Class:");
		Pair2<Double> pD=new Pair2<Double>(12.12,32.123);
		System.out.println(pD.getFirst()+" "+pD.getSecond());
		pD.setFirst(10.10);
		pD.setSecond(99.2343);
		System.out.println(pD.getFirst()+" "+pD.getSecond());
		System.out.println();
		
		
//		System.out.println("Pair of Vehicle class");
//		Pair2<Vehicle> pV=new Pair2<Vehicle>(new Vehicle(),new Vehicle());  new Vehicle() is object1
		
//		part2
		
		
//		Pair2 p=new Pair2(10,20); // this is very very dangerous
////		we are getting a warning but not a error because it is insynatcally incorrect
//		p.setFirst("aditya");//this is String
//		p.setFirst(100);//this is Integer
//		String f=(String)p.getFirst();//this is very dangerous.we donot really know what exactly first is
////		part2 concept show Error at runtime not complie time and show  java.lang.ClassCastException:
		Pair2<Integer> PI=new Pair2<>(1,2);//<> this is able to interpret the type.based on the reference variable here
		
		
	}
}
