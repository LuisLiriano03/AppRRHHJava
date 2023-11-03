
package Models;

public class PartTime extends PermanentEmployee {
    
    public PartTime(){
    
    }
    
    public PartTime(int IdentificationCard,String Name, String Department, String Position, double Salary, 
            int DailyWorkHours, int PricePerHour, int BankAccountNumber) {
        
        super(IdentificationCard,Name, Department, Position, Salary, DailyWorkHours, PricePerHour, BankAccountNumber);
        
    }
}