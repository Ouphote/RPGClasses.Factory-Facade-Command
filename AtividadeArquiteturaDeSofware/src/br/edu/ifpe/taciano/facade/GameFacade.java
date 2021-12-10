package br.edu.ifpe.taciano.facade;

import br.edu.ifpe.taciano.characterFactory.CharacterFactory;
import br.edu.ifpe.taciano.characterSkills.Skill;
import br.edu.ifpe.taciano.characterSkills.SkillDamage;
import br.edu.ifpe.taciano.characterSkills.SkillInventory;
import br.edu.ifpe.taciano.classes.CharacterClasses;
import br.edu.ifpe.taciano.characterClasses.Character;

public class GameFacade {

	CharacterFactory charFac;
	
	Character[] chars;
	Skill[] skills;
	SkillInventory[] skillInventorys;
	
	public GameFacade() {
		charFac = new CharacterFactory();
	}
	
	public void createCharacters() {
		chars = new Character[2];
		chars[0] = charFac.createCharacter("Gibblin", 5, 1, 2, 0, 4, 3, 0, CharacterClasses.Arcanist);
		chars[1] = charFac.createCharacter("Kael", 5, 1, 3, 1, 4, 1, 1, CharacterClasses.Thief);
	}
	
	public void createSkills() {
		skills = new Skill[2];
		skills[0] = new Skill("Change form", "The user uses magic to change him fisic form.", 4);
		skills[1] = new SkillDamage("Furtive Attack", "The user attacks the enemy off guard, it causes a great damage.", 2, 10);
		
		skillInventorys = new SkillInventory[2];
		skillInventorys[0] = new SkillInventory(chars[0]);
		skillInventorys[1] = new SkillInventory(chars[1]);
		
		skillInventorys[0].addSkill(skills[0]);
		skillInventorys[1].addSkill(skills[1]);
	}
	
	public void executeCharActions() {
		skillInventorys[0].useSkill(0, chars[1]);
		skillInventorys[1].useSkill(0, chars[0]);
	}
}
