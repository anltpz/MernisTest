package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		 boolean result = false;
		 try {
			 
			 result=client.TCKimlikNoDogrula
					 (
							 Long.parseLong(customer.getNationalityId()),
							 customer.getFirstName().toUpperCase(),
							 customer.getLastName().toUpperCase(),
							 customer.getDateofBirth());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
		 return result;
	}

}
