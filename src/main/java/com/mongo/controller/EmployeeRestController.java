package com.mongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.entity.Employee;
import com.mongo.repo.EmployeeRepository;




@RequestMapping("/employee/api")
@RestController
public class EmployeeRestController {
	@Autowired
	private EmployeeRepository employeeService;
	
	
	
	@GetMapping("/get")
	public ResponseEntity<List<Employee>> getAll() {
		return ResponseEntity.ok(employeeService.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Employee> findById(@PathVariable Long id) {
		return ResponseEntity.ok(employeeService.findById(id).orElse(null));
	}
	
	@PutMapping("/update")
	public ResponseEntity<Employee> update(@RequestBody Employee employee) {
		return ResponseEntity.ok(employeeService.save(employee));
	}
	
	@PostMapping("/add")
	public ResponseEntity<Employee> addAll(@RequestBody Employee employee) {
		return ResponseEntity.ok(employeeService.save(employee));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Employee> delete(@PathVariable Long id) {
		employeeService.findById(id).ifPresent(employeeService::delete);
		return ResponseEntity.ok().build();
	}
}