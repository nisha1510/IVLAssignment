package core_java_day15;

public class User {
	private String name;
	private String email;

	public User(String name, String email) {
		super();
		this.name = name;
		this.email = validateAndFormatEmail(email);
	}

	private String validateAndFormatEmail(String email) {

		if (email == null) {
			throw new IllegalArgumentException("Email can not be null");
		}
		email = email.trim().toLowerCase();

		if (!email.contains("@") || !email.endsWith(".com")) {
			throw new IllegalArgumentException("Invalid email format");
		}
		return email;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}
}
