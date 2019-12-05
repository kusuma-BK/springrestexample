package com.hcl.dto;

public class SalaryDto {
	private long empId;
	private double salary;
	private double basicSalary;
	private double provisionalFund;
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public double getProvisionalFund() {
		return provisionalFund;
	}
	public void setProvisionalFund(double provisionalFund) {
		this.provisionalFund = provisionalFund;
	}
	
	
}
