public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee();// Create Object
        e1.setId("1");
        e1.setName("Apichai");
        e1.setSalary(45000.0);
        e1.displayEmployee();
        System.out.println("get : " + e1.getName());

        Employee e2 = new Employee();
        e2.setId("2");
        e2.setName("John");
        e2.setSalary(15000.0);
        e2.displayEmployee();
        System.out.println("get : " + e2.getName());

        Employee e3 = new Employee();// 1
        Employee e4 = new Employee("3", "Milk");// 2
        Employee e5 = new Employee("4", "Mai", 25040.0);// 3
    }
}
