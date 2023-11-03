
package ApplicationVacation;

import static DataaAndRegistration.LogOperationsPersonnel.writeToFile;
import RRHHOperations.*;
import static EmployeeExceptions.ExceptionsData.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class OperationsPersonnel {
    
    public static void VacationRequest(){
        
        Scanner scanner = new Scanner(System.in);
        
        LocalDate Startdate;
        int VacationDuration;
        
        System.out.print("Enter the employee's ID: ");
        int IdentificationCard = AskForNumber();
        
        System.out.print("Enter the vacation start date (yyyy-MM-dd): ");
        String StartdateStr = scanner.nextLine();
        Startdate = LocalDate.parse(StartdateStr, DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.print("Enter the duration of the vacation in days: ");
        VacationDuration = AskForNumber();

        Vacation vacation = new Vacation(IdentificationCard, Startdate, VacationDuration);

        LocalDate VacationEndDate = vacation.getCalcularFechaFinalizacion();
        writeToFile("\nID: "  + IdentificationCard);
        writeToFile("Vacation start date: " + Startdate.format(DateTimeFormatter.ISO_LOCAL_DATE));
        writeToFile("Vacation End Date: " + VacationEndDate.format(DateTimeFormatter.ISO_LOCAL_DATE));
        
    }
   
    public static void RequestPermission(){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the employee's ID: ");
        int IdentificationCard = AskForNumber();

        System.out.println("Employee data:");
        System.out.println("ID: " + IdentificationCard);
        
        System.out.print("Enter the date of the vacation leave (yyyy-MM-dd): ");
        String StartdateStr = scanner.nextLine();
        LocalDate VacationLeaveDate = LocalDate.parse(StartdateStr, DateTimeFormatter.ISO_LOCAL_DATE);
        
        VacationRequestPermission vacationRequestPermission = new VacationRequestPermission(IdentificationCard, 
                VacationLeaveDate);

        writeToFile("\nID: "  + IdentificationCard);
        writeToFile("Vacation leave date: " + StartdateStr);
        writeToFile("Vacation leave successfully granted.");
        
    }
    
    
    public static void EmployeeDismissal(){

        System.out.print("Enter the employee's ID: ");
        int IdentificationCard = AskForNumber();

        System.out.println("Employee data:");
        System.out.println("Cédula: " + IdentificationCard);

        System.out.print("Enter the reason for dismissal: ");
        String ReasonForDismissal = RequestTheText();

        Dismissal empleado = new Dismissal(IdentificationCard, ReasonForDismissal);
        empleado.setReasonForDismissal(ReasonForDismissal);

        System.out.print("Are you sure about firing this employee? (y/n): ");
        String confirmacion = RequestTheText();
        
        if (confirmacion.equalsIgnoreCase("y")) {
            writeToFile("\nID: "  + IdentificationCard);
            writeToFile("Because of the dismissal: "+ ReasonForDismissal + "\nHas been fired.");
        } else {
            writeToFile("\nCedula: "  + IdentificationCard);
            writeToFile("Because of the dismissal: "+ ReasonForDismissal + "\nThe dismissal has been canceled.\n");
        }
        
    }
    
}
