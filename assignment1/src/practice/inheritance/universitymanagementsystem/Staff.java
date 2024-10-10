package practice.inheritance.universitymanagementsystem;

public class Staff extends Person implements Payable{
	private int staffId;
	private String role;
	
	public void performDuty() {
		System.out.println("I am dilligently performing my duty!! Only God knows what it is though- someone at HR");
	}
	
	@Override
	public double calculateSalary() {
		return 20000;
	}
	
	public Staff(String name, int age, String address, int staffId, String role) {
		super(name, age, address);
		this.staffId = staffId;
		this.role = role;
	}
	
	public int getStaffId() {
		return staffId;
	}
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
}
