package com.hcl.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcl.entity.Employee;
import com.hcl.util.SessionClass;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	SessionClass sessionClass;

	public Employee createEmployee(Employee employee) {
		Employee employee1 = (Employee) sessionClass.getSession().save(employee);
		return employee1;
	}

}
