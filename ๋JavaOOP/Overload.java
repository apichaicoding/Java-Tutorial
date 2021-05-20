class Overload {
    // Overload
    public void skill() {
        System.out.println("No Skill");
    }

    public void skill(String language) {
        System.out.println("Skill = " + language);
    }

    public void skill(String l1, String l2) {
        System.out.println("Skill = " + l1 + ", " + l2);
    }

    public void skill(String... language/* String array */) {
        for (int i = 0; i < language.length; i += 1) {
            System.out.println("Skill = " + language[i]);
        }

    }
}
