package RecursionAssignment;

import java.util.Scanner;

public class PairStar {
//	Process1
//	Time Complexity:O(N)
//	Space Complexity:O(N)
	public static String PairStar1(String str) {
		  // Base case: if the string is empty or has only one character
        if (str == null || str.length() <= 1) {
            return str;
        }
        
        // Check if the first two characters are the same
        if (str.charAt(0) == str.charAt(1)) {
            // Insert a "*" between them and recursively call pairStar on the remaining substring
            return str.charAt(0) + "*" + PairStar1(str.substring(1));
        } else {
            // If the first two characters are different, keep the first character and recursively call pairStar on the remaining substring
            return str.charAt(0) + PairStar1(str.substring(1));
        }
	}
//	Process2
	public static String PairStar2(String s) {
		if(s.length()<=1) {
			return s;
		}
		String out=PairStar2(s.substring(1));
		if(s.charAt(0)==s.charAt(1)) {
			out=s.charAt(0)+"*"+s.charAt(1)+out.substring(1);
		}
		else {
			out=s.charAt(0)+out;
		}
		return out;
	}

	public static String helper(String s1,int i) {
		if(i==s1.length()-1) {
			return "";
		}
		String a="";
		if(s1.charAt(i)==s1.charAt(i+1)) {
			a+=s1.charAt(i)+"*";
		}
		else {
			a+=s1.charAt(i);
		}
		return a+helper(s1,i+1);
	}
	public static String PairStar3(String s1) {
		return helper(s1,0)+s1.charAt(s1.length()-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
//		Process1
		System.out.println("Process1:");
		System.out.println(PairStar1(s1));
		System.out.println();
//		Process2
		System.out.println("Process2:");
		System.out.println(PairStar2(s1));
		System.out.println();
//		Process3
		System.out.println("Process3");
		System.out.println(PairStar3(s1));

	}

}
