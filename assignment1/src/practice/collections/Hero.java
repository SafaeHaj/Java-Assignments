package practice.collections;

public class Hero {
	private String name; 
	private int strength;
	private int charisma;
	private int intelligence;
	
	// The classic hero is a himbo, that's why intelligence == 0
	Hero() {
		this.name = "HeMan";
		this.strength = 100;
		this.charisma = 70;
		this.intelligence = 0;
	}
	
	Hero(String _name, int _strength, int _charisma, int _intelligence) {
		this.name = _name;
		this.strength = _strength;
		this.charisma = _charisma;
		this.intelligence = _intelligence;
	}
	
	public Integer getAverage() {
		return (this.strength + this.charisma + this.intelligence)/3;
	}

	@Override
	public String toString() {
		return name + ": (Strength: " + this.strength + ", Charisma: "+ this.charisma + ", Intelligence: " + this.intelligence +") ";
	}
}
