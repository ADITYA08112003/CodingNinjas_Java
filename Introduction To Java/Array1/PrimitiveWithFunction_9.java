// package Array1;

public class PrimitiveWithFunction_9 {

	public static void increment(int i) {
		i++;
	}
	
	public static void printarray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void incrementArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i]=arr[i]+1;
		}
	}
	public static void main(String[] args) {
//		Part1
//		Call by Pass
		System.out.println("Part1");
		int i=10;
		increment(i);
		System.out.println(i);
//		Part2
//		Call by Reference
		System.out.println("Part2");
		int[] arr= {1,2,3,4,5};
		incrementArray(arr);
		printarray(arr);
	}

}
