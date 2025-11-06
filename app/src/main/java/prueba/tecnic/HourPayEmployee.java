package main.java.prueba.tecnic;


/**
 *  EmpleadoPorHoras: su salario se calcula como el número de horas trabajadas * pago por hora 
 * (debes pedir o definir estos valores).
 */
public class HourPayEmployee extends Employee{

    @Override
    public float calculateSalary(int hours, float price){
        return hours * price;
    }
}
