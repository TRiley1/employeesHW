package staff;

public abstract class Employee {
    private String name;
    private String niNum;
    private int salary;

    public Employee(String name, String niNum, int salary) {
        this.name = name;
        this.niNum = niNum;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNiNum() {
        return niNum;
    }

    public int getSalary() {
        return salary;
    }

    public void raiseSalary(double money){
        if (money > 0) {
        this.salary += money;}
    }

    public double payBonus(){
        return this.salary * 0.01;
    }

    public void changeName(String name){
        if (name != null && !name.isEmpty()){
        this.name = name;
    }
    }
}
