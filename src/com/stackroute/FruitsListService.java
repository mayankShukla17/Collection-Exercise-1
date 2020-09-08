package com.stackroute;
/*Program 2:
Problem Statement: Create ArrayList and Search elements in the List

Define the below static methods in class `FruitsListService`:

addFruitsToList(String) : List<String>      
- Should take a String input containing names of fruits separated by comma(see  below),
	and display a List of the Fruit names "apple,mango,Cherry"
- Should not add duplicate fruits to the list (Same fruit name in upper/lower/mixed 
	should be also considered duplicates)

searchFruitInList(List<String>, String) : int
- Should take a fruit list and fruit name to be searched as parameters
- Should display the index of the fruit in the list, if it's found
- Should display “not found”, if the fruit is not found
- Should do a "case-sensitive" search   

searchFruitInListIgnoreCase(List<String>, String) : int
- Should take a fruit list and fruit name to be searched as parameters
- Should display the index of the fruit in the list, if it's found
- Should display “not found”, if the fruit is not found
- Should do a "case-insensitive" search   
 */
import java.util.*;
public class FruitsListService {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		FruitsListService fls=new FruitsListService();
		System.out.println("Enter the fruits list separated by comma(,)");
		String string=scanner.nextLine();
		List<String> ls=fls.addFruitsToList(string);
		System.out.println(ls);
		System.out.println("Enter the fruit which you want to search.");
		String searchFruit=scanner.next();
		
		int pos=fls.searchFruitInList(ls, searchFruit);
		if(pos==-1)
			System.out.println("Fruit is not present in list");
		else
			System.out.println("Fruit is present at position "+pos);
		System.out.println("Ignore Case");
		pos=fls.searchFruitInListIgnoreCase(ls, searchFruit);
		if(pos==-1)
			System.out.println("Fruit is not present in list");
		else
			System.out.println("Fruit is present at position "+pos);
	}
	public List<String>  addFruitsToList(String fruits) {
		String[] frts=fruits.split(",");
		List<String> al=new ArrayList<String>(Arrays.asList(frts));
		return al;
	}
	public int searchFruitInList(List<String> list, String search) {
		int position=-1;
		if(list.contains(search))
			return list.indexOf(search);
		return position;
	}
	public int searchFruitInListIgnoreCase(List<String> list, String search) {
		int position=-1;
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).equalsIgnoreCase(search))
				return i;
		}
		return position;
	}
}
