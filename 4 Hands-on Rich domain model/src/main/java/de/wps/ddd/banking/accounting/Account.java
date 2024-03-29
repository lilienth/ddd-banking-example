package de.wps.ddd.banking.accounting;

import static de.wps.common.contracts.BaseContracts.require;
import static de.wps.common.contracts.BaseContracts.requireNotNull;

import de.wps.ddd.banking.sharedKernel.AccountNumber;
import de.wps.ddd.banking.sharedKernel.Amount;
import org.jmolecules.ddd.annotation.Entity;
import org.jmolecules.ddd.annotation.Identity;

@Entity
public class Account {
    @Identity
    private final AccountNumber accountNumber;
    private final Customer accountOwner;
    private Amount balance;

    public Account(AccountNumber accountNumber, Customer accountOwner) {
        requireNotNull(accountNumber, "accountNumber");
        requireNotNull(accountOwner, "accountOwner");

        this.accountNumber = accountNumber;
        this.accountOwner = accountOwner;
        this.balance = Amount.of(0);
    }

    public Amount getBalance() {
        return balance;
    }

    public void withdraw(Amount amount) {
        requireNotNull(amount, "amount");
        require(amount.isLessOrEquals(getBalance()), "amount.isLessOrEquals(getBalance())");

        this.balance = this.balance.subtract(amount);
    }

    public void deposit(Amount amount) {
        requireNotNull(amount, "amount");

        this.balance = this.balance.add(amount);
    }

    public AccountNumber getAccountnumber() {
        return accountNumber;
    }

    public Customer getAccountOwner() {
        return accountOwner;
    }

}
