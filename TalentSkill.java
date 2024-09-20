public class TalentSkill extends Skill {

	public TalentSkill(String name, int level) {
		super(name, "Talent", level);
	}

	public void identifySkill() {
		System.out.println("Talent Skill of " + getName() + " has a level of " + getLevel());
	}

}
