package de.wps.ddd.banking.credit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class CreditCustomerTest {

	@Test
	void testCustomerConstruction() {

		CreditCustomer customer = new CreditCustomer("Carola", "Lilienthal", LocalDate.of(1967, 9, 11), 11);
		assertEquals("Carola", customer.getFirstName());
		assertEquals("Lilienthal", customer.getFamilyName());
		assertEquals(LocalDate.of(1967, 9, 11), customer.getDateOfBirth());
		assertEquals(11, customer.getCustomerNumber());
		assertNotNull(customer.getAccountList());
		assertNotNull(customer.getCreditList());
	}

}
