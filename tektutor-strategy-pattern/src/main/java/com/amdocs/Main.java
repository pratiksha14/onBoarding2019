package com.amdocs;

import java.util.Scanner;

public class Main {
	public static void displayMenu() {
		System.out.println("Main Menu");
		System.out.println("1.Quick Sort");
		System.out.println("2.Insertion Sort");
		System.out.println("3.Heap Sort");
		System.out.println("4.Exit");
	}
	public static int getChoice() {
		System.out.println("Enter Your Choice : ");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	
	public static void doWork(int choice) {
		IAlgorithm algorithm = AlgorithmFactory.getAlgorithm(choice);
		algorithm.sort();
		
	}
	
	public static void main(String[] args) {
		int choice = 0;
		while(choice != 4) {
			displayMenu();
			choice = getChoice();
			if(choice != 4) doWork(choice);
		}
		System.out.println("Thank you!, Application exited successfully");
	}
}
