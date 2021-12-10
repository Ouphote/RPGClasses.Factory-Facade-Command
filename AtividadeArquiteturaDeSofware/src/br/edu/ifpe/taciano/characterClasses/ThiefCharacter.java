package br.edu.ifpe.taciano.characterClasses;

public class ThiefCharacter extends Character {

	public ThiefCharacter(String _charName, int _level, int str, int con, int dex, int inte, int wis, int cha) {
		this.charName = _charName;
		this.level = _level;
		this.strength = str;
		this.constituition = con;
		this.dexterity = dex;
		this.inteligence = inte;
		this.wisdom = wis;
		this.charisma = cha;
		
		calcStats(12, 3, 4);
		
		System.out.println("New thief character created.");
	}
}
