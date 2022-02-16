package com.hemebiotech.analytics.entities;

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
