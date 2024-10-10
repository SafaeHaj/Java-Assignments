package practice.exceptions;

public class User {
	int age;
	
	public User() {
	}
	public void setAge(int newAge) throws InvalidAgeException {
		if (newAge < 0 || newAge > 120) {
			throw new InvalidAgeException("Invalid age!");
		}
		age = newAge;
	}
}
