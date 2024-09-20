public class SoftSkill extends Skill {
	// The purpose of this class is to represent a soft skill with a name and level.

	// Constructor for SoftSkill
	public SoftSkill(String name, int level) {
		super(name, "Soft", level);
	}

	// Identify the soft skill and its level
	public void identifySkill() {
		System.out.println("Soft Skill of " + getName() + " has a level of " + getLevel());
	}

}
