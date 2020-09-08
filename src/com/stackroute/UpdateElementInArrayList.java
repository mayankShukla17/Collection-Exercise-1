package com.stackroute;
/*Program 1:
Write a Java program to update the specific array element by given 
element and empty the array list .
	Input: [Apple, Grape, Melon, Berry]
	Output: [Kiwi, Grape, Mango, Berry]
	Array list after removing all elements [ ]
*/
import java.util.ArrayList;
public class UpdateElementInArrayList {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Apple");
		al.add("Grape");
		al.add("Melon");
		al.add("Berry");
		
		al.set(0,"Kiwi");
		al.set(2,"Mango");
		System.out.println(al);
		al.removeAll(al);
		System.out.println(al);
	}
}
