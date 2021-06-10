package Lab4;

public class savings_account extends exer1{
	double minimum_balance;
	

	


	public savings_account(String name, double initial_balance, long account_num, double deposit, double withdraw,
			double minimum_balance) {
		super(name, initial_balance, account_num, deposit, withdraw);
		this.minimum_balance = minimum_balance;
	}


	@Override
	public void withdraw() {
		
		
		if((initial_balance-withdraw)>=minimum_balance) {
			System.out.println(initial_balance-withdraw);
		}
		else {
			System.out.println("error");
		}
	}
	
	
	
	

}
