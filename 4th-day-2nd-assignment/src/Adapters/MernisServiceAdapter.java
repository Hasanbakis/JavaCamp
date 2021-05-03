package Adapters;



import java.rmi.RemoteException;

import assignment.Abstract.CustomerCheckService;
import assignment.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoap soapClient = new KPSPublicSoapProxy();
		boolean result = false;
		
		try {
			 result = soapClient.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName().toUpperCase(),
						customer.getLastName().toUpperCase(),customer.getDateOfBirth().getYear());
			
		}catch (NumberFormatException e) {
			e.printStackTrace();
		}catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return result;
	}

}
