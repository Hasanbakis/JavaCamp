package assignment.Concrete;

import assignment.Abstract.CustomerCheckService;
import assignment.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		return true;
	}

}
