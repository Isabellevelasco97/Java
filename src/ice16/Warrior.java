package ice16;

public class Warrior {
	// For this, we need another instance variable to keep track of the warrior's
	// experience. This could be an integer that has the default value of zero.
	// Let's call it "experience". Each time the method "attack" is called, if the
	// weapon can strike, we increment the experience and after doing that, if the
	// experience level is over 5, we reset the experience to zero and increment the
	// level of the warrior.
	int age;
	String name;
	int expLevel;
	Weapon weapon;
	int experience;
	
	public Warrior(int age, String name, int expLevel, Weapon weapon, int experience) {
		this.age = age;
		this.name = name;
		this.expLevel = expLevel;
		this.weapon = weapon;
		this.experience = 0;
	}
	public void attack() {
		System.out.println("Warrior, " + name + " with experience level " + expLevel + " attacks!");
		if (weapon.strike()) {
			experience++;
			if (experience >= 4) {
				expLevel ++;
				experience = 0;
				// Reset the experience and increment expLevel
			}
		} else {
			System.out.println("The warrior could not attack");}
	}
	// Modify the "assignWeapon" method so it prints out the following message each
	// time it's called.println(this.name + " now has " + weapon.getType());
	public void assignWeapon(Weapon Weapon) {
		weapon = Weapon;
		System.out.println(this.name + " now has " + weapon.getType());
	}
	// Create a new method called getExpLevel that returns the expLevel of the warrior
	public int getExpLevel() {
		return expLevel;
	}
	
}
