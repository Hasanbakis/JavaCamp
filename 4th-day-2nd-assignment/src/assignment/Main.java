package assignment;
import java.sql.Date;


import Adapters.MernisServiceAdapter;
import assignment.Abstract.BaseCustomerManager;
import assignment.Concrete.NeroCustomerManager;
import assignment.Concrete.StarbucksCustomerManager;
import assignment.Entities.Customer;




public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager2 = new StarbucksCustomerManager(new MernisServiceAdapter());
		
		Date dateOfBirth = new Date(1998,9,5);
		Customer customer = new Customer(1, "Hasan", "Bakis", "1712150641", dateOfBirth);
		 customerManager2.save(customer);
		
		
		BaseCustomerManager customerManager1 = new NeroCustomerManager();
	   
	    customerManager1.save(customer);
		
	        
	        
	        
	
	
		
		
	}

}
