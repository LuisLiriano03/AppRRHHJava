
package Models;

import Models.Employee;

public class Dismissal extends Employee {
    
    private String ReasonForDismissal;

    public Dismissal(int IdentificationCard, String ReasonForDismissal) {
        super(IdentificationCard);
        this.ReasonForDismissal = ReasonForDismissal;
    }

    public String getReasonForDismissal() {
        return ReasonForDismissal;
    }

    public void setReasonForDismissal(String ReasonForDismissal) {
        this.ReasonForDismissal = ReasonForDismissal;
    }
    
}
