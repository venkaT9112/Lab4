package Lab4next;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Lab4.exer2Employee;


public class exer2EmployeService extends exer2Employee {
	
	
public void employeedetails() throws IOException {	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	 System.out.print("Enter emp id : ");
     String b=br.readLine();
    int id=Integer.parseInt(b);
  
    System.out.print("Enter Name : ");
     String name=br.readLine();
 
     System.out.print("Enter designation : ");
     String designation=br.readLine();
   

     System.out.print("Enter salary : ");
     String c=br.readLine();
     int salary=Integer.parseInt(c);
  
     
   
  
     

	if((salary>20000 && salary<50000) && designation=="analyst") {
		
		insuranceScheme=200000;
		System.out.println("Insurancescheme of 200000");
	}
	else if((salary>20000 && salary<50000) && designation=="softwareengineer") {
		
		insuranceScheme=300000;
		System.out.println("Insurancescheme of 300000");
	}
	else if((salary>50000 && salary<100000) && designation=="hr") {
		insuranceScheme=1000000;
		System.out.println("Insurancescheme of 1000000");
	}
	else {
		System.out.println("No scheme");
	}
	
	  
	System.out.println("EMployee details : ");
	
	
	System.out.println(id);
	System.out.println(name);
	System.out.println(designation);
	System.out.println(insuranceScheme);
	System.out.println(salary);
	System.out.println(a);
}


public void Services() {
	System.out.println("Servies offered by the system : ");
	System.out.println("[1] healthinsurance");
	System.out.println("[2] houseloan");
	System.out.println("[3] carloan");
	System.out.println("[4] studyloan");
	
	
}
}

