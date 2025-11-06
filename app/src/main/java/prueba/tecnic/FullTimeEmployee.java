package main.java.prueba.tecnic;

public class FullTimeEmployee extends Employee{

    /**
     * Apply data with employee with super
     */
    public FullTimeEmployee() {
        super();
    }

    /**
     * Calculate salary
     * In this case the base salary plus 10 percent of base salary
     */
    @Override
    public float calculateSalary(){
        return baseSalary + (baseSalary*0.1);
    }
}
