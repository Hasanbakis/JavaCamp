package Abstract;

import Entities.Customer;

public interface CustomerService {
	void add(Customer customer);
	void delete(Customer customer);
	void updated(Customer customer);

}
