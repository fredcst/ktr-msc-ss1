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
	
	public void attack(String weapon) throws WeaponException {
		if(weapon.isEmpty()) throw new WeaponException(Name + ": I refuse to fight with my bare hands.");
		if (weapon.equals("wand")||weapon.equals("magic")) {
			attackOrNot = true;
			super.attack("blabla");
			System.out.println(this.Name+": Feel the power of my " + weapon + "!");
		}
	}
	
	public void moveRight(){
		System.out.println(Name + ": Moves right furtively.");		
	}
	public void moveLeft(){
		System.out.println(Name + ": Moves left furtively.");		
	}
	public void moveForward(){
		System.out.println(Name + ": Moves forward furtively.");		
	}
	public void moveBack(){
		System.out.println(Name + ": Moves back furtively.");		
	}
	public void tryToAttack(String arg){
		try{
			if(arg!="" && arg!="wand" && arg!="magic")
				throw new WeaponException(Name + " : I don't need this stupid " + arg + "! Don't misjudge my powers !");
			attack(arg);
		}
		catch(WeaponException e)
		{
			System.out.println(e.getMessage());		
		}

	}
	
}

