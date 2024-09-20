public class HardSkill extends Skill {

	public HardSkill(String name, int level) {
		super(name, "Hard", level);
	}

	public void identifySkill() {
		System.out.println("Hard Skill of " + getName() + " has a level of " + getLevel());
	}
}
