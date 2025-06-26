package branchapplication;

import java.util.ArrayList;
import java.util.List;

public class Branch {
	
	private String branch_name;
	private List<Customer> customers;
	
	public String getBranch_name() {
		return branch_name;
	}

	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public Branch(String branchName) {
        this.branch_name = branchName;
        this.customers = new ArrayList<>();
    }
	
	public void addCustomer(Customer customer) {
        customers.add(customer);
 //       System.out.println(customer.getCust_name() + " added to " + branch_name);
    }
	
	public void showCustomerList() {
        System.out.println("\nCustomers in " + branch_name + ":");
        if (customers.isEmpty()) {
            System.out.println("No customers in this branch yet.");
        } else {
            for (Customer c : customers) {
                System.out.println(c);
            }
        }
    }
}
