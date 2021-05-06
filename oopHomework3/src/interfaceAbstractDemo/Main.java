package interfaceAbstractDemo;

import interfaceAbstractDemo.abstracts.BaseCustomerManager;
import interfaceAbstractDemo.adapters.MernisServiceAdapter;
import interfaceAbstractDemo.concrete.StarbucksCustomerManager;
import interfaceAbstractDemo.entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception {

		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());

		Customer customer = new Customer(1, "Adem", "Korkut", 1995, "21243828618");
		customerManager.save(customer);
	}

}
