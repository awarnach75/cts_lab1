package ro.ase.cts.seminar2;

import ro.ase.cts.seminar2.Interfaces.Profitable;
import ro.ase.cts.seminar2.exceptii.IllegalTransferException;
import ro.ase.cts.seminar2.exceptii.InsufficientFundsException;

public class Main {

	public static void main(String[] args) {
		BankAccount c=new CurrentAccount(100, "IBAN");
		BankAccount account2=new CurrentAccount(200, "IBAN2");
		
		BankAccount account3 = new SavingsAccount(300,"IBAN3");
		System.out.println("Suma disponibila este de " + c.getBalance() + " RON.");
				
		System.out.println("Creditul maxim pentru contul curest este de "+CurrentAccount.MAX_CREDIT+" RON.");
		
		c.deposit(208);
		System.out.println("Suma disponibila este de "+c.getBalance()+" RON.");
		
		try {
			c.withdraw(208);
			c.setNotificationService( new EmailNotificationService());
			c.whitdraw(200);
			c.setNotificationService( new NotificationService() {
				@override
				public void sendNotification(String message) {
					System.out.println("Sent PUSH notification with message: " + message);
				}
			});
			c.withdraw(200);
			c.transfer(100, c);
			
		} catch (InsufficientFundsException e | IllegalTransferException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Suma disponibila este de "+c.getBalance()+" RON.");
		System.out.println("Suma in contul 1 este de "+account2.getBalance()+" RON");
		System.out.println("Suma in contul 3 este de "+account3.getBalance()+" RON");
		account3.addInterest(10);
		System.out.println("Suma in contul 3 este de "+account3.getBalance()+" RON");
		Bank banca = new Bank();
		BankAccount account4 = banca.openBankAccount(AccountType.CURRENT);
		
		
		
	}

}
