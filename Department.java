package com.javaBasedConstructor;

public class Department {
	private int dept_id;
	private String dept_name;

	@Override
	public String toString() {
		return "Department [dept_id=" + dept_id + ", dept_name=" + dept_name + "]";
	}

	public Department(int dept_id, String dept_name) {
		this.dept_id = dept_id;
		this.dept_name = dept_name;
	}

}
