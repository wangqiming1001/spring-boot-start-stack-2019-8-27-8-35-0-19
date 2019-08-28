package com.tw.apistackbase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tw.apistackbase.model.Employee;
import com.tw.apistackbase.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeesController {
	
	@Autowired
	private EmployeeService employeeService;
	
	//根据name查询
	@GetMapping
	public ResponseEntity<List<Employee>> getEmployee(@RequestParam(value = "name",required = false) String nameLike){
		return ResponseEntity.ok(employeeService.getEmployee(nameLike));
	}
	
	//根据id查询
	@GetMapping("/{id}")
	public ResponseEntity<List<Employee>> getEmployeeById(@PathVariable int id){
		return ResponseEntity.ok(employeeService.getEmployeeById(id));
	}
	
	//新增
	@PostMapping(consumes = "application/json")
	public ResponseEntity<List<Employee>> createEmployee(@RequestBody Employee employee){
		return ResponseEntity.ok(employeeService.addEmployee(employee));
	}
	
	//修改
	@PutMapping
	public ResponseEntity<List<Employee>> updateEmployee(@RequestBody Employee employee){
		return ResponseEntity.ok(employeeService.updateEmployee(employee));
	}
	
	//删除
	@DeleteMapping("/{id}")
	public ResponseEntity<List<Employee>> deleteEmployeeById(@PathVariable int id){
		return ResponseEntity.ok(employeeService.deleteEmployeeById(id));
	}
}
