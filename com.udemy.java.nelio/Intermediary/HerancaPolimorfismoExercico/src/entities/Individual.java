package entities;

public class Individual extends TaxPayer  {
    private Double healthExpendures;

    public Individual() {}

    public Individual(String name, Double anualIncome, Double healthExpendures) {
        super(name, anualIncome);
        this.healthExpendures = healthExpendures;
    }

    public Double getHealthExpendures() {
        return healthExpendures;
    }

    public void setHealthExpendures(Double healthExpendures) {
        this.healthExpendures = healthExpendures;
    }

    @Override
    public Double tax() {
        double basicTax = (getAnualIncome() < 20000.0) ? getAnualIncome() * 0.15 : getAnualIncome() * 0.25;
        basicTax -= getHealthExpendures() * 0.5;
        if (basicTax < 0) {
            return 0.0;
        }
        else {
            return basicTax;
        }
    }
}