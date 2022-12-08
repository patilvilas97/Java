package com.patil.collections;

import java.util.*;
import com.patil.collections.dtos.Customer;

public class SetDemo {

	public static void main(String[] args) {
		Set<Customer> buildCustomerSet = buildCustomerSet();
		displayCustomers(buildCustomerSet);
	}

	private static void displayCustomers(Set<Customer> buildCustomerSet) {
		// TODO Auto-generated method stub
		for(Customer customer : buildCustomerSet) {
			System.out.println("Customer ID: " + customer.getId());
			System.out.println("Customer Name: " + customer.getName());
		}
		
	}

	private static Set<Customer> buildCustomerSet() {
		// TODO Auto-generated method stub
		Set<Customer> customers = new HashSet();
		
		Customer customer1 = new Customer();
		customer1.setId(1);
		customer1.setName("Vilas");
		customers.add(customer1);
		
		Customer customer2 = new Customer();
		customer2.setId(2);
		customer2.setName("Hemant");
		customers.add(customer2);
		
		Customer customer3 = new Customer();
		customer3.setId(3);
		customer3.setName("Mitali");
		customers.add(customer3);
		
		return customers;
	}
}
	