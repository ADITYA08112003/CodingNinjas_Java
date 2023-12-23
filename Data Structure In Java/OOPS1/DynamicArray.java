package OOPS1;
//import java.util.Arraylist;

class DynamicArrayClass1 {
	private int data[];
	private int nextElementIndex;
	
	public DynamicArrayClass1() {
		data=new int[5];
		nextElementIndex=0;
	}
	public int size() {
//		return data.length;
		return nextElementIndex;
	}
	public boolean isEmpty() {
		return nextElementIndex==0;
	}
	public void set(int i,int ele) {
		if(i>=nextElementIndex) {
//			ERROR
			return;
		}
		data[i]=ele;
	}
	public int get(int i) {
		if(i>=nextElementIndex) {
			return -1;
		}
		return data[i];
	}
	public void add(int ele) {
		if(nextElementIndex==data.length) {
			doubleCapacity();
		}
		data[nextElementIndex]=ele;
		nextElementIndex++;
	}
	public int removelast() {
		if(nextElementIndex==0) {
			return -1;
		}
		int temp=data[nextElementIndex-1];
		data[nextElementIndex-1]=0;
		nextElementIndex--;
		return temp;
	}
	private void doubleCapacity() {
		int temp[]=data;
		data=new int [2*temp.length];
		for(int i=0;i<temp.length;i++) {
			data[i]=temp[i];
		}
		
	}
	
}




public class DynamicArray {

	public static void main(String[] args) {
		DynamicArrayClass1 d=new DynamicArrayClass1();
		for(int i=1;i<100;i++) {
			d.add(100+i);
		}
		System.out.println(d.size());
		System.out.println(d.get(2));
		d.set(3,170);
		System.out.println(d.get(3));
		
		while(!d.isEmpty()) {
			System.out.println(d.removelast());
			System.out.println("size-"+d.size());
		}

	}


}