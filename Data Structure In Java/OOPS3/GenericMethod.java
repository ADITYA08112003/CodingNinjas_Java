package OOPS3;

class Vehicl{
	int max;
	String name;
}

public class GenericMethod {

//	Part1
	public static void printArray(int []arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
//	Part2
	public static<T> void PrintArray(T arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
//		part1
		System.out.println("Part1");
		int []arr=new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=i+1;
		}
		printArray(arr);
		System.out.println();
		
//		part2
		System.out.println("Part2");
		System.out.println("Integer Type Generic Array");
		Integer arrI[]=new Integer[5];
		for(int i=0;i<arrI.length;i++) {
			arrI[i]=i+1;
		}
		PrintArray(arrI);
		System.out.println();
		
		System.out.println("String Type Generic Array");
		String arrS[]=new String[5];
		for(int i=0;i<arrS.length;i++) {
			arrS[i]="Aditya";
		}
		PrintArray(arrS);
		System.out.println();
		
		System.out.println("Vehicle Type Generic Array");
		Vehicl v[]=new Vehicl[5];
		PrintArray(v);//print the vehicle reference
		System.out.println();
		for(int i=0;i<v.length;i++) {
			v[i]=new Vehicl();//create a new object of vehicle
		}
		PrintArray(v);//print the address of vehicl
		
	}
	
}
