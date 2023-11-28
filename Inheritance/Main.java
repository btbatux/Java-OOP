package Inheritance;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.email = "@";

        Person person = new Person();
        person.location = "TR";

        Employee employee = new Employee();
        employee.salary = 12999;

        /////////////////////////////////

        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.Add();

        CustomerManager customerManager = new CustomerManager();
        customerManager.mailList();

    }

}
