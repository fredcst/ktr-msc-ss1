package epitech;

abstract class Character{
	//Variables
	String Name;
	int life;
	int agility;
	int strength;
	int wit;
	String RPGClass;
	
	//Getters
	public String getName() {return Name;}
	public int getLife() {return life;}
	public int getAgility() {return agility;}
	public int getStrength() {return strength;}
	public int getWit() {return wit;}
	public String getRPGClass() {return RPGClass;}
	
	//Constructor
	Character(String name, String RPGClass){
		this.Name = name;
		this.RPGClass = RPGClass;
		life=50;
		agility=2;
		strength=2;
		wit=2;
	}
	
	protected boolean attackOrNot;
	public void attack(String blabla){
		if (attackOrNot) System.out.println(Name + ": Rrrrrrrrr....");
	}
}

class TestCharacter extends Character{
	   TestCharacter(String name) {
		      super(name,null);
		   }
}