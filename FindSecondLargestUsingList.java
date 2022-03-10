package week3.day2.assignments.classroom;

import java.util.*;

public class FindSecondLargestUsingList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(2);
		list.add(11);
		list.add(4);
		list.add(6);
		list.add(7);
		System.out.println("List: "+list);
		Collections.sort(list);
		System.out.println("List after sorting: "+list);
		int size=list.size();
		System.out.println("Second largest: "+list.get(size-2));

	}

}
