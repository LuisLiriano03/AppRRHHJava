
package Models;



public class PartTime extends PermanentEmployee {
    
    public PartTime(){
    
    }
    
    public PartTime(String Name, String Department, String Position, double Salary, 
            int DailyWorkHours, int PricePerHour, int BankAccountNumber) {
        
        super(Name, Department, Position, Salary, DailyWorkHours, PricePerHour, BankAccountNumber);
        
    }
}