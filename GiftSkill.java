public class GiftSkill extends Skill {

	public GiftSkill(String name, int level) {
		super(name, "Gift", level);
	}

	public void identifySkill() {
		System.out.println("Gift Skill of " + getName() + " has a level of " + getLevel());
	}
}
