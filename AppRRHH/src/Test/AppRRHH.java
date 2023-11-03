
package Test;
import static EmployeeExceptions.ExceptionsData.AskForNumber;
import static RequestMenus.Menu.*;

public class AppRRHH {
    
    public static void main(String[] args) {
        
        boolean Again = true;
        
        while(Again){
            
            System.out.println("\nOptions" + "\n"
                + "\n1 - Add new Employee"
                + "\n2 - Employee requests"
                + "\n3 - Exit application");
        
            System.out.println("\nEnter a Options:");
            
            int Options = AskForNumber();
            
            switch(Options){
                case 1:
                    AddEmployee();
                    Again = false;
                    break;
                case 2:
                    EmployeeRequests();
                    Again = false;
                    break;
                case 3:
                    System.out.println("Exit application.");
                    return;
                default:
                    System.out.println("Invalid option, please select a valid option.");
                    break;
                    
            }
            
        }
        
    } 
}