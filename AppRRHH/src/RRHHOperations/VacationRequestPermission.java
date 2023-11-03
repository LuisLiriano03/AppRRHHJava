
package RRHHOperations;

import Models.Employee;
import java.time.LocalDate;

public class VacationRequestPermission extends Employee {
    private LocalDate VacationLeaveDate;

    public VacationRequestPermission(int IdentificationCard, LocalDate VacationLeaveDate) {
        super(IdentificationCard);
        this.VacationLeaveDate = VacationLeaveDate;
    }

    public LocalDate getVacationLeaveDate() {
        return VacationLeaveDate;
    }

    public void setFechaPermiso(LocalDate VacationLeaveDate) {
        this.VacationLeaveDate = VacationLeaveDate;
    }
    
}
