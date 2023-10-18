
package Employees;

import People.Person;

public class TemporaryEmployee extends Person {
    protected int DailyWorkHours;
    protected int PricePerHour;
    
    public TemporaryEmployee(String EmployeeName,
            String EmployeeDepartment,
            String EmployeePosition,
            double EmployeeSalary,
            int DailyWorkHours,
            int PricePerHour){
        
        super(EmployeeName,EmployeeDepartment,EmployeePosition,EmployeeSalary);  
        
        this.DailyWorkHours = DailyWorkHours;
        this.PricePerHour = PricePerHour;
        
    }
    
    
}
