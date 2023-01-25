package com.jojuskills.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jojuskills.entity.Employee;
import com.jojuskills.exception.EmployeeNotFoundException;
import com.jojuskills.model.EmployeeDTO;
import com.jojuskills.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public Employee saveEmployee(EmployeeDTO employeeDTO) {
		Employee employee=Employee.builder().empName(employeeDTO.getEmpName()).salary(employeeDTO.getSalary()).deportment(employeeDTO.getDeportment()).build();
	return employeeRepository.save(employee);
	}
	
	public Employee getEmployeeById(long id) {
		return employeeRepository.findById(id).orElseThrow(
	  () -> new EmployeeNotFoundException("No Employee exist with this id: " + id));
	}
	
}
	

