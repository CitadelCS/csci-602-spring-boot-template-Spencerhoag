import java.util.*;
import java.time.LocalDate;


public class InheritanceDemo {
    
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        
        employees.add(new HourlyEmployee("John Doe", LocalDate.of(2009, 05, 21), 50.5, 160.0));
        employees.add(new HourlyEmployee("Jane Doe", LocalDate.of(2005, 9, 01), 150.5, 80.0));

        employees.add(new SalariedEmployee("Moe Howard", LocalDate.of(2004, 01, 01), 75000.0));
        employees.add(new SalariedEmployee("Curly Howard", LocalDate.of(2018, 01, 01), 105000.0));

        System.out.println("List of Employees (before sorting):");

        for (Employee emp : employees) {
            System.out.println(emp.toString());
        }

        System.out.println();
        Collections.sort(employees);
        System.out.println("List of Employees (after sorting):");

        for (Employee emp : employees) {
            System.out.println(emp.toString());
        }
        
        System.out.println();
        System.out.println("Monthly Pay:");


        double totalPay = 0.0;
        for (Employee emp : employees) {
            totalPay += emp.getMonthlyPay();
            System.out.printf("%s: $%,.2f\n", emp.getName(), emp.getMonthlyPay());
        }

        System.out.printf("Total Monthly Pay: $%,.2f", totalPay);
    }
}
