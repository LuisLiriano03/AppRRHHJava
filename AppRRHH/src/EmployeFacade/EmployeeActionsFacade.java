
package EmployeFacade;
import Models.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeActionsFacade {
    
    private List<Vacation> vacationRequests = new ArrayList<>();
    private List<VacationRequestPermission> permissionRequests = new ArrayList<>();
    private List<Dismissal> dismissalRequests = new ArrayList<>();

    public void requestVacation(int identificationCard, LocalDate startDate, int vacationDuration) {
        Vacation vacation = new Vacation(identificationCard, startDate, vacationDuration);
        vacationRequests.add(vacation);
    }

    public void requestPermission(int identificationCard, LocalDate vacationLeaveDate) {
        VacationRequestPermission permission = new VacationRequestPermission(identificationCard, vacationLeaveDate);
        permissionRequests.add(permission);
    }

    public void initiateDismissal(int identificationCard, String reasonForDismissal) {
        Dismissal dismissal = new Dismissal(identificationCard, reasonForDismissal);
        dismissalRequests.add(dismissal);
    }

}