package com.patil.collections;

import java.util.*;

public class CollectionOperations {
	public static void main(String[] args) {
		
		ArrayList<Integer> historyMarks = new ArrayList<Integer>();
		historyMarks.add(97);
		historyMarks.add(98);
		historyMarks.add(52);
		historyMarks.add(88);
		System.out.println("History Marks: "+historyMarks);
		
		LinkedList list = new LinkedList();
		list.add("Name: Vilas");
		list.add("Mobile Number: "+855407442);
		list.add("Honest: "+true);
		list.add("Height: "+ 5.12);
		System.out.println(list);
		
		
	}


}
