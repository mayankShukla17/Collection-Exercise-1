package in.legato;
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

Example: Sample Input:
[Nike, Puma, Adidas, Reebok, UnderArmour, NBalance, SuperDry] AND reebok      
Expected Output:
Found: Reebok

Sample Input:
[Nike, Puma, Adidas, Reebok, UnderArmour, NBalance, SuperDry] AND Lee
Expected Output:
"Not Found"

Sample Input:
[Nike, Puma, Adidas, Reebok, UnderArmour, null, SuperDry] AND Lee
Expected Output:
"The catalog List contains empty or null or blank space as a value"

Sample Input:
null    
Expected Output:
"Input is not accepted"

Sample Input:
[ ]    
Expected Output:
"The catalog list is empty"

Sample Input:
[Nike, Puma, Adidas, Reebok, UnderArmour, NBalance, SuperDry]      
Expected Output:
[Adidas, NBalance, Nike, Puma, Reebok, SuperDry, UnderArmour]
 */
import java.util.*;
public class CatalogSortedListSearch {
	static ArrayList<String> list=new ArrayList<>();
	public static void main(String []args){
		Scanner scan=new Scanner(System.in);
		list.add("puma");
		list.add("adidas");
		list.add("Reebok");
		System.out.println("Enter the string to be searched");
		CatalogSortedListSearch.catalogListSearcher(scan.nextLine());
		CatalogSortedListSearch.catalogListSorter(list);
	}
	static void catalogListSearcher(String s){
		if(s.equals("")||s.equals(" ")||s.equals(null)){
			System.out.println("Invalid input");
		}else{
			boolean b=false;
			String[] sp=s.split(" ");
			for(int i=0;i<sp.length;i++){
				b=list.contains(sp[i]);
				if(b){
					System.out.println("Found:"+sp[i]);
					break;
				}
				if(b==false){
					System.out.println("Not Found");
				}
			}
		}
	}
	static void catalogListSorter(List<String> list){
		if(list.isEmpty()||list==null){
			System.out.println("The cataloge list is empty");
		}else if(list.contains("")||list.contains(null)||list.contains(" ")){
			System.out.println("The cataloge contains value like empty or blank space or null ");   
		}else{
			Collections.sort(list);
			System.out.println("The sorted list");   
			System.out.println(list);   
		}
	}
}
