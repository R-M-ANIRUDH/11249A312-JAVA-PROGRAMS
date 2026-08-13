
class Employee {
    int empId;
    String name;
    double basicSalary;

    
    Employee(int empId, String name, double basicSalary) {
        this.empId = empId;
        this.name = name;
        this.basicSalary = basicSalary;
    }
}


class PermanentEmployee extends Employee {
    double hra;
    double da;


    PermanentEmployee(int empId, String name, double basicSalary, double hra, double da) {
        super(empId, name, basicSalary);
        this.hra = hra;
        this.da = da;
    }

    
    double calculateGrossSalary() {
        return basicSalary + hra + da;
    }

    
    void displayDetails() {
        System.out.println("=== Employee Salary Slip ===");
        System.out.println("Employee ID  : " + empId);
        System.out.println("Name         : " + name);
        System.out.println("Basic Salary : $" + basicSalary);
        System.out.println("HRA          : $" + hra);
        System.out.println("DA           : $" + da);
        System.out.println("Gross Salary : $" + calculateGrossSalary());
    }
}


public class SalaryDemo {
    public static void main(String[] args) {
        
        PermanentEmployee emp = new PermanentEmployee(101, "Sarah Connor", 50000, 10000, 5000);
        
        
        emp.displayDetails();
    }
}