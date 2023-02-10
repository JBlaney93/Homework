package staff;

public abstract class Employee {

    String name;
    int niNumber;
    protected double salary;
    //no access modifier so is available elsewhere
    //absence of access modifier makes it package private by default
    public Employee(String name, int niNumber, int salary){
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getNiNumber() {
        return niNumber;
    }

    public double getSalary() {
        return salary;
    }

    public double raiseSalary(double amount){
        return this.salary += amount;
    }

    public double payBonus(){
        return this.salary / 100;
    }
}
