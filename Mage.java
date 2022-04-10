package epitech;

class Mage extends Character{
	Mage(String name) {
		this.Name=name;
		RPGClass="Mage";
		life=70;
		agility=10;
		strength=3;
		wit=10;
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

