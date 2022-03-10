package week3.day2.assignments.classroom;

import java.util.*;

public class PrintDuplicatesUsingList {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(14);
		list.add(12);
		list.add(13);
		list.add(11);
		list.add(15);
		list.add(14);
		list.add(18);
		list.add(16);
		list.add(17);
		list.add(19);
		list.add(18);
		list.add(17);
		list.add(20);
		
		System.out.println("List: "+list);
		
		for (int i = 0; i < list.size()-1; i++) {
			for (int j = i+1; j < list.size(); j++) {
				if(list.get(i)==list.get(j)) {
					System.out.println("Duplicate elements in list: "+list.get(i));
				} 
			}			
		}	
	}

}
