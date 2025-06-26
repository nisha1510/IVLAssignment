package core_java_day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

class UserDetails{
	private String name;
	private String phoneNumber;
	private String email;
	private String dept;
	
	public UserDetails(String name, String phoneNumber, String email, String dept) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.dept = dept;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dept, email, name, phoneNumber);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserDetails other = (UserDetails) obj;
		return Objects.equals(dept, other.dept) && Objects.equals(email, other.email)
				&& Objects.equals(name, other.name) && Objects.equals(phoneNumber, other.phoneNumber);
	}
	@Override
	public String toString() {
		return "UserDetails [name=" + name + ", phoneNumber=" + phoneNumber + ", email=" + email + ", dept=" + dept
				+ "]";
	}
}
public class SortByDept {
	
	public static void main(String[] args) {	

		UserDetails[] details = { 
				new UserDetails("Jeevan", "9876543210", "jeevan@sim.com","IT"),
				new UserDetails("Nisha", "9123456789", "nisha@sim.com","Development"),
				new UserDetails("Chitti", "9988776655", "chitti@sim.com","IT"),
				new UserDetails("Rajani", "9088776655", "rajani@sim.com","Hr") 
				
		};
		Set<UserDetails> detailSet = new HashSet<>();
		Collections.addAll(detailSet, details);
		
		List<UserDetails> sortedByDept = new ArrayList<>(detailSet);
//		sortedByDept.sort(Comparator.comparing(Contact::getName, String.CASE_INSENSITIVE_ORDER));
		Collections.sort(sortedByDept, new Comparator<UserDetails>() {
		    public int compare(UserDetails u1, UserDetails u2) {
		        int result = u1.getDept().compareToIgnoreCase(u2.getDept());
		        if (result == 0) {
		            // If departments are same, sort by name
		            return u1.getName().compareToIgnoreCase(u2.getName());
		        }
		        return result;
		    }
		});
		for (UserDetails user : sortedByDept) {
		    System.out.println(user);
		}
	}
}
