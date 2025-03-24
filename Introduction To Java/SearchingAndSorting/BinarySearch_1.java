// package SearchingAndSorting;

public class BinarySearch_1 {

	public static int binarysearch(int[] arr,int x) {
		int n=arr.length;
		int s=0,e=n-1;
		while(s<=e) {
			int m=(s+e)/2;
			if(arr[m]==x) {
				return m;
			}
			else if(arr[m]>x) {
				e=m-1;
			}
			else {
				s=m+1;
			}
		}
		return -1;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6};
		int x=6;
		int ans=binarysearch(arr,x);
		System.out.println(ans);
		
	}

}
