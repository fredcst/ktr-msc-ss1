package epitech;

class Warrior extends Character{
	Warrior(String name) {
		this.Name=name;
		RPGClass="Warrior";
		life=100;
		agility=8;
		strength=10;
		wit=2;
	      System.out.println(this.Name+": My name will go down in history!");
	}
	
	public void attack(String weapon) {
		if (weapon.equals("hammer")||weapon.equals("sword")) {
			attackOrNot = true;
			super.attack("blabla");
			System.out.println(this.Name+": I'll crush you with my "+weapon+"!");
		}
	}
	public void moveRight(){
	System.out.println(Name+": Moves right like a bad boy.");		
	}
	public void moveLeft(){
	System.out.println(Name+": Moves left like a bad boy.");		
	}
	public void moveForward(){
	System.out.println(Name+": Moves forward like a bad boy.");		
	}
	public void moveBack(){
	System.out.println(Name+": Moves back like a bad boy.");		
	}
}

