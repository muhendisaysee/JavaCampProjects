package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Abstract.ICustomerService;
import Entity.Customer;

public class NeroCustomerManager extends BaseCustomerManager{

	private ICustomerCheckService customerService;
	
	
	
	public NeroCustomerManager(ICustomerCheckService customerService) {
		super();
		this.customerService = customerService;
	}

	@Override
	public void save(Customer customer) {
		super.save(customer);
	}

}
