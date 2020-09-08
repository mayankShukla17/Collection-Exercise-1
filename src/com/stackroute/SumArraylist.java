package com.stackroute;
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
	public static void getSumofListElements(List<Integer> list1,List<Integer> list2){
		List<Integer> listOne=new ArrayList<>( list1);
		Set<Integer> set1= new LinkedHashSet<>(listOne);
		listOne.addAll(set1);
		int sumfirst=0;
		for(int i = 0;i< listOne.size();i++){
			sumfirst += listOne.get(i);
		}
		System.out.println(sumfirst);
		List<Integer> listTwo=new ArrayList<>(list2);
		Set<Integer> set2 = new LinkedHashSet<>(listTwo);
		listTwo.addAll(set2);
		int sumSecond=0;
		for(int i = 0;i< listTwo.size();i++){
			sumSecond+= listTwo.get(i);
		}
		System.out.println(sumSecond);
	}
	public static void main (String []args){
		ArrayList<Integer> list1=new ArrayList<Integer>();
		ArrayList<Integer> list2=new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list2.add(6);
		list2.add(7);
		list2.add(8);
		list2.add(9);
		getSumofListElements(list1, list2);
		ArrayList<Integer> list3=new ArrayList<>();
		list3.addAll(list1);
		list3.addAll(list2);
		int sumthird = 0;
		for(int i = 0;i< list3.size();i++){
			sumthird += list3.get(i);
		}
		System.out.println(list3);
		System.out.println(sumthird);
	}
}
