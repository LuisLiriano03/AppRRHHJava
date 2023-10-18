
package Employees;

import People.Person;

public class FullTimeEmployee extends Person {
    protected int DailyWorkHours;
    protected int PricePerHour;
    protected int BankAccountNumber;
    
    public FullTimeEmployee(String EmployeeName,
            String EmployeeDepartment,
            String EmployeePosition,
            double EmployeeSalary,
            int DailyWorkHours,
            int PricePerHour,
            int BankAccountNumber){
        
        super(EmployeeName,EmployeeDepartment,EmployeePosition,EmployeeSalary);
        
        this.DailyWorkHours = DailyWorkHours;
        this.PricePerHour = PricePerHour;
        this.BankAccountNumber = BankAccountNumber;
        
    }
}
