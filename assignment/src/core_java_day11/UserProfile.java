package core_java_day11;

import java.util.HashSet;
import java.util.Set;

public class UserProfile {
	private String name;
	private String email;
	private Set<String> interests = new HashSet<>();

	public UserProfile(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public void addInterest(String interest) throws DuplicateInterestException {
		if (!interests.add(interest)) {
			throw new DuplicateInterestException("Interest '" + interest + "' already exists for " + name);
		}
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public Set<String> getInterests() {
		return interests;
	}

	public void showProfile() {
		System.out.println("Name: " + name);
		System.out.println("Email: " + email);
		System.out.println("Interests: " + interests);
	}
}
