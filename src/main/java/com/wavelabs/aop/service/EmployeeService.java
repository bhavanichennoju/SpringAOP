package com.wavelabs.aop.service;

import org.springframework.stereotype.Service;

import com.wavelabs.aop.model.Employee;

@Service
public class EmployeeService {

	public Employee createEmployee(String name, String empId) {
		System.out.println("create employee");
		Employee emp = new Employee();
		emp.setName(name);
		emp.setEmpId(empId);
		return emp;
	}

	public void deleteEmployee(String empId) {

	}
}