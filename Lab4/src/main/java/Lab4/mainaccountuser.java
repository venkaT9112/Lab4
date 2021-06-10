package Lab4;

public class mainaccountuser {

	public static void main(String[] args) {
		exer1[] v=new exer1[3];
		v[0]=new exer1("smith",2000,123456789,2000,2000);
		v[1]=new savings_account("kathy",3000,123456789,0,2500,1000);
		v[2]=new currentaccount("smith",2000,123456789,2000,0,200000);
	
		
		for(exer1 b:v) {
			b.deposit();
			b.withdraw();
		}

	}

}
