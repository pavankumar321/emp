package com.pavan.spring;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {
	private int id;
	private String name;
	private int marks[];
	private List<String> hobbies; 
	private Set<String> subjects;
	private Map<Integer,String> ranks;
	private Properties mobileNos;
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + Arrays.toString(marks) + ", hobbies=" + hobbies
				+ ", subjects=" + subjects + ", ranks=" + ranks + ", mobileNos=" + mobileNos + "]";
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
	public void setSubjects(Set<String> subjects) {
		this.subjects = subjects;
	}
	public void setRanks(Map<Integer, String> ranks) {
		this.ranks = ranks;
	}
	public void setMobileNos(Properties mobileNos) {
		this.mobileNos = mobileNos;
	}
	
}
