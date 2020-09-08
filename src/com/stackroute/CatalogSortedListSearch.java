package com.stackroute;
/*Program 5: 
Given a catalog list and search value, sort the list and search for the given value in sorted list
Create a class named CatalogSortedListSearch with the following methods:
+catalogListSearcher(String) : String  
     - Should take a String as input and display a string as result
     - Should display an error message when the String is null or empty or blank space  
     - Should iterate the sorted list to check String existence and display Found or Not Found
+catalogListSorter(List<String>) : String
     - Should validate the List and return error message when it is null or empty and contains value like empty or blank space or null 
     - Should sort the List using Collections                 
     - Should return the global class List variable

Example: Sample Input: [Nike, Puma, Adidas, Reebok, UnderArmour, NBalance, SuperDry] AND Reebok
Expected Output: Found: Reebok

Sample Input: [Nike, Puma, Adidas, Reebok, UnderArmour, NBalance, SuperDry] AND Lee
Expected Output: "Not Found"

Sample Input: [Nike,Puma,Adidas,Reebok,UnderArmour,null,SuperDry] AND Lee
Expected Output: "The catalog List contains empty or null or blank space as a value"

Sample Input: null
Expected Output: "Input is not accepted"

Sample Input: [ ]
Expected Output: "The catalog list is empty"

Sample Input: [Nike, Puma, Adidas, Reebok, UnderArmour, NBalance, SuperDry]
Expected Output: [Adidas, NBalance, Nike, Puma, Reebok, SuperDry, UnderArmour]
 */
import java.util.*;
public class CatalogSortedListSearch {
	static List<String> list=new ArrayList<>();
	//Main Method Driver Code
	public static void main(String []args){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the list items separated by comma");
		String items=scanner.nextLine();
		String[] itemArray=items.split(",");
		list=Arrays.asList(itemArray);
		System.out.println("Enter the string to be searched");
		String result=CatalogSortedListSearch.catalogListSearcher(scanner.nextLine());
		System.out.println(result);
		String sortedList=CatalogSortedListSearch.catalogListSorter(list);
		System.out.println("The sorted list");
		System.out.println(sortedList);
		scanner.close();
	}
	//Method to create catalog and search every list present in it and display the message when the string is null
	public static String catalogListSearcher(String string){
		String output="";
		if(string.equals("")||string.equals(" ")||string.equals(null)){
			output="Invalid Input";
		}else{
			boolean b=false;
			String[] sp=string.split(" ");
			for(int i=0;i<sp.length;i++){
				b=list.contains(sp[i]);
				if(b){
					output="Found: "+sp[i];
					break;
				}
				if(b==false){
					output="Not Found";
				}
			}
		}
		return output;
	}
	//Method to create catalog by sort the list and gives error message to display when it is null or blank space
	static String catalogListSorter(List<String> list){
		String output="";
		if(list.isEmpty()||list==null){
			output="The catalogue list is empty";
		}else if(list.contains("")||list.contains(null)||list.contains(" ")){
			output="The catalogue contains value like empty or blank space or null ";
		}else{
			Collections.sort(list);
			output="["+String.join(" ",list)+"]";
		}
		return output;
	}
}
