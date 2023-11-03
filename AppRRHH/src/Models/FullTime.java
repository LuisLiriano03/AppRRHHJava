
package Models;

public class FullTime extends PermanentEmployee{
    
    public FullTime(){
        
    }
    
    public FullTime(int IdentificationCard,String Name, String Department, String Position, double Salary, 
            int DailyWorkHours, int PricePerHour, int BankAccountNumber) {
        
        super(IdentificationCard,Name, Department, Position, Salary, DailyWorkHours, PricePerHour, BankAccountNumber);
        
    }
    
}
