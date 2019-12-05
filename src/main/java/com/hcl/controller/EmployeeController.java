package com.hcl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.dto.EmployeeDto;
import com.hcl.service.EmployeeService;

@RequestMapping("/employee")
@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(value = "/addEmployee", method = RequestMethod.POST, headers = "Accept=application/json")
	public String createEmployee(@RequestBody EmployeeDto employeeDto) {
		employeeService.createEmployee(employeeDto);
		return "Employee created successfully!!";
		
	}
	
}
	
	


