package DAO;

import java.util.ArrayList;
import java.util.Map;

public class Student {

	private String name;
	private int age;
	private ArrayList<String> subjects;
	private Map<String,Object> contactNo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public ArrayList<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(ArrayList<String> subjects) {
		this.subjects = subjects;
	}
	public Map<String, Object> getContactNo() {
		return contactNo;
	}
	public void setContactNo(Map<String, Object> contactNo) {
		this.contactNo = contactNo;
	}
	
	
}
