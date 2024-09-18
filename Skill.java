public abstract class Skill {

	// Enum for skill types. Ensures data integrity.
	protected enum SkillEnum {
		HARD, SOFT, GIFT, TALENT
	}

	// Attributes
	private final String name;
	private final SkillEnum type;
	private final int skillLevel;

	// Constructor
	public Skill(String name, SkillEnum type, int skillLevel) {
		this.name = name;
		this.type = type;
		// Ensure skillLevel is in between 1 and 10
		if (skillLevel < 1 || skillLevel > 10) {
			throw new IllegalArgumentException("Level must be between 1 and 10");
		}
		this.skillLevel = skillLevel;
	}

	// Getter methods
	public String getName() {
		return name;
	}

	public SkillEnum getType() {
		return type;
	}

	public int getLevel() {
		return skillLevel;
	}

	// Method to identify the skill
	public void identifySkill() {
		System.out.println(type + " Skill of " + name + " has a level of " + skillLevel);
	}
}