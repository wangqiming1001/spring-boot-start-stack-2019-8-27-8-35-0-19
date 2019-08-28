package com.tw.apistackbase.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tw.apistackbase.model.Employee;
import com.tw.apistackbase.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeesController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping
	public ResponseEntity<List<Employee>> getEmployee(){
		return ResponseEntity.ok(employeeService.getEmployee());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<List<Employee>> getEmployeeById(@PathVariable int id){
		return ResponseEntity.ok(employeeService.getEmployeeById(id));
	}
	
//	@GetMapping("/createEmployee")
//	public ResponseEntity<List<Employee>> createEmployee(@PathVariable Employee employee){
//		
//		return ResponseEntity.ok();
//	}
}
