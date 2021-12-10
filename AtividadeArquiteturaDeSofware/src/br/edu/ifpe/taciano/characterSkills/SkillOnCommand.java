package br.edu.ifpe.taciano.characterSkills;

import br.edu.ifpe.taciano.characterClasses.Character;

public class SkillOnCommand {
	
	Skill skill;
	
	public SkillOnCommand(Skill _skill) {
		this.skill = _skill;
	}
	
	public void useSkill(Character activeCharacter, Character targetCharacter) {
		skill.useSkill(activeCharacter, targetCharacter);
	}
}
