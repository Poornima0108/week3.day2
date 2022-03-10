package week3.day2.assignments.classroom;

import java.util.*;

public class FindSecondLargestUsingTreeSet {

	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<Integer>();
		set.add(3);
		set.add(2);
		set.add(11);
		set.add(4);
		set.add(6);
		set.add(7);
		System.out.println("Set: "+set);
		List<Integer> list= new ArrayList<Integer>(set);
		int size=list.size();
		System.out.println("Second largest: "+list.get(size-2));

	}

}
