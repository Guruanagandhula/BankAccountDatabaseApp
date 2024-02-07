package bankaccount;

public class Savings extends Account{
	//properties of savings account
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	
	//constructor for savings account
	public Savings(String name,String sSN,double initDeposit) {
		super(name,sSN,initDeposit);
		accountNumber="1"+accountNumber;
		setSafetyDepositBox();
		
	}
	@Override
	public void setRate() {
		rate= getBaseRate()-.25;
		//System.out.println("Implement Rate for Savings");
	}
	private void setSafetyDepositBox() {
		safetyDepositBoxID =(int)(Math.random() * Math.pow(10, 3));
		safetyDepositBoxKey =(int)(Math.random() * Math.pow(10, 4));
		//System.out.println(safetyDepositBoxID);
	}
	//list the methods
	public void showInfo() {
		
		//System.out.println("Account Type: Savings");
		super.showInfo();
		System.out.println("Your Savings Account Features"+
		"\nSafety Deposit Box ID: "+safetyDepositBoxID+
		"\nSafety Deposit Box Key: "+safetyDepositBoxKey
		);
	}
	
}
