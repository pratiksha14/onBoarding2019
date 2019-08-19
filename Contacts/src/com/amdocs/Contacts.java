package com.amdocs;

import java.util.HashMap;

public class Contacts {
	private HashMap<String, String> contacts;

	public Contacts() {
		this.contacts = new HashMap<String, String>();
	}

	public void addContact(String name, String mobileNo) {
		contacts.put(mobileNo, name);
	}
	
	public String findContactNameByMobile(String mobileNo) {
		String name = contacts.get(mobileNo);
		
		if(name == null) {
			System.out.println("Name not found");
			return mobileNo;	
		}
			
		else {
			System.out.println("-------------------------------");
				return name;
			}
	}
	
	public static void main(String[] args) {
		Contacts contacts = new Contacts();
		contacts.addContact("Rishi", "1234567896");
		contacts.addContact("Arun", "3216549872");
		
		System.out.println(contacts.findContactNameByMobile("45656565656"));
		
		System.out.println(contacts.findContactNameByMobile("1234567896"));
	}

}
