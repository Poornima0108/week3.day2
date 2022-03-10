package week3.day2.assignments.classroom;

import java.util.*;

public class FindIntersectionUsingHashSet {

	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		
		//Add items to set1
		set1.add(3);
		set1.add(2);
		set1.add(11);
		set1.add(4);
		set1.add(6);
		set1.add(7);
		System.out.println("HashSet1: "+set1);
		
		//Add items to set2
		set2.add(1);
		set2.add(2);
		set2.add(8);
		set2.add(4);
		set2.add(9);
		set2.add(7);
		System.out.println("HashSet2: "+set2);
		
		//Convert set to list
		List<Integer> list1 = new ArrayList<Integer>();
		list1.addAll(set1);
		System.out.println("List1: "+list1);
		List<Integer> list2 = new ArrayList<Integer>();
		list2.addAll(set2);
		System.out.println("List2: "+list2);
		
		//Find intersection elements
		for (int i = 0; i < list1.size(); i++) {
			for (int j = 0; j < list2.size(); j++) {
				if(list1.get(i)==list2.get(j))
				{
					System.out.println("Intersection elements: "+list1.get(i));
				}
			}
		}

	}

}
