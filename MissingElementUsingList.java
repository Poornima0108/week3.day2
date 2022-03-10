package week3.day2.assignments.classroom;

import java.util.*;

public class MissingElementUsingList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(7);
		list.add(6);
		list.add(8);
		
		Collections.sort(list);
		System.out.println("List: "+list);
		
		for (int i = list.get(0); i < list.size(); i++) {
			if(i!=list.get(i-1))
			{
				System.out.println("Value of i is: "+i);
				System.out.println("Value of list.get(i-1) is: "+list.get(i-1));
				System.out.println("Missing number is: "+i);
				break;
			}
		}

	}

}
