package entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;
    private double percentage;

    public double NetSalary() {
        return grossSalary - tax;
    }

    public double IncreaseSalary(double percentage) {
        double adicional = percentage / 100 * grossSalary;
        return NetSalary() + adicional;
    }
}
