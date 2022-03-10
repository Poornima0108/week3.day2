package week3.day2.assignments.classroom;

import java.util.*;

public class RemoveDuplicatesUsingArrayList {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		int count = 0;
		
		//Split the text and store it in an array
		String[] split = text.split(" ");
		
		//Store the split words in list
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < split.length; i++) {
			list.add(split[i]);
		}
		
		System.out.println("List: "+list);
		//Get the count of duplicate words
		for (int i = 0; i < list.size()-1; i++) {
			for (int j = i+1; j < list.size(); j++) {
				if(list.get(i).equals(list.get(j)))
				{			
					count = count+1;					
				}
			}			
		}
		
		//Remove the duplicate word from list
		if(count>1) {
			for (int i = 0; i < list.size()-1; i++) {
				for (int j = i+1; j < list.size(); j++) {
					if(list.get(i).equals(list.get(j)))
					{					
						list.remove(i);
											
					}
				}			
			}	
		}
		
		System.out.println("Number of duplicate words: "+count);
		System.out.println("List without duplicate words: "+list);
	}

}
