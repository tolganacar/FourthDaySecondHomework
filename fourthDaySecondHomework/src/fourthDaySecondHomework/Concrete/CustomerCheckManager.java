package fourthDaySecondHomework.Concrete;

import fourthDaySecondHomework.Abstract.CustomerCheckService;
import fourthDaySecondHomework.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;
		
	}

}
