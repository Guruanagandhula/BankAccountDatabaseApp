package bankaccount;

public class Chequing extends Account {
	//properties of chequing account
	int debitCardNumber;
	int debitCardPin;
	
	//constructor for chequing account
	public Chequing(String name,String sSN,double initDeposit) {
		super(name,sSN,initDeposit);
		accountNumber="2"+accountNumber;
		setDebitCard();
		
		//System.out.println("Account Number: "+this.accountNumber);
		//sSystem.out.println("New Chequing Account");
		
		//System.out.println("Name: "+name);
	}
	@Override
	public void setRate() {
		rate= getBaseRate()*.15;
		//System.out.println("Implement Rate for Chequing");
	}
	private void setDebitCard() {
		debitCardNumber=(int)(Math.random()*Math.pow(10, 12));
		debitCardPin=(int)(Math.random()*Math.pow(10, 4));
		
	}
	//list the methods
	public void showInfo() {
		super.showInfo();
		System.out.println("Your Chequing Account features"+
		"\nDebit Card Number: "+debitCardNumber+
		"\nDebit Card Pin: "+debitCardPin
		);
	}
}
