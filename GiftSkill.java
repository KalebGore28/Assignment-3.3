public class GiftSkill extends Skill {
	// The purpose of this class is to represent a gift skill with a name and level.

	// Constructor for GiftSkill
	public GiftSkill(String name, int level) {
		super(name, "Gift", level);
	}

	// Identify the gift skill and its level
	public void identifySkill() {
		System.out.println("Gift Skill of " + getName() + " has a level of " + getLevel());
	}
}
