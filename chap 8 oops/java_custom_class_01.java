class Employee {
    int id;
    int salary;
    String name;

    public void printDetails() {
        System.out.println("My id is:  " + id);
        System.out.println("My Salary is:  " + salary);
        System.out.println("and my name is : " + name);
    }
}

public class java_custom_class_01 {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee rahul = new Employee(); // Instantiating a new Employee Object
        Employee john = new Employee(); // Instantiating a new Employee Object

        // Setting Attributes.
        rahul.id = 12;
        rahul.salary = 92000;
        rahul.name = "rahul singh";
        john.id = 18;
        john.salary = 95000;
        john.name = "john cena";

        // Printing Attruibutes.
        rahul.printDetails();
        john.printDetails();

        // System.out.println(rahul.id);
        // System.out.println(rahul.name);
    }

}
