public abstract class Skill {
	// Attributes
	private final String name;
	private final String type;
	private final int skillLevel;

	// Constructor
	protected Skill(String name, String type, int skillLevel) {
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

	public String getType() {
		return type;
	}

	public int getLevel() {
		return skillLevel;
	}

	// Method to identify the skill
	public abstract void identifySkill();
}