
package EmployeesFactory;

import Employees.FullTimeEmployee;
import EmployeesSingleton.FullTimeEmployeeSingleton;

public class FullTimeEmployeeFactory {
    
    public static FullTimeEmployee createEmployee(String EmployeeName,
            String EmployeeDepartment,
            String EmployeePosition,
            double EmployeeSalary,
            int DailyWorkHours,
            int PricePerHour,
            int BankAccountNumber) {
        
        FullTimeEmployee employee = new FullTimeEmployee(EmployeeName, 
                EmployeeDepartment, 
                EmployeePosition, 
                EmployeeSalary,
                DailyWorkHours,
                PricePerHour,
                BankAccountNumber);
        
        FullTimeEmployeeSingleton logger = FullTimeEmployeeSingleton.getInstance();
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
