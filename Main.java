public class Main {

	public static void main(String[] args) {
		// Create instances of each skill type
		HardSkill hardSkill = new HardSkill("Java Programming", 8);
		SoftSkill softSkill = new SoftSkill("Communication", 5);
		GiftSkill giftSkill = new GiftSkill("Mercy", 9);
		TalentSkill talentSkill = new TalentSkill("Organization", 7);

		// Print out the skills
		hardSkill.identifySkill();
		softSkill.identifySkill();
		giftSkill.identifySkill();
		talentSkill.identifySkill();
	}

}
