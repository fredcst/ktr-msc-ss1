package epitech;

class Mage extends Character{
	Mage(String name) {
	      super(name,"Mage");
	      super.life = 70;
	      super.strength = 3;
	      super.agility = 10;
	      super.wit = 10;
	      System.out.println(this.Name+": May the gods be with me.");
	}
	
	public void attack(String weapon) {
		if (weapon.equals("wand")||weapon.equals("magic")) {
			attackOrNot = true;
			super.attack("blabla");
			System.out.println(this.Name+": Feel the power of my "+weapon+"!");
		}
	}
	
}

