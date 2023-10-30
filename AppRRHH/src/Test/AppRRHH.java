
package Test;

import static EmployeeExceptions.ExceptionsData.AskForNumber;
import static EmployeeData.CreateData.*;

public class AppRRHH {
    
    public static void main(String[] args) {
        
        boolean Again = true;
        
        while(Again){
            
            System.out.println("\nOptions" + "\n"
                + "\n1 - Full-Time"
                + "\n2 - Part-Time"
                + "\n3 - Temporary"
                + "\n4 - Exit application");
        
            System.out.println("\nEnter a number:");
            
            int num = AskForNumber();
            
            switch(num){
                case 1:
                    FullTimeEmployee();
                    Again = false;
                    break;
                case 2:
                    PartTimeEmployee();
                    Again = false;
                    break;
                case 3:
                    TemporaryEmployee();
                    Again = false;
                    break;
                case 4:
                    System.out.println("Exit application.");
                    return;
                default:
                    System.out.println("Invalid option, please select a valid option.");
                    break;
            }
            
        }
        
    }   
    
}