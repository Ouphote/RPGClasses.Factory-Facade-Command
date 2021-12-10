package br.edu.ifpe.taciano.characterFactory;

import br.edu.ifpe.taciano.characterClasses.ArcanistCharacter;
import br.edu.ifpe.taciano.characterClasses.BarbarianCharacter;
import br.edu.ifpe.taciano.characterClasses.Character;
import br.edu.ifpe.taciano.characterClasses.HunterCharacter;
import br.edu.ifpe.taciano.characterClasses.ThiefCharacter;
import br.edu.ifpe.taciano.characterClasses.WarriorCharacter;
import br.edu.ifpe.taciano.classes.CharacterClasses;

public class CharacterFactory {

	public Character createCharacter(String _charName, int level, int str, int con, int dex, int inte, int wis, int cha, CharacterClasses charClass) {
		if (charClass.equals(CharacterClasses.Arcanist)) {
			return new ArcanistCharacter(_charName, level, str, con, dex, inte, wis, cha);
		} else if (charClass.equals(CharacterClasses.Barbarian)) {
			return new BarbarianCharacter(_charName, level, str, con, dex, inte, wis, cha);
		} else if (charClass.equals(CharacterClasses.Hunter)) {
			return new HunterCharacter(_charName, level, str, con, dex, inte, wis, cha);
		} else if (charClass.equals(CharacterClasses.Thief)) {
			return new ThiefCharacter(_charName, level, str, con, dex, inte, wis, cha);
		} else if (charClass.equals(CharacterClasses.Warrior)) {
			return new WarriorCharacter(_charName, level, str, con, dex, inte, wis, cha);
		} else {
			return null;
		}
	}
}
