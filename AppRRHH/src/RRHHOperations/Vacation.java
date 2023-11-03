
package RRHHOperations;

import Models.Employee;
import java.time.LocalDate;

public class Vacation extends Employee{
    private LocalDate Startdate;
    private int VacationDuration;

    public Vacation(int IdentificationCard, LocalDate Startdate, int VacationDuration) {
        super(IdentificationCard);
        this.Startdate = Startdate;
        this.VacationDuration = VacationDuration;
    }

    public LocalDate getCalcularFechaFinalizacion() {
        return Startdate.plusDays(VacationDuration);
    }

    public LocalDate getStartdate() {
        return Startdate;
    }

    public void setStartdate(LocalDate Startdate) {
        this.Startdate = Startdate;
    }

    public int getVacationDuration() {
        return VacationDuration;
    }

    public void setVacationDuration(int VacationDuration) {
        this.VacationDuration = VacationDuration;
    }
    
}
