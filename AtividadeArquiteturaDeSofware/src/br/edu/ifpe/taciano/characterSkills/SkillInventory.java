package br.edu.ifpe.taciano.characterSkills;

import java.util.ArrayList;

import br.edu.ifpe.taciano.characterClasses.Character;

public class SkillInventory {

	public Character character;
	public ArrayList<Skill> skills = new ArrayList<Skill>();
	
	public SkillInventory(Character _character) {
		this.character = _character;
	}
	
	public void addSkill(Skill skill) {
		skills.add(skill);
	}
	
	public void useSkill(int i, Character targetCharacter) {
		skills.get(i).useSkill(character, targetCharacter);
	}
}
