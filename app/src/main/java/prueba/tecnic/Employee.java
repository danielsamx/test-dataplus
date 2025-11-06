package main.java.prueba.tecnic;

/**
 * This class employee has information about your id, name, lastname and base salary.
 * id is private because only can access for people with major access
 * name and lastname are public because need see information
 * baseSalary is protected because is confidentiality
 */
public class Employee {

    private int id;
    public String name;
    public String lastname;
    protected float baseSalary;

    /**
     * Initiliaze the class
     */
    public Employee(int id, String name, String lastname, float baseSalary) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.baseSalary = baseSalary;
    }

    /**
     * Get name of employee
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Get lastname of employee
     * @return lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Get base salary of employee
     * @return baseSalary
     */
    public float getBaseSalary() {
        return baseSalary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setBaseSalary(float baseSalary) {
        this.baseSalary = baseSalary;
    }

    /**
     * Calculta salary for each employee
     * @return baseSalary
     */
    @Override
    public float calculateSalary(){
        return baseSalary;
    }

    /**
     * Show employee information
     * @return all data for employee
     */
    @Override
    public String showInformation() {
        return "Employee [id=" + id + ", name=" + name + ", lastname=" + lastname + ", baseSalary=" + baseSalary + "]";
    }
}
