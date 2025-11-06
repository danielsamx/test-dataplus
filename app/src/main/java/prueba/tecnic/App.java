package prueba.tecnic;

import main.java.prueba.tecnic.Employee;
import main.java.prueba.tecnic.FullTimeEmployee;
import main.java.prueba.tecnic.HourPayEmployee;
/**
 * Principal class for create many instances for employees
 */
public class App {

    public static void main(String[] args) {

        // Class Initialize
        Employee employee = new Employee(1, "Anderson", "Cango", 450.00);
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(2, "Daniel", "Samuisa", 450.00);
        HourPayEmployee hourPayEmployee = new HourPayEmployee(3, "Juan", "Salinas", 450.00);

        // Show information for employee
        System.out.println("Employee Information:");
        System.out.println(employee.showInformation());
        System.out.println(employee.calculateSalary());

        System.out.println("Full Time Employee Information:");
        System.out.println(fullTimeEmployee.showInformation());
        System.out.println(fullTimeEmployee.calculateSalary());

        System.out.println("Hour Pay Employee Information:");
        System.out.println(hourPayEmployee.showInformation());
        System.out.println(hourPayEmployee.calculateSalary(8, 5.50));
    }
}
