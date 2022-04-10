package epitech;

class Warrior extends Character{
	Warrior(String name) {
	      super(name,"Warrior");
	      super.life = 70;
	      super.strength = 3;
	      super.agility = 10;
	      super.wit = 10;
	      System.out.println(this.Name+": My name will go down in history!");
	}
	
	public void attack(String weapon) {
		if (weapon.equals("hammer")||weapon.equals("sword")) {
			attackOrNot = true;
			super.attack("blabla");
			System.out.println(this.Name+": I'll crush you with my "+weapon+"!");
		}
	}

}

