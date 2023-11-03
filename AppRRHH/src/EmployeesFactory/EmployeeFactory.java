
package EmployeesFactory;

import Models.*;
import static Models.TypeEmployee.*;

public class EmployeeFactory {
    
    public static Employee createEmployee(TypeEmployee typeEmployee){
        return switch (typeEmployee){
            case FULLTIME -> new FullTime();
            case PARTTIME -> new PartTime();
            case TEMPORARY -> new Temporary();
            default -> null;
        };
    }
}
