package com.amdocs;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyDouble;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SavingAccountTest {
	
	 private SavingAccount account;
	
	//partial mocking or spying
	 private SavingAccount accountSpy;
	
	@Before
	public void setUp() {
		account = new SavingAccount();
	    accountSpy = spy (account);
	}
	
	@After
	public void tearDown() {
		account = null;
		accountSpy = null;
	}

	@Test
	public void testWithdrawWhenCurrentBalanceIs5000INR() throws InsufficientBalanceException{

		
		//Stubbing - hard coding the response of getBalance
		doReturn(5000.00).when (accountSpy).getBalance();
		doNothing().when(accountSpy).updateBalanceIntoDB(anyDouble());
		
		//Code under Test i.e withdraw()
		double updatedBalance = accountSpy.withdraw (1000.00);
		double expectedBalance = 4000.00;
		
		assertEquals(expectedBalance, updatedBalance, 0.0001);
		
		verify(accountSpy, times(1)).getBalance();
		verify(accountSpy, times(1)).updateBalanceIntoDB(anyDouble());
		
	}
	
	@Test
	public void testWithdrawWhenCurrentBalanceIsInsufficient() {

		boolean exceptionThrown = false;
		
		//Stubbing - hard coding the response of getBalance
		doReturn(5000.00).when (accountSpy).getBalance();
		doNothing().when(accountSpy).updateBalanceIntoDB(anyDouble());
		
		//Code under Test i.e withdraw()
		try {
		accountSpy.withdraw (10000.00);
		
		}
		catch(InsufficientBalanceException e) {
			exceptionThrown = true;
		}
		boolean expectedResponse = true;
		assertEquals(expectedResponse, exceptionThrown);
		
		verify(accountSpy, times(1)).getBalance();
		verify(accountSpy, times(0)).updateBalanceIntoDB(anyDouble());
		
	}

}
