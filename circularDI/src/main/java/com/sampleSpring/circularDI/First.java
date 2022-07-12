package com.sampleSpring.circularDI;

public class First {

	
	String name;
	Second second;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Second getSecond() {
		return second;
	}
	public void setSecond(Second second) {
		this.second = second; 
	}
	
	
	public void test(){
		System.out.println("name :: "+name +" Secound ::" + second);
	}
	
}
