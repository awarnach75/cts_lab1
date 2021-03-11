package ro.ase.cts.seminar2;

import ro.ase.cts.seminar2.exceptii.IllegalTransferException;
import ro.ase.cts.seminar2.exceptii.InsufficientFundsException;

public class Main {

	public static void main(String[] args) {
		CurrentAccount c=new CurrentAccount(100, "IBAN");
		CurrentAccount account2=new CurrentAccount(200, "IBAN2");
		
		SavingsAccount account3 = new SavingsAccount(300,"IBAN3");
		System.out.println("Suma disponibila este de " + c.getBalance() + " RON.");
				
		System.out.println("Creditul maxim pentru contul curest este de "+CurrentAccount.MAX_CREDIT+" RON.");
		
		c.deposit(208);
		System.out.println("Suma disponibila este de "+c.getBalance()+" RON.");
		
		try {
			c.withdraw(208);
			try {
				c.transfer(200, account2);
			} catch (IllegalTransferException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (InsufficientFundsException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Suma disponibila este de "+c.getBalance()+" RON.");
		System.out.println("Suma in contul 1 este de "+account2.getBalance()+" RON");
		System.out.println("Suma in contul 3 este de "+account3.getBalance()+" RON");
		account3.addInterest(10);
		System.out.println("Suma in contul 3 este de "+account3.getBalance()+" RON");
		
		
	}

}
