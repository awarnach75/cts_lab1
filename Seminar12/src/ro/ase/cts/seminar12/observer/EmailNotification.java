package ro.ase.cts.seminar12.observer;

public class EmailNotification implements NotificationInterface{

	@Override
	public void notifyUser(double amount) {
		System.out.println("[EMAIL NOTIFICATION]: "+amount+ " extracted");
	}

}
