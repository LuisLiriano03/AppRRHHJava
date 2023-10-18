
package CreateEmployees;

import EmployeesSingleton.*;
import EmployeesFactory.*;
import Employees.*;


public class EmployeesFuction {
    public static void FullTimeEmployeeFuc(){
        FullTimeEmployeeFactory factory = new FullTimeEmployeeFactory();

        FullTimeEmployee employee1 = factory.createEmployee(
                "Mateo Perez", 
                "HR", 
                "Manager", 
                50000.0,
                40,
                30,
                2578411);
        
        FullTimeEmployeeSingleton.getInstance().closeLog();
    }
    
    public static void PartTimeEmployeeFuc(){
        PartTimeEmployeeFactory factory1 = new PartTimeEmployeeFactory();

        PartTimeEmployee employee2 = factory1.createEmployee(
                "Karla Castro", 
                "QA", 
                "Manager", 
                78000.0,
                50,
                40,
                784523955);
        
        PartTimeEmployeeSingleton.getInstance().closeLog();
    }
    
    public static void TemporaryEmployeeFuc(){
        TemporaryEmployeeFactory factory3 = new TemporaryEmployeeFactory();

        TemporaryEmployee employee3 = factory3.createEmployee(
                "Julio Sanchez", 
                "DevOps", 
                "Manager", 
                78000.0,
                50,
                40);
        
        TemporaryEmployeeSingleton.getInstance().closeLog();
    }
}
