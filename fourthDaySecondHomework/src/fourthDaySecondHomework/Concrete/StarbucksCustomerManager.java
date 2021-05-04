package fourthDaySecondHomework.Concrete;

import fourthDaySecondHomework.Abstract.BaseCustomerManager;
import fourthDaySecondHomework.Abstract.CustomerCheckService;
import fourthDaySecondHomework.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	CustomerCheckService customerCheckService;
	

	@Override
	public void save(Customer customer) {
		if(customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("Saved : " + customer.getFirstName());
		}else {
			System.out.println("Not a valid person");
		}
	}

}
