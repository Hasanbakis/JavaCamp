package Concrete;

import Abstract.CustomerCheckService;
import Abstract.CustomerService;
import Abstract.LoggerService;
import Entities.Customer;
import Utils.Runner;

public class CustomerManager implements CustomerService{
	private CustomerCheckService customerCheckService;
	private LoggerService[] loggerService;

	public CustomerManager(CustomerCheckService customerCheckService, LoggerService[] loggerService) {
		super();
		this.customerCheckService = customerCheckService;
		this.loggerService = loggerService;
	}

	@Override
	public void add(Customer customer) {
		if(customerCheckService.checkIfRealPerson(customer)) {
			System.out.println(customer.getFirstName()+" added");
		}else {
			System.out.println("Not a valid person");
		}
		Runner.runLoggers(loggerService, "Adding");
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println(customer.getFirstName()+" deleted");
		Runner.runLoggers(loggerService, "Deletion");
	}

	@Override
	public void updated(Customer customer) {
		System.out.println(customer.getFirstName()+" updated");
		Runner.runLoggers(loggerService, "update");
	}

}
