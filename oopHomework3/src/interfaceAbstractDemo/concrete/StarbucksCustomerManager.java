package interfaceAbstractDemo.concrete;

import interfaceAbstractDemo.abstracts.BaseCustomerManager;
import interfaceAbstractDemo.abstracts.CustomerCheckService;
import interfaceAbstractDemo.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private CustomerCheckService _customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this._customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		if (_customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		} else {
			System.out.println(customer.getFirstName() + " " + customer.getLastName() + " No customer found");
		}

	}

}
