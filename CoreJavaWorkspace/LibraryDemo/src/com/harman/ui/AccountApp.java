package com.harman.ui;

import com.harman.exception.InsufficientBalanceException;
import com.harman.model.Account;

public class AccountApp {

	public static void main(String[] args) {
		Account first = new Account(101, "srinivas", 10000.0);
		System.out.println(first);
		first.deposit(500);
		System.out.println(first);
		first.withdraw(6000);
		System.out.println(first);
		
		try {
			first.withdraw2(7000);
		} catch(InsufficientBalanceException excep) {
			System.out.println(excep.getMessage());
		} finally {
			System.out.println(first);
		}
		

	}

}
