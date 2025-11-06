package main.java.prueba.tecnic;


/**
 *  EmpleadoPorHoras: su salario se calcula como el número de horas trabajadas * pago por hora 
 * (debes pedir o definir estos valores).
 */
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
