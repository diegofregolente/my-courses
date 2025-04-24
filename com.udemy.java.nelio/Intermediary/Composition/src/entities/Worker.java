package entities;

import entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.List;

public class Worker {

    private String name;
    private WorkerLevel level;
    private double baseSalary;

    private Department department;
    private final List<HourContract> contracts = new ArrayList<>();

    public Worker() {

    }

    public Worker(String name, WorkerLevel level, double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public void addContract (HourContract contract) {
        contracts.add(contract);
    }

    public void removeContract (HourContract contract) {
        contracts.remove(contract);
    }

    public double income (int year, int month) {
        double soma = baseSalary;
        for (HourContract contrato : contracts) {
            int c_year = contrato.getDate().getYear();
            int c_month = contrato.getDate().getMonthValue();
            if (c_year == year && c_month == month) {
                soma += contrato.totalValue();
            }
        }
        return soma;
    }
}



