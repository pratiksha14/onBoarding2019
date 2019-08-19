package com.amdocs;

public class Employee {
	private String name;
	private String designation;
	private String Department;
	
	private Address address;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String designation, String department, Address address) {
		super();
		this.name = name;
		this.designation = designation;
		Department = department;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", designation=" + designation + ", Department=" + Department + ", address="
				+ address + "]";
	}
	
	public String getDetails() {
		return "Employee [name=" + name + ", designation=" + designation + ", Department=" + Department + ", address="
				+ address + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();

	}

}
