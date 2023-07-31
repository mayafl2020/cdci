package com.udemy.java;

public class Customer {

	private String name;
	private double creditLimit;
	private String email;
	
	public Customer() {

		this("Nobody", "nobody@gmail.com");
	}

	public Customer(String name, String email) {

		this(name, 20000, email);
	}

	public Customer(String name, int creditLimit, String email) {

		this.name = name;
		this.creditLimit = creditLimit;
		this.email = email;

	}

	

	public String getName() {
		return name;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public String getEmail() {
		return email;
	}

	public static void main(String[] args) {

		Customer obj = new Customer("Maya", 5000, "maya@gmail.com");
		System.out.println("1  " + obj.getName());
		System.out.println("1  " + obj.getCreditLimit());
		System.out.println("1  " + obj.getEmail());
		System.out.println("");
		Customer obj1 = new Customer();
		System.out.println("2  " + obj1.getCreditLimit());
		System.out.println("2  " + obj1.getEmail());
		System.out.println("2  " + obj1.getName());
		System.out.println("");
		Customer obj3 = new Customer("Arkady", "rkd@gmail.com");
		System.out.println("3  " + obj3.getName());
		System.out.println("3  " + obj3.getCreditLimit());
		System.out.println("3  " + obj3.getEmail());

	}

}
