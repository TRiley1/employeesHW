package management;

public class Director extends Manager {

    double budget;

    public Director(String name, String niNum, int salary, String deptName, double budget) {
        super(name, niNum, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public double payBonus(){
        return this.getSalary() * 0.02;
    }


}
