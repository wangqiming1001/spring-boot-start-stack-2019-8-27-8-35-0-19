package com.tw.apistackbase.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tw.apistackbase.model.Employee;
@Service
public class EmployeeService {

	public List<Employee> getEmployee(){
		List<Employee> employees = new ArrayList<Employee>();
		Employee employee = new Employee();
		Employee employee1 = new Employee();
		employee.setId(1000);
		employee.setName("hahahahah");
		employee.setAge(1);
		employee.setGender("male");
		employees.add(employee);
		employee1.setId(1001);
		employee1.setName("emmmm");
		employee1.setAge(2);
		employee1.setGender("female");
		employees.add(employee1);
		return employees;
	}
	
	public List<Employee> getEmployeeById(int id){
		Employee employee = new Employee();
		List<Employee> employeeList = new ArrayList<>();
		List<Employee> employees = getEmployee();
		for (int i = 0; i < employees.size(); i++) {
			if(employees.get(i).getId() == id) {
				employee.setId(id);
				employee.setName(employees.get(i).getName());
				employee.setAge(employees.get(i).getAge());
				employee.setGender(employees.get(i).getGender());
			}
		}
		employeeList.add(employee);
		return employeeList;
	}
}
