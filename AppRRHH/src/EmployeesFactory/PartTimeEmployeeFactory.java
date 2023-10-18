
package EmployeesFactory;

import Employees.PartTimeEmployee;
import EmployeesSingleton.PartTimeEmployeeSingleton;

public class PartTimeEmployeeFactory {
   
    public static PartTimeEmployee createEmployee(String EmployeeName,
            String EmployeeDepartment,
            String EmployeePosition,
            double EmployeeSalary,
            int DailyWorkHours,
            int PricePerHour,
            int BankAccountNumber) {
        
        PartTimeEmployee employee = new PartTimeEmployee(EmployeeName, 
                EmployeeDepartment, 
                EmployeePosition, 
                EmployeeSalary,
                DailyWorkHours,
                PricePerHour,
                BankAccountNumber);
        
        PartTimeEmployeeSingleton logger = PartTimeEmployeeSingleton.getInstance();
        logger.CreateEmployee(EmployeeName, 
                EmployeeDepartment, 
                EmployeePosition, 
                EmployeeSalary,
                DailyWorkHours,
                PricePerHour,
                BankAccountNumber);
        
        return employee;
    }
    
}
