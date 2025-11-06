package main.java.prueba.tecnic;

public class HourPayEmployee extends Employee{

    public HourPayEmployee(){
        super();
    }

    /**
     * Calculate salary
     * In this case hours per price for this hours
     */
    @Override
    public float calculateSalary(int hours, float price){
        return hours * price;
    }
}
