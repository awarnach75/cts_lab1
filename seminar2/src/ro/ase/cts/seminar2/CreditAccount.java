package ro.ase.cts.seminar2;

import ro.ase.cts.seminar2.exceptii.IllegalTransferException;
import ro.ase.cts.seminar2.exceptii.InsufficientFundsException;

public class CreditAccount extends BankAccount{

	@Override
	public void deposit(double amount) {
		if(amount>0) {
			this.balance += amount;
		}
	}

	@Override
	public void withdraw(double amount) throws InsufficientFundsException {
		if(amount>0) {
			this.balance -= amount;
		}
		
	}

	@Override
	public void transfer(double amount, Account destination)
			throws IllegalTransferException, InsufficientFundsException {
		throw new UnsupportedOperationException();
		
	}

}
