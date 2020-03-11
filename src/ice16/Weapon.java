package ice16;

public class Weapon {
	// Similarly, each time the warrior strikes a weapon, a damage is incurred on
	// the weapon. There needs to be an instance variable that keeps track of the
	// weapon's health. Let it be an integer called "health". Every weapon created
	// has the value 4 assigned to its health.
	String type;
	int power;
	String strikeMessage;
	int health;
	
	public Weapon(String type, int power, String strikeMessage, int health) {
		this.type = type;
		this.power = power;
		this.strikeMessage = strikeMessage;
		this.health = 4;
	}
	public int getPower() {
		return power;
	}
	// Change the signature of the method "strike" so it can return a boolean.
	public boolean strike() {
		if (health <= 0) {
			System.out.println("Weapon " + this.type + " cannot strike because it's damaged.");
			return false;
		}
		else {
			System.out.println("Weapon of type " + type + " has power " + power);
			System.out.println(strikeMessage);
			health --;
			return true;
		}
	}
	public void setPower(int pow) {
		power = pow;
	}
	// Create a method called "getType" which simply returns the name of the weapon.
	public String getType(){
		return type; }

}
