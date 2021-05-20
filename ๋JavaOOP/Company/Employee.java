package Company;
abstract class Employee {
    // Attribute
    private String id;
    private String name;
    private double salary;

    // Method
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double saraly) {
        this.salary = saraly;
    }

    public void displayEmployee() {
        System.out.println("ID : " + this.id);
        System.out.println("Name : " + this.name);
        System.out.println("Salary : " + this.salary);
    }

    public String getName() {
        return this.name;
    }

    // Constructor
    public Employee() {
        // System.out.println("1");
    }

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
        displayEmployee();
        System.out.println("2");
    }

    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        System.out.println("3");
    }

    // Static
    static int minsalary = 10000;

    // override

    // public void bonus() {
    // System.out.println("Bonus = 10%");
    // }

    // class abstract
    public abstract void bonus();

}
