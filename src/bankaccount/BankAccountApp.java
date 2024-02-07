package bankaccount;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		List<Account> accounts=new LinkedList<Account>();
		
		
		
		String file="/Users/guru/Downloads/NewBankAccounts.csv";
		
		List<String[]> newAccountHolders=utilities.CSV.read(file);
		for(String[] accountHolder:newAccountHolders) {
			
			String name= accountHolder[0];
			String sSN=accountHolder[1];
			String accountType=accountHolder[2];
			double initDeposit =Double.parseDouble(accountHolder[3]);
			//System.out.println(name+" "+sSN+""+accountType+"$"+initDeposit);
			if(accountType.equals("Savings")) {
				//System.out.println("Open a Savings Account");
				accounts.add(new Savings(name,sSN,initDeposit));
				
			}
			else if(accountType.equals("Chequing")) {
				//System.out.println("Open a Chequing Account");
				accounts.add(new Chequing(name,sSN,initDeposit));
			}
			else {
				System.out.println("Error Reading Account Type");
			}
		}
		
		for(Account acc:accounts) {
			System.out.println("******************");
			acc.showInfo();
		}

	}

}
