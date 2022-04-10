package epitech;

abstract class Character implements Movable{
	//Variables
	String Name;
	String RPGClass="Character";
	int life=50;
	int agility=2;
	int strength=2;
	int wit=2;
	
	//Getters
	public String getName() {return Name;}
	public int getLife() {return life;}
	public int getAgility() {return agility;}
	public int getStrength() {return strength;}
	public int getWit() {return wit;}
	public String getRPGClass() {return RPGClass;}
	
	protected boolean attackOrNot;
	public void attack(String blabla){
		if (attackOrNot) System.out.println(Name + ": Rrrrrrrrr....");
	}
	public void moveRight(){
	System.out.println(Name+": Moves right");		
	}
	public void moveLeft(){
	System.out.println(Name+": Moves left");		
	}
	public void moveForward(){
	System.out.println(Name+": Moves forward");		
	}
	public void moveBack(){
	System.out.println(Name+": Moves back");		
	}
}