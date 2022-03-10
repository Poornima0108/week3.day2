package week3.day2.assignments.classroom;

import java.util.*;

public class RemoveDuplicatesUsingLinkedHashSet {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		
				//Split the text and store it in an array
				String[] split = text.split(" ");
				
				//Store the split words in set
				Set<String> set = new LinkedHashSet<String>();
				for (int i = 0; i < split.length; i++) {
					set.add(split[i]);
				}
				
				//Set allows only unique values
				System.out.println("LinkedHashSet without duplicate words: "+set);

	}

}
