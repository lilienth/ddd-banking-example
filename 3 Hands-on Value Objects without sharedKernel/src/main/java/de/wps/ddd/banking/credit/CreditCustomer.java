package de.wps.ddd.banking.credit;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CreditCustomer {
	private String firstName;
	private String familyName;
	private LocalDate dateOfBirth;
	private CustomerNumber customerNumber;
	private List<CreditAccount> accountList;
	private List<Credit> creditList;

	public CreditCustomer(String firstName, String familyName, LocalDate dateOfBirth, CustomerNumber number) {
		super();
		this.firstName = firstName;
		this.familyName = familyName;
		this.dateOfBirth = dateOfBirth;
		this.customerNumber = number;
		accountList = new ArrayList<CreditAccount>();
		creditList = new ArrayList<Credit>();
	}

	public String getFirstName() {
		return firstName;
	}

	public String getFamilyName() {
		return familyName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public CustomerNumber getCustomerNumber() {
		return customerNumber;
	}

	public List<CreditAccount> getAccountList() {
		return accountList;
	}

	public List<Credit> getCreditList() {
		return creditList;
	}

}
