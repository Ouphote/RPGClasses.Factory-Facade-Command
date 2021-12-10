package br.edu.ifpe.taciano.characterSkills;

import br.edu.ifpe.taciano.characterClasses.Character;

public class SkillDamage extends Skill{

	protected int skillDamage;

	public int getSkillDamage() {
		return skillDamage;
	}

	public SkillDamage(String _skillName, String _skillDescription, int _mpCoust, int _skillDamage) {
		super(_skillName, _skillDescription, _mpCoust);
		this.skillDamage = _skillDamage;
	}

	@Override
	public void useSkill(Character activeCharacter, Character targetCharacter) {
		System.out.println(activeCharacter.getCharName() + " used " + this.getSkillName());
		System.out.println(this.getSkillDescription());	
		targetCharacter.takeDamage(this.skillDamage);
	}
}
