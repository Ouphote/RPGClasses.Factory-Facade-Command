package br.edu.ifpe.taciano.characterSkills;

import br.edu.ifpe.taciano.characterClasses.Character;

public interface ISkill {

	public void useSkill(Character activeCharacter, Character targetCharacter);
}
