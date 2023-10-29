
package Models;

public class FullTime extends PermanentEmployee{
    
    public FullTime(){
        
    }
    
    public FullTime(String Name, String Department, String Position, double Salary, 
            int DailyWorkHours, int PricePerHour, int BankAccountNumber) {
        
        super(Name, Department, Position, Salary, DailyWorkHours, PricePerHour, BankAccountNumber);
        
    }
    
}
