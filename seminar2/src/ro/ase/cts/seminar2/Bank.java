package ro.ase.cts.seminar2;

public class Bank {
	public static int nextId;
	
	public BankAccount openBankAccount(int tipCont) {
		if(tipCont == 1) {
			return new CurrentAccount();
		}else if (tipCont==2) {
			return new SavingsAccount();
		}else {
			throw new UnsupportedOperationException();
		}
	}
}
