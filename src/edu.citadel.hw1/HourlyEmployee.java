import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    private double wageRate;
    private double hoursWorked;

    public HourlyEmployee(String name, LocalDate hireDate, double wageRate, double hoursWorked) {
        super(name, hireDate);
        this.wageRate = wageRate;
        this.hoursWorked = hoursWorked;
    }

    public double getWageRate() {
        return this.wageRate;
    }

    public double getHoursWorked() {
        return this.hoursWorked;
    }

    @Override
    public double getMonthlyPay() {
        return this.wageRate * this.hoursWorked;
    }

    public String toString() {
        return "HourlyEmployee[name=" + this.getName() + ", hireDate=" + this.getHireDate() + ", wageRate=" + this.getWageRate() + ", hoursWorked=" + this.getHoursWorked() + "]"; 
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof HourlyEmployee)) return false;
        HourlyEmployee other = (HourlyEmployee) obj;
        return this.getName().equals(other.getName()) &&
               this.getHireDate().equals(other.getHireDate()) &&
               this.wageRate == other.wageRate &&
               this.hoursWorked == other.hoursWorked;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(this.getName(), this.getHireDate(), this.wageRate, this.hoursWorked);
    }
}
