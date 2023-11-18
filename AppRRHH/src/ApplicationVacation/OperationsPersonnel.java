
package ApplicationVacation;

import EmployeFacade.EmployeeActionsFacade;

import static EmployeeExceptions.ExceptionsData.*;
import EmployeesSingleton.LogEmployees;
import Models.Vacation;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class OperationsPersonnel {
    private static EmployeeActionsFacade employeeActionsFacade = new EmployeeActionsFacade();
    private static LogEmployees logEmployees = LogEmployees.getInstance();
    public static void VacationRequest() {
        Scanner scanner = new Scanner(System.in);

        LocalDate startDate;
        int vacationDuration;

        System.out.print("Enter the employee's ID: ");
        int identificationCard = AskForNumber();

        System.out.print("Enter the vacation start date (yyyy-MM-dd): ");
        String startDateStr = scanner.nextLine();
        startDate = LocalDate.parse(startDateStr, DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.print("Enter the duration of the vacation in days: ");
        vacationDuration = AskForNumber();

        employeeActionsFacade.requestVacation(identificationCard, startDate, vacationDuration);
        System.out.println("Vacation request submitted.");
        
        Vacation vacation = new Vacation(identificationCard, startDate, vacationDuration);
        LocalDate VacationEndDate = vacation.getCalcularFechaFinalizacion();
        
        String logEntry = "\nVacation Request"
                +"\nEmployee ID: " + identificationCard +
                "\nStart Date: " + startDate +
                "\nDuration: " + vacationDuration + " days"
                +"\nEnd Date: " + VacationEndDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
        
        logEmployees.writeToFile(logEntry);
    }

    public static void RequestPermission() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the employee's ID: ");
        int identificationCard = AskForNumber();

        System.out.println("Employee data:");
        System.out.println("ID: " + identificationCard);

        System.out.print("Enter the date of the vacation leave (yyyy-MM-dd): ");
        String startDateStr = scanner.nextLine();
        LocalDate vacationLeaveDate = LocalDate.parse(startDateStr, DateTimeFormatter.ISO_LOCAL_DATE);

        employeeActionsFacade.requestPermission(identificationCard, vacationLeaveDate);
        System.out.println("Permission request submitted.");
        
        String logEntry = "\nPermission Request"
                +"\nEmployee ID: " + identificationCard +
                "\nRequested Date: " + vacationLeaveDate;
        logEmployees.writeToFile(logEntry);
    }
    
    public static void EmployeeDismissal() {
        EmployeeActionsFacade employeeActionsFacade = new EmployeeActionsFacade();
        System.out.print("Enter the employee's ID: ");
        int identificationCard = AskForNumber();

        System.out.println("Employee data:");
        System.out.println("ID: " + identificationCard);

        System.out.print("Enter the reason for dismissal: ");
        String reasonForDismissal = RequestTheText();

        System.out.print("Are you sure about firing this employee? (y/n): ");
        String confirmation = RequestTheText();

        if (confirmation.equalsIgnoreCase("y")) {
            employeeActionsFacade.initiateDismissal(identificationCard, reasonForDismissal);
            System.out.println("Dismissal request initiated.");
            String logEntry = "\nDismissal Request"
                    +"\nEmployee ID: " + identificationCard +
                    "\nReason: " + reasonForDismissal;
            logEmployees.writeToFile(logEntry);
        } else {
            System.out.println("Dismissal request canceled.");
        }
    }
    
}
