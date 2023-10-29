
package EmployeesFactory;

import Models.*;

public class EmployeeFactory {
    
    public static Employee createEmployee(TypeEmployee typeEmployee){
        return switch (typeEmployee){
            case FULLTIME -> new FullTime();
            case PARTTIME -> new PartTime();
            default -> new Temporary();
        };
    }
}
