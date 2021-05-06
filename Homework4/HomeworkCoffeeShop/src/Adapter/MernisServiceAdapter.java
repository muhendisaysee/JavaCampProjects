package Adapter;

import java.rmi.RemoteException;

import Abstract.ICustomerCheckService;
import Entity.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService {

	@Override
	public Boolean CheckIfReelPerson(Customer customer) {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			
			return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getDateOfBirth().getYear());
		
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
		
	}

}
