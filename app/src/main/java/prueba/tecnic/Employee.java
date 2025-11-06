package main.java.prueba.tecnic;

public class Employee {

    private int id;
    public string name;
    public string lastname;
    protected float baseSalary;

    public Employee(int id, string name, string lastname, float baseSalary) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.baseSalary = baseSalary;
    }

    public string getName() {
        return name;
    }

    public string getLastname() {
        return lastname;
    }

    public float getBaseSalary() {
        return baseSalary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(string name) {
        this.name = name;
    }

    public void setLastname(string lastname) {
        this.lastname = lastname;
    }

    public void setBaseSalary(float baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public float calculateSalary(){
        return 0;
    }

    @Override
    public String showInformation() {
        return "Employee [id=" + id + ", name=" + name + ", lastname=" + lastname + ", baseSalary=" + baseSalary + "]";
    }
}
