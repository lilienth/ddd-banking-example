package de.wps.ddd.banking.accounting;

public class Account {
	private Amount balance;
	private AccountNumber accountNumber;
	private Customer accountOwner;

	public Account(Customer accountOwner, AccountNumber accountNumber) {
		super();
		this.balance = Amount.of(0);
		this.accountNumber = accountNumber;
		this.accountOwner = accountOwner;
	}

	public Amount getBalance() {
		return balance;
	}

	public void setBalance(Amount amount) {
		this.balance = amount;
	}

	public AccountNumber getAccountnumber() {
		return accountNumber;
	}

	public Customer getAccountowner() {
		return accountOwner;
	}

}
