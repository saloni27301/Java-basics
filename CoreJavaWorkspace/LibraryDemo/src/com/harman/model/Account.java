package com.harman.model;

import com.harman.exception.InsufficientBalanceException;

public class Account {
	private int accNumber;
	private String accName;
	private double balance;
	
	private static final double MIN_BALANCE = 500.0;
	
	public Account() {
		/* default constructor */
	}
	
	public Account(int accNumber, String accName, double balance) {
		this.accNumber = accNumber;
		this.accName = accName;
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		try {
		if (balance - amount < MIN_BALANCE) {
			throw new InsufficientBalanceException("transaction declined - insufficient balance");
		}
		balance -= amount;
		} catch(InsufficientBalanceException excep) {
			System.out.println(excep.getMessage());
		}
	}
	
	public void withdraw2(double amount) throws InsufficientBalanceException{
		
		if (balance - amount < MIN_BALANCE) {
			throw new InsufficientBalanceException("transaction declined - insufficient balance");
		}
		balance -= amount;
		
	}

	public int getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return String.format("accNumber=%s, accName=%s, balance=%s", accNumber, accName, balance);
	}
	
}
