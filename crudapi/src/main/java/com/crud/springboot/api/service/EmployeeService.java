package com.crud.springboot.api.service;

import java.util.List;

import com.crud.springboot.api.model.Employee;

public interface EmployeeService {
	
	List<Employee> get();
	
	Employee get(int id);
	
	void save(Employee employee);
	
	void delete(int id); 
}
