package Lab4;

public class exer1 {
	String name;
	double initial_balance;
	long account_num;
	double deposit;
	double withdraw;
	

	
	public exer1(String name, double initial_balance, long account_num, double deposit, double withdraw) {
		super();
		this.name = name;
		this.initial_balance = initial_balance;
		this.account_num = account_num;
		this.deposit = deposit;
		this.withdraw = withdraw;
	}

	

	public  void deposit() {
		

			System.out.println("balance "+(initial_balance));
			
	}	
	
	public  void withdraw() {
	
				
		
		System.out.println("balance : "+(initial_balance));
		
	}
			
			
}
