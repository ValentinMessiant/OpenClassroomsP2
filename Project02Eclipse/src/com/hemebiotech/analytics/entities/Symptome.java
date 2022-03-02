package com.hemebiotech.analytics.entities;

/*
 * This object is used to store the name and the counter of each symptom
 * and therefore contains getters and setters of these parameters.
 * 
 * It also contains the method compareTo in order to be able to sort each object in ascending order.
 */

public class Symptome implements Comparable<Symptome>{
	private String name;
	private int count;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public int compareTo(Symptome o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.getName());
	}
}
