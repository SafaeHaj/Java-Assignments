package practice.inheritance.universitymanagementsystem;

public class Person {
	protected String name;
	protected int age;
	protected String address;
	
	
	public String displayInfo() {
		return "(name=" + name + ", age=" + age + ", address=" + address + ")";
	}

	public Person(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
