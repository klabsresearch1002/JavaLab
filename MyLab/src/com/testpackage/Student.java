package com.testpackage;

public class Student {
	private String id;
	private String name;
	
	Student(){
		
	}
	
	public Student(String i,String name) {
		this.id = i;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	public void sameReference(Student st) {
		st.setId("1");
		st.setName("test");
	}
	
	
	
	

}
