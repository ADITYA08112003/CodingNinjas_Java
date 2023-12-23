package OOPS3;

//Part2
class Pair3<T>{
	private T first;//these are reference not object
	private T second;
	
//	Default Constructor
	public Pair3() {}
	
	public Pair3(T first,T second) {
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

//Part3

//Calss with multiple Generic type Parameter.
class Pair4<T,S>{
	private T first;
	private S second;
	public Pair4(T first,S second) {
		this.first=first;
		this.second=second;
	}
	public T getFirst() {
		return first;
	}
	public void setFirst(T first) {
		this.first=first;
	}
	public S getSecond() {
		return second;
	}
	public void setSecond(S second) {
		this.second=second;
	}
}


public class ClassWithMultipleGeneric {
	public static void main(String[] args) {
//		Part1
		
//		int i=10;//i is primitive datatype and i is object
//		Integer T=null;//T is Non primitive type data
//		Integer I=10;//I is non primitive datatype,I is reference and refering to memory where 10 is stored
//		I is reference to the object
		
//		Pair<Integer> P;
//		p=new Pair<>(28);
		
//		Part2
		System.out.println("Part2");
		Pair3<String> p=new Pair3<>();
		System.out.println(p.getFirst()+" "+p.getSecond());//give null null value due to default constructor
		p.setFirst("Aditya");
		System.out.println(p.getFirst()+" "+p.getSecond());//give Aditya null
		System.out.println();
		
//		Part3
		System.out.println("Part3");
		Pair4<String,Integer> P1=new Pair4<String,Integer>("Aditya",100);
		System.out.println(P1.getFirst()+" "+P1.getSecond());
		P1.setFirst("Shitanshu");
		P1.setSecond(199);
		System.out.println(P1.getFirst()+" "+P1.getSecond());
		
		
	}

}
