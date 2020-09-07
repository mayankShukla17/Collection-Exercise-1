package in.legato;
/*Program 3:
Write a program to calculate the sum of elements of two input arraylists.

getSumOfListElements(List<Integer> firstList, List<Integer> secondList
This method displays the List with the sum of elements of two input lists

Rules
 An element in the final displayed list is the sum of elements in input lists at the same index. 
 For example, if L1 and L2 are input lists, and L3 is the final list, then L3.get(n) must be equal to the sum of L1.get(n) and L2.get(n).

 The sizes of both Lists may differ. 
 Assuming that the sizes of both lists are 's1' and 's2', the new list should be of size equals to largest of s1 and s2. 
  If L1 is larger than L2 then the last (s1-s2) elements in the returned list should be same as the corresponding elements in the list L1
If any of the list is null, it should be considered as empty list
 */

import java.util.*;
public class SumArraylist {
	public static void getSumofListElements(List<Integer>L1,List<Integer>L2){
		List<Integer>L=new ArrayList<>(L1);
		Set<Integer> s = new LinkedHashSet<>(L);
		L.addAll(s);
		int sumfirst=0;
		for(int i = 0;i< L.size();i++){
			sumfirst += L.get(i);
		}
		System.out.println(sumfirst);
		List<Integer>M=new ArrayList<>(L2);
		Set<Integer> s2 = new LinkedHashSet<>(M);
		L.addAll(s2);
		int sumsecond=0;
		for(int i = 0;i< M.size();i++){
			sumsecond+= M.get(i);
		}
		System.out.println(sumsecond);
	}
	public static void main (String []args){
		ArrayList<Integer>L1=new ArrayList<Integer>();
		ArrayList<Integer>L2=new ArrayList<Integer>();
		L1.add(1);
		L1.add(2);
		L1.add(3);
		L1.add(4);
		L1.add(5);
		L2.add(6);
		L2.add(7);
		L2.add(8);
		L2.add(9);
		getSumofListElements(L1, L2);
		ArrayList<Integer> L3=new ArrayList<>();
		L3.addAll(L1);
		L3.addAll(L2);
		int sumthird = 0;
		for(int i = 0;i< L3.size();i++){
			sumthird += L3.get(i);
		}
		System.out.println(L3);
		System.out.println(sumthird);

	}
}
