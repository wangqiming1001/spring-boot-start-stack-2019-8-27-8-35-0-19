package com.tw.apistackbase.model;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	private int id;
	private String name;
	private int age;
	private String gender;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Employee() {
		super();
	}
	
	public Employee(int id, String name, int age, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public static List<Employee> allEmployees(){
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1,"Xiaoming",11,"male"));
		employees.add(new Employee(2,"Xiaohong",18,"female"));
		employees.add(new Employee(3,"Xiaozhi",27,"male"));
		employees.add(new Employee(4,"Xiaogang",21,"male"));
		employees.add(new Employee(5,"Xiaoxia",14,"female"));
		return employees;
	}
	
	
}
