package com.amdocs;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList();
		number.add(100);
		number.add(50);
		number.add(10);
		number.add(500);
		number.add(150);
		System.out.println("size of array = " + number.size());
		System.out.println("List element before sorting .......");
		for(int element : number) {
			System.out.println(element);
		}
		
		number.sort(null);
		
		System.out.println("List element after sorting .......");
		for(int element : number) {
			System.out.println(element);
		}
	}
}
