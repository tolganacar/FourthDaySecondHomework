package fourthDaySecondHomework;

import java.util.Date;

import Adapters.MernisServiceAdapter;
import fourthDaySecondHomework.Abstract.BaseCustomerManager;
import fourthDaySecondHomework.Concrete.NeroCustomerManager;
import fourthDaySecondHomework.Concrete.StarbucksCustomerManager;
import fourthDaySecondHomework.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new NeroCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1,"Tolga","Nacar",new Date(1999),"45967584514"));
		System.out.println();
	}

}
