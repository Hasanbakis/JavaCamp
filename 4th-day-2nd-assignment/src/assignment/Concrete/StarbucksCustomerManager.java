package assignment.Concrete;

import assignment.Abstract.BaseCustomerManager;
import assignment.Abstract.CustomerCheckService;
import assignment.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void save(Customer customer) {
		if(customerCheckService.CheckIfRealPerson(customer)) {
			
			System.out.println("Authenticated");
			
		}else {
			System.out.println("Not a valid person");
		}
		
	}
	
	
}
