package com.harman.model;

public class Product {
	private int id;
	private String name;
	
	/* static data member */
	private static int tax;

	/* static methods */
	public static void setTax(int tx) {
		tax = tx;
	}
	public static int getTax() {
		return tax;
	}
	
	public void setId(int pId) {
		id = pId;
	}
	public void setName(String pname) {
		name = pname;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
		
}
