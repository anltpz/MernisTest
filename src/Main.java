import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concreate.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager baseCustomerManager= new StarbucksCustomerManager(new MernisServiceAdapter());
		Customer customer = new Customer();
		customer.setFirstName("Anýl");
		customer.setDateofBirth(1996);
		customer.setLastName("topuz");
		customer.setNationalityId("34648027228");
		baseCustomerManager.save(customer);
		
		

	}

}
