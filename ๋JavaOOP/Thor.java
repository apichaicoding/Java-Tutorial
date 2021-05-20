class Thor extends SuperHero implements SkillHero {
    private String skill;

    public void skill(String skill) {
        System.out.println("Skill " + skill);
    }

    public void moning(String moving) {
    }

    public void weapon(String weapon) {
        System.out.println("Weapon "+weapon);
    }

    public void jumping(String jump) {
    }
}
