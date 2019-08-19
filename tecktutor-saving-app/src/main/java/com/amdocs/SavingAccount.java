package com.amdocs;

public class SavingAccount {

	public double getBalance() {
		System.out.println("Assume Balance is retrieved from database");
		return 7000.00;
	}
	
	public double withdraw(double amountToBeWithdraw) throws InsufficientBalanceException{
		System.out.println("Inside Withdraw method");
		double currentBalance = getBalance();
		
		if(amountToBeWithdraw < currentBalance) {
			currentBalance = currentBalance - amountToBeWithdraw;
		}
		else {
			throw new InsufficientBalanceException();
		}
		
		updateBalanceIntoDB(currentBalance);
		return currentBalance;
	}
	
	public void updateBalanceIntoDB(double currentBalance) {
		System.out.println("Assume here balance is updated into database");
	}
}
