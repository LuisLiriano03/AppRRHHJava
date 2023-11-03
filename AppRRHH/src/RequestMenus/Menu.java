
package RequestMenus;

import static ApplicationVacation.OperationsPersonnel.*;
import static DataaAndRegistration.CreateData.*;
import static EmployeeExceptions.ExceptionsData.AskForNumber;

public class Menu {
    
    public static void AddEmployee(){

        boolean Again = true;

        while(Again){

            System.out.println("\nOptions" + "\n"
            + "\n1 - Full-Time"
            + "\n2 - Part-Time"
            + "\n3 - Temporary"
            + "\n4 - Exit application");

            System.out.println("\nEnter a Options:");

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
    
    public static void EmployeeRequests(){

        boolean Again = true;

        while(Again){

            System.out.println("\nOptions" + "\n"
            + "\n1 - Vacation"
            + "\n2 - Vacation request permission"
            + "\n3 - Dismissal"
            + "\n4 - Exit application");

            System.out.println("\nEnter a Options:");

            int num = AskForNumber();

            switch(num){
                case 1:
                    VacationRequest();
                    Again = false;
                    break;
                case 2:
                    RequestPermission();
                    Again = false;
                    break;
                case 3:
                    EmployeeDismissal();
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
