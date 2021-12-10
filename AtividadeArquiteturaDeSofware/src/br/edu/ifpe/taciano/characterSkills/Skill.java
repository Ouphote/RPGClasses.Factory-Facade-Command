package br.edu.ifpe.taciano.characterSkills;

import br.edu.ifpe.taciano.characterClasses.Character;

public class Skill implements ISkill {

	protected String skillName;
	protected String skillDescription;
	protected int mpCoust;
	
	public Skill(String _skillName, String _skillDescription, int _mpCoust) {
		this.skillName = _skillName;
		this.skillDescription = _skillDescription;
		this.mpCoust = _mpCoust;
	}
	
	public String getSkillName() {
		return this.skillName;
	}
	public String getSkillDescription() {
		return this.skillDescription;
	}
	public int getMpCoust() {
		return this.mpCoust;
	}

	@Override
	public void useSkill(Character activeCharacter, Character targetCharacter) {
		System.out.println(activeCharacter.getCharName() + " used " + this.getSkillName());
		System.out.println(this.getSkillDescription());		
	}
}
