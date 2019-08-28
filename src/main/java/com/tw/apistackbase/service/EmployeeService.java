package com.tw.apistackbase.service;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.tw.apistackbase.model.Employee;
@Service
public class EmployeeService {
	static List<Employee> employeesModel = Employee.allEmployees();
	
	//根据名字查询
	public List<Employee> getEmployee(String nameLike){
		List<Employee> employeeList = new ArrayList<>();
		Employee employee = new Employee();
		List<Employee> employees = employeesModel;
		if (nameLike != "" && nameLike != null) {
			for (int i = 0; i < employees.size(); i++) {
				if (employees.get(i).getName().contains(nameLike)) {
					employee.setId(employees.get(i).getId());
					employee.setName(nameLike);
					employee.setAge(employees.get(i).getAge());
					employee.setGender(employees.get(i).getGender());
					employeeList.add(employee);
				}
			}
		}else {
			employeeList.addAll(employees);
		}
		return employeeList;
	}
	
	//根据id查询
	public List<Employee> getEmployeeById(int id){
		Employee employee = new Employee();
		List<Employee> employeeList = new ArrayList<>();
		List<Employee> employees = employeesModel;
		for (int i = 0; i < employees.size(); i++) {
			if(employees.get(i).getId() == id) {
				employee.setId(id);
				employee.setName(employees.get(i).getName());
				employee.setAge(employees.get(i).getAge());
				employee.setGender(employees.get(i).getGender());
				employeeList.add(employee);
			}
		}
		return employeeList;
	}
	
	//新增
	public List<Employee> addEmployee(@RequestBody Employee employee) {
		 employeesModel.add(employee);
		 List<Employee> employees  = employeesModel;
		 return employees;
	}
	
	//修改
	public List<Employee> updateEmployee(Employee model) {
		Employee employee = new Employee();
		List<Employee> employees = employeesModel;
		int id = model.getId();
		for (int i = 0; i < employees.size(); i++) {
			if(employees.get(i).getId() == id) {
				employee.setName(model.getName());
				employee.setAge(model.getAge());
				employee.setGender(model.getGender());
				employees.add(employee);
			}
		}
		return employees;
	}
	
	//删除
	public List<Employee> deleteEmployeeById(int id) {
		List<Employee> employees = employeesModel;
		for (int i = 0; i < employees.size(); i++) {
			if(employees.get(i).getId() == id) {
				employees.remove(i);
			}
		}
		return employees;
	}
}
