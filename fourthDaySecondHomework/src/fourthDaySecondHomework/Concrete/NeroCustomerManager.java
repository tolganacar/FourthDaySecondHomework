package fourthDaySecondHomework.Concrete;

import fourthDaySecondHomework.Abstract.BaseCustomerManager;
import fourthDaySecondHomework.Abstract.CustomerCheckService;
import fourthDaySecondHomework.Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager{

	private CustomerCheckService customerCheckService;
	
	public NeroCustomerManager(CustomerCheckService customerCheckService) {
		customerCheckService = customerCheckService;
	}
	
	public void save(Customer customer) {
		if(customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("Saved : " + customer.getFirstName());
		}else {
			System.out.println("Not a valid person");
		}
	}
}
