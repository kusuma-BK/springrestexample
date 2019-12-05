package com.hcl.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.dao.EmployeeDao;
import com.hcl.dto.EmployeeDto;
import com.hcl.entity.Employee;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao employeeDao;

	public Employee createEmployee(EmployeeDto employeeDto) {

		Employee employee = new Employee();

		BeanUtils.copyProperties(employeeDto, employee);
		Employee employee1 = employeeDao.createEmployee(employee);
		return employee1;
	}

}
