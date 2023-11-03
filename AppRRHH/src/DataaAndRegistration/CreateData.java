
package DataaAndRegistration;

import EmployeesFactory.EmployeeFactory;
import EmployeesSingleton.LogEmployees;
import Models.Employee;
import Models.TypeEmployee;
import static EmployeeExceptions.ExceptionsData.*;

public class CreateData {
    
    public static void FullTimeEmployee(){
        
        LogEmployees logger = LogEmployees.getInstance();

        EmployeeFactory factory = new EmployeeFactory();
        
        System.out.println("Data Employee Full-Time\n");
        
        System.out.println("Enter employees' ID:");
        int IdentificationCard = AskForNumber();

        System.out.println("Enter the employee's name:");
        String Name = RequestTheText();

        System.out.println("Enter the employee's department:");
        String Department = RequestTheText();

        System.out.println("Enter the employee's position:");
        String Position = RequestTheText();

        System.out.println("Enter the employee's salary:");
        double Salary = AskForDouble();
        
        System.out.println("Enter employees' daily work hours:");
        int DailyWorkHours = AskForNumber();
        
        System.out.println("Enter the employee's price per hour:");
        int PricePerHour = AskForNumber();
        
        System.out.println("Enter the employee's bank account number:");
        int BankAccountNumber = AskForNumber();

        Employee employee = factory.createEmployee(TypeEmployee.FULLTIME);

        employee.setName(Name);
        employee.setDepartment(Department);
        employee.setPosition(Position);
        employee.setSalary(Salary);

        logger.logEmployeeCreation(employee);

        logger.closeLogger();
        
    }
    
    public static void PartTimeEmployee(){
        
        LogEmployees logger = LogEmployees.getInstance();

        EmployeeFactory factory = new EmployeeFactory();
        
        System.out.println("Data Employee Part-Time\n");
        
        System.out.println("Enter employees' ID:");
        int IdentificationCard = AskForNumber();

        System.out.println("Enter the employee's name:");
        String Name = RequestTheText();

        System.out.println("Enter the employee's department:");
        String Department = RequestTheText();

        System.out.println("Enter the employee's position:");
        String Position = RequestTheText();

        System.out.println("Enter the employee's salary:");
        double Salary = AskForDouble();
        
        System.out.println("Enter employees' daily work hours:");
        int DailyWorkHours = AskForNumber();
        
        System.out.println("Enter the employee's price per hour:");
        int PricePerHour = AskForNumber();
        
        System.out.println("Enter the employee's bank account number:");
        int BankAccountNumber = AskForNumber();

        Employee employee = factory.createEmployee(TypeEmployee.PARTTIME);

        employee.setName(Name);
        employee.setDepartment(Department);
        employee.setPosition(Position);
        employee.setSalary(Salary);

        logger.logEmployeeCreation(employee);

        logger.closeLogger();
        
    }
    
    public static void TemporaryEmployee(){
        
        LogEmployees logger = LogEmployees.getInstance();

        EmployeeFactory factory = new EmployeeFactory();
        
        System.out.println("Data Temporary Employee\n");
        
        System.out.println("Enter employees' ID:");
        int IdentificationCard = AskForNumber();

        System.out.println("Enter the employee's name:");
        String Name = RequestTheText();

        System.out.println("Enter the employee's department:");
        String Department = RequestTheText();

        System.out.println("Enter the employee's position:");
        String Position = RequestTheText();

        System.out.println("Enter the employee's salary:");
        double Salary = AskForDouble();
        
        System.out.println("Enter employees' daily work hours:");
        int DailyWorkHours = AskForNumber();
        
        System.out.println("Enter the employee's price per hour:");
        int PricePerHour = AskForNumber();

        Employee employee = factory.createEmployee(TypeEmployee.TEMPORARY);

        employee.setName(Name);
        employee.setDepartment(Department);
        employee.setPosition(Position);
        employee.setSalary(Salary);

        logger.logEmployeeCreation(employee);

        logger.closeLogger();
        
    }
}
