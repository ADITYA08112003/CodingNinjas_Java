package OOPS3;


//Calss with multiple Generic type Parameter.
class Pair5<T,S>{
	private T first;
	private S second;
	public Pair5() {
		
	}
	public Pair5(T first,S second) {
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

public class ChainedGenericPairs {
	public static void main(String[] args) {
//		1st part:
		System.out.println("1st part:");
		System.out.println();
		Pair5< Pair5<String,Integer> , String> p=new Pair5<>();
		System.out.println(p.getFirst());
		System.out.println(p.getSecond());
		System.out.println();
		p.setSecond("aditya");
		System.out.println(p.getFirst());
		System.out.println(p.getSecond());
		System.out.println();
//		2nd part
		System.out.println("2nd part:");
		Pair5<String,Integer> p1Inner=new Pair5<>();//this is inner pair of p1 pair
		Pair5<Pair5<String,Integer>,String> p1=new Pair5<>();
		p1.setFirst(p1Inner);
		System.out.println(p.getFirst());//getting the address of p1Inner
		System.out.println(p.getSecond());
		System.out.println();
//		3rd part
		System.out.println("3rd part");
		Pair5<String,Integer> p2Inner=new Pair5<>();//this is inner pair of p2 pair
		Pair5<Pair5<String,Integer>,String> p2=new Pair5<>();
		p2.setFirst(p2Inner);
		System.out.println(p2.getFirst());//getting the address of p2Inner
		System.out.println(p2.getSecond());
		System.out.println();
		System.out.println();
		Pair5<Pair5<String,Integer>,String> p3=new Pair5<>();
		Pair5<String,Integer> p3Inner=new Pair5<String,Integer>("Aditya",100);//this is inner pair of p1 pair
		
		p3.setFirst(p3Inner);
		System.out.println(p3.getFirst().getFirst());//getting the address of p3Inner Pair with getfirst value
		System.out.println(p3.getFirst().getSecond());//getting the address of p3Inner Pair with getsecond value
		System.out.println(p3.getSecond());
		System.out.println();
		p3.setSecond("Shitanshu");
		System.out.println(p3.getSecond());
		System.out.println();
	}
}
