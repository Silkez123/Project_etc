package WindowTest;


public class Character { // also applies to enemies
	
	private String name;
	private double health;
	private double mana;// for mage or magic item
	private double attack; 
	private double dexterity; // determine the ability to wield certain equipment, parry and counter attack, or dodge
	private double luck; // determine the XP gains, or chance to deal critical damage
	
	private double gold;
	

	protected Character(String name, double health, double mana, double attack, double dexterity, double luck)
	{
		this.name = name;
		this.health = health;
		this.mana = mana;
		this.attack = attack;
		this.dexterity = dexterity;
		this.luck = luck;
	}
	
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	public double getHealth() {return health;}
	public void setHealth(double health) {this.health = health;}
	
	public double getMana() {return mana;}
	public void setMana(double mana) {this.mana = mana;}
	
	public double getAttack() {return attack;}
	public void setAttack(double attack) {this.attack = attack;}
	
	public double getDex() {return dexterity;}
	public void setDEX(double dexterity) {this.dexterity = dexterity;}
	
	public double getLuck() {return luck;}
	public void setLuck(double luck) {this.luck = luck;}
	
	public double getGold() {return gold;}
	public void setGold(double gold) {this.gold = gold;}

}
