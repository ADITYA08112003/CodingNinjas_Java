package Recursion3;

import java.util.Scanner;

public class ReturnSubsequence {
	public static String[] FindSubSequence(String str) {
		if(str.length()==0) {
			String ans[]= {""};
			return ans;
		}
		String SmallAns[]=FindSubSequence(str.substring(1));
		String ans[]=new String[2*SmallAns.length];
		
		int k=0;
		for(int i=0;i<SmallAns.length;i++) {
//			ans[i]=SmallAns[i];
			ans[k]=SmallAns[i];
			k++;
		}
		for(int i=0;i<SmallAns.length;i++) {
//			ans[i+SmallAns.length]=str.charAt(0)+SmallAns[i];
			ans[k]=str.charAt(0)+SmallAns[i];
			k++;
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		String ans[]=FindSubSequence(str);
		for(String i: ans) {
			System.out.print(i+" ");
		}
	}
}
