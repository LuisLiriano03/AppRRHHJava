
package EmployeesFactory;

import Employees.TemporaryEmployee;
import EmployeesSingleton.TemporaryEmployeeSingleton;

public class TemporaryEmployeeFactory {
    
    public static TemporaryEmployee createEmployee(String EmployeeName,
            String EmployeeDepartment,
            String EmployeePosition,
            double EmployeeSalary,
            int DailyWorkHours,
            int PricePerHour) {
        
        TemporaryEmployee employee = new TemporaryEmployee(EmployeeName, 
                EmployeeDepartment, 
                EmployeePosition, 
                EmployeeSalary,
                DailyWorkHours,
                PricePerHour);
        
        TemporaryEmployeeSingleton logger = TemporaryEmployeeSingleton.getInstance();
        logger.CreateEmployee(EmployeeName, 
                EmployeeDepartment, 
                EmployeePosition, 
                EmployeeSalary,
                DailyWorkHours,
                PricePerHour);
        
        return employee;
    }
    
    
    
}
