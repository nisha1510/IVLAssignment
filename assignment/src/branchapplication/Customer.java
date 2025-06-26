package branchapplication;

public class Customer {
	
	private int cust_id;
	private String cust_name;
	private String email;
	private long phonenumber;
	private String gender;
	private double accountBalance;
	
	public Customer(int cust_id, String cust_name, String email, long phonenumber, String gender,
			double accountBalance) {
		super();
		this.cust_id = cust_id;
		this.cust_name = cust_name;
		this.email = email;
		this.phonenumber = phonenumber;
		this.gender = gender;
		this.accountBalance = accountBalance;
	}

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	@Override
	public String toString() {
		return "Customer [cust_id=" + cust_id + ", cust_name=" + cust_name + ", email=" + email + ", phonenumber="
				+ phonenumber + ", gender=" + gender + ", accountBalance=" + accountBalance + "]";
	}
	
	
	
	 
}
