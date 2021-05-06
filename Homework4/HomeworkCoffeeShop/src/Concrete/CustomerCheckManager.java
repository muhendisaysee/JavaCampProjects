package Concrete;

import Abstract.ICustomerCheckService;
import Abstract.ICustomerService;
import Entity.Customer;

public class CustomerCheckManager implements ICustomerCheckService{

	@Override
	public Boolean CheckIfReelPerson(Customer customer) {
		
		return true;
	}

}
