package com.crud.springboot.api.dao;

import java.util.List;

import com.crud.springboot.api.model.Employee;

public interface EmployeeDAO {
	
	List<Employee> get();
	
	Employee get(int id);
	
	void save(Employee employee);
	
	void delete(int id); 
}
