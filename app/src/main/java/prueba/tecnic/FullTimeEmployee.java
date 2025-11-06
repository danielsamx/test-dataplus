package main.java.prueba.tecnic;

public class FullTimeEmployee extends Employee{

    @Override
    public float calculateSalary(){
        return baseSalary + (baseSalary*0.1);
    }
}
