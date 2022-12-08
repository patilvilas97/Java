package com.patil.collections;

import java.util.*;
import com.patil.collections.dtos.Item;

public class ListDemo {

	public static void main(String[] args) {
		List<Item> buildItemList = buildItemList();
		displayitemList(buildItemList);
	}

	private static void displayitemList(List<Item> buildItemList) {
		// TODO Auto-generated method stub
		for (Item item : buildItemList) {
			System.out.println("Item Id: "+item.getId());
			System.out.println("Item Name: "+item.getName());
			System.out.println("Item Price: "+item.getPrice());
			
			System.out.println();
		}
	}

	private static List<Item> buildItemList() {
		// TODO Auto-generated method stub
		List<Item> items = new ArrayList();
		
		Item item1 = new Item();
		item1.setId("1");
		item1.setName("Laptop");
		item1.setPrice(25000.00);
		items.add(item1);
		
		Item item2 = new Item();
		item2.setId("2");
		item2.setName("Camera");
		item2.setPrice(18000.00);
		items.add(item2);
		
		Item item3 = new Item();
		item3.setId("3");
		item3.setName("Mobile");
		item3.setPrice(74000.00);
		items.add(item3);
		
		return items;
	}
}
