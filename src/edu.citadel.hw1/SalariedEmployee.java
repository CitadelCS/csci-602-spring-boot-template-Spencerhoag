import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    private double annualSalary;

    public SalariedEmployee(String name, LocalDate hireDate, double annualSalary) {
        super(name, hireDate);
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary() {
        return this.annualSalary;
    }

    @Override
    public double getMonthlyPay() {
        return this.annualSalary / 12.0;
    }

    public String toString() {
        return "SalariedEmployee[name=" + this.getName() + ", hireDate=" + this.getHireDate() + ", annualSalary=" + this.getAnnualSalary() + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof SalariedEmployee)) return false;
        SalariedEmployee other = (SalariedEmployee) obj;
        return this.getName().equals(other.getName()) &&
               this.getHireDate().equals(other.getHireDate()) &&
               this.annualSalary == other.annualSalary;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(this.getName(), this.getHireDate(), this.annualSalary);
    }
}
