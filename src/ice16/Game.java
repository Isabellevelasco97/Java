package ice16;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Weapon mean = new Weapon("Mean Words", 1, "Mean words cause very little damage", 4);
		Weapon bat = new Weapon("Baseball Bat", 10, "Some properties got destroyed", 4);
		Weapon gun = new Weapon("Handgun", 100, "Stronger than a baseball bat", 4);
		Weapon bazooka = new Weapon("Bazooka", 200, "Major destruction", 4);
		Weapon laChancla = new Weapon("La Chancla", 4000, "Total annihilation", 4);
		
		Warrior w1 = new Warrior(28, "Skeletor", 20, mean, 0);
		Warrior w2 = new Warrior(19, "Striker", 18, bat, 0);
		
		// In the main method of Game class delete everything after the warrior
		// creation.We want each warrior to attack 4 times. Then w1 attacks one more
		// time, this time the weapon should be too damaged so the warrior cannot
		// attack.
		w1.attack();
		w2.attack();
		w1.attack();
		w2.attack();
		w1.attack();
		w2.attack();
		w1.attack();
		w2.attack();
		w1.attack();
		// We hand bazooka to warrior1 by calling assignWeaponThe second warrior
		// attacks, but their weapon is also broken so they cannot attack. We hand
		// laChancla to the second warrior.We call attack on the first warrior one last
		// time and the game is over.
		w1.assignWeapon(bazooka);
		w2.attack();
		w2.assignWeapon(laChancla);
		w1.attack();
		// In the end print each warrior's expLevel by calling
		// getExpLevel on them.
		System.out.println(w1.getExpLevel());
		System.out.println(w2.getExpLevel());
		// my output:
//		Warrior, Skeletor with experience level 20 attacks!
//		Weapon of type Mean Words has power 1
//		Mean words cause very little damage
//		Warrior, Striker with experience level 18 attacks!
//		Weapon of type Baseball Bat has power 10
//		Some properties got destroyed
//		Warrior, Skeletor with experience level 20 attacks!
//		Weapon of type Mean Words has power 1
//		Mean words cause very little damage
//		Warrior, Striker with experience level 18 attacks!
//		Weapon of type Baseball Bat has power 10
//		Some properties got destroyed
//		Warrior, Skeletor with experience level 20 attacks!
//		Weapon of type Mean Words has power 1
//		Mean words cause very little damage
//		Warrior, Striker with experience level 18 attacks!
//		Weapon of type Baseball Bat has power 10
//		Some properties got destroyed
//		Warrior, Skeletor with experience level 20 attacks!
//		Weapon of type Mean Words has power 1
//		Mean words cause very little damage
//		Warrior, Striker with experience level 18 attacks!
//		Weapon of type Baseball Bat has power 10
//		Some properties got destroyed
//		Warrior, Skeletor with experience level 21 attacks!
//		Weapon Mean Words cannot strike because it's damaged.
//		The warrior could not attack
//		Skeletor now has Bazooka
//		Warrior, Striker with experience level 19 attacks!
//		Weapon Baseball Bat cannot strike because it's damaged.
//		The warrior could not attack
//		Striker now has La Chancla
//		Warrior, Skeletor with experience level 21 attacks!
//		Weapon of type Bazooka has power 200
//		Major destruction
//		21
//		19


	}

}
