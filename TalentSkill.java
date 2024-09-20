public class TalentSkill extends Skill {
	// The purpose of this class is to represent a talent skill with a name and level.

	// Constructor for TalentSkill
	public TalentSkill(String name, int level) {
		super(name, "Talent", level);
	}

	// Identify the talent skill and its level
	public void identifySkill() {
		System.out.println("Talent Skill of " + getName() + " has a level of " + getLevel());
	}

}
