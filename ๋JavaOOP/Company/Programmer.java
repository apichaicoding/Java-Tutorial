package Company;
class Programmer extends Employee {
    // method
    public void showProgrammer() {
        setId("1");
        setName("Api");
        setSalary(45215.0);
    }

    // public Programmer(String name, String salary) {
    // //super use class superConstructor
    // super(name,salary);
    // System.out.println("I am Programmer >_< ");
    // }

    public void bonus() {
        System.out.println("Bonus = 20%");
    }
}
