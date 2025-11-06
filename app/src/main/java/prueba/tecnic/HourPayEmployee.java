package main.java.prueba.tecnic;


/**
 * Class for HourPayEmployee
 */
public class HourPayEmployee extends Employee{

    private int hours;
    private double price;


    // Initialize class
    public HourPayEmployee(int id, String firstName, String lastName, int hours, double price) {
        super(id, firstName, lastName, 0);
        this.hours = hours;
        this.price = price;
    }

    /**
     * Calculate salary
     * In this case hours per price for this hours
     */
    @Override
    public double calculateSalary(){
        return this.hours * this.price;
    }
}

