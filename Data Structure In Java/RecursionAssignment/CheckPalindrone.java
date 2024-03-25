package RecursionAssignment;

import java.util.Scanner;

public class CheckPalindrone {

//	Process1
//	Time Complexity:O(N)
//	Space Complexity:O(1)
	public static boolean helper1(String str,int start,int end) {
		if(start>=end) {
			return true;
		}
		if(str.charAt(start)!=str.charAt(end)) {
			return false;
		}
		return helper1(str,start+1,end-1);
	}
	public static boolean CheckPalindrone1(String str) {
		return helper1(str,0,str.length()-1);
	}
	
//	Process2
//	Time Complexity:O(N)
//	Space Complexity:O(1)
//	Where N is the length of String
	
//	Helper  function to check if a String is a Palindrome recursively.
	public static boolean helper2(String str,int left,int right) {
//		Base Case: If the left and right pointer meet or cross each other,the String is a palindrome
		if(left>=right) {
			return true;
		}
//		Recursive Case:Check If the Characters at the left and right pointer are equal.
		if(str.charAt(left)==str.charAt(right)) {
//			Recursive for the substring by moving  the left pointer to the  right and the right pointer to the left
			return  helper2(str, left+1, right-1);
		}
//		if the Character at the left and right pointer  are not equal , the string is not a palindrome.
		return false;
		
	}
	public static boolean CheckPalindrone2(String str) {
		return helper2(str, 0, str.length()-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.next();
		System.out.println("Process1:");
		System.out.println(CheckPalindrone1(str));
		System.out.println();
		System.out.println("Process2:");
		System.out.println(CheckPalindrone2(str));
	}

}
