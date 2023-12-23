package OOPS3;

//part1
class Pair{
	private int first;
	private int second;
	
	public Pair(int first,int second) {
		this.first=first;
		this.second=second;
	}
	public int getFirst() {
		return first;
	}
	public void setFirst(int first) {
		this.first=first;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second=second;
	}
}

//Part2
class Pair1<T>{
	private T first;
	private T second;
	public Pair1(T first,T second) {
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


public class IntroToGenerics {
	public static void main(String[] args) {
//		part1
		System.out.println("Part1");
		Pair p=new Pair(10,20);
		System.out.println(p.getFirst()+" "+p.getSecond());
		System.out.println();
//		PairString ps=new PairString("ad","sh");
//		PairDoublw pd=new PairDouble(23.23,34.53);
		
//		Part2
		System.out.println("Part2");
		System.out.println("Generic for Integer");
		Pair1<Integer> p1=new Pair1(100,200);
		System.out.println(p1.getFirst()+" "+p1.getSecond());
		
		System.out.println("Generics for String");
		Pair1<String> p2=new Pair1("Aditya","Shitanshu");
		System.out.println(p2.getFirst()+" "+p2.getSecond());
		
		System.out.println("Generic for Double");
		Pair1<Double> p3=new Pair1(12.21,33.2);
		System.out.println(p3.getFirst()+" "+p3.getSecond());
	}
}
