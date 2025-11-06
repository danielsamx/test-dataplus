package main.java.prueba.tecnic;


/**
 * Class for full time employee
 */
public class FullTimeEmployee extends Employee{

    /**
     * Apply data with employee with super
     */
    public FullTimeEmployee(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
    }

    /**
     * Calculate salary
     * In this case the base salary plus 10 percent of base salary
     */
    @Override
    public double calculateSalary(){
        return baseSalary + (baseSalary*0.1);
    }
}
