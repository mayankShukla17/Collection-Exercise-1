package com.stackroute;
/*Program 4:
Write a program to implement a set interface which sorts the given randomly ordered names in ascending order. Convert the sorted set in to an array list

Input : Harry Olive Alice Bluto Eugene
Output :
Sorted Set : Alice Bluto Eugene Harry Olive
Array list from Set : Alice Bluto Eugene Harry Olive
*/
import java.util.*;
public class ListSorting { 
	public static void main(String args[]) 
	{ 
		HashSet<String> set = new HashSet<String>(); 
		set.add("Harry"); 
		set.add("Olive");
		set.add("Alice"); 
		set.add("Bluto");
		set.add("Eugene");
		System.out.println("Original HashSet: "+ set); 
		List<String> list = new ArrayList<String>(set); 
		Collections.sort(list); 
		System.out.println("HashSet elements "+ "in sorted order "+ "using List: "+ list); 
	} 
}
