import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapter.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entity.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		
		Customer customer = new Customer(1, "Engin", "Demiroð", LocalDate.of(1985, 1, 6),"28812456784");
		
		customerManager.save(customer);
		System.out.println();
	}

}
