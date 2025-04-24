package entities;

import java.time.LocalDate;

public class HourContract {
    private LocalDate date;
    private double valuePerHour;
    private int hours;

    public HourContract() {}

    public HourContract(LocalDate date, double valuePerHour, int hours) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double totalValue() {
        return valuePerHour * hours;
    }
}
