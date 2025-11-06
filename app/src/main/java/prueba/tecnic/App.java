package prueba.tecnic;

import main.java.prueba.tecnic.Employee;
import main.java.prueba.tecnic.FullTimeEmployee;
import main.java.prueba.tecnic.HourPayEmployee;

public class App {
    public static void main(String[] args) {

        // Initialize employees
        Employee employee = new Employee(1, "Anderson", "Cango", 450.00);
        Employee fullTimeEmployee = new FullTimeEmployee(2, "Daniel", "Samuisa", 450.00);
        Employee hourPayEmployee = new HourPayEmployee(3, "Juan", "Salinas", 8, 5.50 );

        // Poliform action with each employee type
        // Show information and depends salary for each type
        System.out.println("Employee salary: " + employee.calculateSalary());
        System.out.println("Employee salary: " + employee.showInformation());
        System.out.println("Full-time salary: " + fullTimeEmployee.calculateSalary());
        System.out.println("Full-time salary: " + fullTimeEmployee.showInformation());
        System.out.println("Hourly salary: " + hourPayEmployee.calculateSalary());
        System.out.println("Hourly salary: " + hourPayEmployee.showInformation());
    }
}
