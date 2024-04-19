package Recursion3;

import java.util.*;
import java.util.Scanner;

public class GetAllUniqueSubsets {
	
//	Time Complexity:O(N*2^N)
//	Space Complexity:O(2^N)
	
	private static void generateSubsets(int[] input,int index,ArrayList<Integer> currentSubset,ArrayList<ArrayList<Integer>> subsets) {
//		Add the current subset to the list of subsets
		subsets.add(new ArrayList<>(currentSubset));
		
		for(int i=index;i<input.length;i++) {
//			Skip duplicate
			if(i>index && input[i]==input[i-1]) {
				continue;
			}
//			Add the Current element to the subset
			currentSubset.add(input[i]);
//			Recursively generate subsets starting  from the next index
			generateSubsets(input, i+1, currentSubset, subsets);;
//			Remove the Current element from the subset to backtrack
			currentSubset.remove(currentSubset.size()-1);
		}
	}
	
	public static ArrayList<ArrayList<Integer>> getSubsets(int[] input){
//		Sort the Input array (if it's not already sorted)
		Arrays.sort(input);
		
		ArrayList<ArrayList<Integer>> subsets=new ArrayList<>();
		ArrayList<Integer> currentSubset=new ArrayList<>();
		generateSubsets(input,0,currentSubset,subsets);
		return subsets;
	}
	public static void PrintSubset(int arr[]) {
		ArrayList<ArrayList<Integer>> subsets=getSubsets(arr);
//		Print the Subset
		for(ArrayList<Integer> subset:subsets) {
			for(int num:subset) {
				System.out.print(num+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		
		PrintSubset(arr);
	}
}
