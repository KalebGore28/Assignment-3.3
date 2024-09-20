public class HardSkill extends Skill {
	// The purpose of this class is to represent a hard skill with a name and level.

	// Constructor for HardSkill
	public HardSkill(String name, int level) {
		super(name, "Hard", level);
	}

	// Identify the hard skill and its level
	public void identifySkill() {
		System.out.println("Hard Skill of " + getName() + " has a level of " + getLevel());
	}
}
