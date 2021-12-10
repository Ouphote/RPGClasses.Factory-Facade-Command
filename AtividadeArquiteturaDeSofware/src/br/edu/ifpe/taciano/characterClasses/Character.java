package br.edu.ifpe.taciano.characterClasses;

public abstract class Character {

	protected String charName;
	protected int level;
	protected int hp, mp;
	protected int currentHp, currentMp;
	protected int strength, constituition, dexterity, inteligence, wisdom, charisma;
	
	protected void calcStats(int startHP, int hpPerLevel, int mpPerLevel) {
		this.hp = (startHP + constituition) + ((hpPerLevel + constituition) * (level - 1));
		this.currentHp = this.hp;
		this.mp = mpPerLevel * level;
		this.currentMp = this.mp;
	}

	public String getCharName() {
		return this.charName;
	}

	public int getLevel() {
		return this.level;
	}

	public int getCurrentHp() {
		return this.currentHp;
	}

	public int getCurrentMp() {
		return this.currentMp;
	}
	
	public void takeDamage(int dmg) {
		System.out.println(this.charName + " taked " + dmg + " of damage!");
		
		if (this.currentHp < this.hp) {
			this.currentHp = 0;
		} else {
			this.currentHp -= dmg;
		}
	}
	
	public void recoverHp(int recover) {
		System.out.println(this.charName + " recovered " + recover + " of health points!");
		
		if (this.currentHp + recover > this.hp) {
			this.currentHp = this.hp;
		} else {
			this.currentHp += recover;
		}
	}
	
	public void useMp(int dmg) {
		if (this.currentMp < this.mp) {
			this.currentMp = 0;
		} else {
			this.currentMp -= dmg;
		}
	}
}
