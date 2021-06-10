package Lab4;

public class currentaccount extends exer1 {
	double overdraftlimit;
	

	
	public currentaccount(String name, double initial_balance, long account_num, double deposit, double withdraw,
			double overdraftlimit) {
		super(name, initial_balance, account_num, deposit, withdraw);
		this.overdraftlimit = overdraftlimit;
	}


	


	@Override
	public void deposit() {
		
		if(initial_balance+deposit<=overdraftlimit) {
			System.out.println(initial_balance+deposit);
		}
		else {
			System.out.println("error");
		}
	}
	
	

}
