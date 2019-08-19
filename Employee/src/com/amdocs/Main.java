package com.amdocs;

public class Main {

	public static void main(String[] args) {
		Address address = new Address("100","M G Road","Pune","456789");
		Employee sharma = new Employee("Sharma","Software Engineer - I",
				"Digital Xperience",address);
		
		System.out.println(sharma.getDetails());
	}

}
