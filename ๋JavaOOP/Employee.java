class Employee {
    // Attribute
    private String id;
    private String name;
    private double salary;

    //Method
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

    //Constructor
    public Employee(){
        System.out.println("1");
    }
    public Employee(String id,String name){
        this.id = id;
        this.name = name;
        System.out.println("2");
    }
    public Employee(String id,String name,double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        System.out.println("3");
    }

}
