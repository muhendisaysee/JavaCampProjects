package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Abstract.ICustomerService;
import Entity.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{

	ICustomerCheckService customerCheckService;
	
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}


	@Override
	public void save(Customer customer) {
		try {
			if(customerCheckService.CheckIfReelPerson(customer)) {
			super.save(customer);
			}
			else {
				throw new Exception("Not a valid person");
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		

		
	}

}
