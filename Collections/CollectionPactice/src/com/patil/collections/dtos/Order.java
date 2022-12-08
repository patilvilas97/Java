package com.patil.collections.dtos;

import java.util.List;

public class Order {
	
	private String id;
	private List<Item> items;
	
	public List<Item> getItems(){
		return items;
	}
	
	public void setItems(List<Item> items) {
		this.items=items;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id=id;
	}
}
