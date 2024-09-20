public class SoftSkill extends Skill {

	public SoftSkill(String name, int level) {
		super(name, "Soft", level);
	}

	public void identifySkill() {
		System.out.println("Soft Skill of " + getName() + " has a level of " + getLevel());
	}

}
