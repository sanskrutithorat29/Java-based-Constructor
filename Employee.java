package com.javaBasedConstructor;

public class Employee {
	private int emp_id;
	private String emp_name;
	private String emp_address;
	private Department department;

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_address=" + emp_address
				+ ", department=" + department + "]";
	}

	public Employee(int emp_id, String emp_name, String emp_address, Department department) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_address = emp_address;
		this.department = department;
	}

}
