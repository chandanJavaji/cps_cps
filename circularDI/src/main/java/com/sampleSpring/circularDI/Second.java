package com.sampleSpring.circularDI;

public class Second {

	
	String type;
	First first;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public First getFirst() {
		return first;
	}
	public void setFirst(First first) {
		this.first = first;
	}
	
	public void test(){
		System.out.println("type :: "+type +" First ::" + first);
	}
	
}
