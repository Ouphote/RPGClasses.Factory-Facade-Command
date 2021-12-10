package br.edu.ifpe.taciano.characterSkills;

import br.edu.ifpe.taciano.characterClasses.Character;

public class SkillRecovery extends Skill {

	protected int skillRecovery;

	public int getSkillRecovery() {
		return this.skillRecovery;
	}
	
	public SkillRecovery(String _skillName, String _skillDescription, int _mpCoust, int _skillRecovery) {
		super(_skillName, _skillDescription, _mpCoust);
		this.skillRecovery = _skillRecovery;
	}

	@Override
	public void useSkill(Character activeCharacter, Character targetCharacter) {
		System.out.println(activeCharacter.getCharName() + " used " + this.getSkillName());
		System.out.println(this.getSkillDescription());	
		targetCharacter.recoverHp(this.skillRecovery);
	}
}
