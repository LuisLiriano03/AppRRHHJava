
package Models;

public class PermanentEmployee extends Employee{
    
    private int DailyWorkHours;
    private int PricePerHour;
    private int BankAccountNumber;
    
    public PermanentEmployee(){
        
    }
    
    public PermanentEmployee(int IdentificationCard, String Name, String Department, String Position, double Salary,
            int DailyWorkHours, int PricePerHour, int BankAccountNumber) {
        
        super(IdentificationCard, Name, Department, Position, Salary);
        
        this.DailyWorkHours = DailyWorkHours;
        this.PricePerHour = PricePerHour;
        this.BankAccountNumber = BankAccountNumber;
        
    }
    
    public int getDailyWorkHours(){
        return DailyWorkHours;
    }
    
    public void setDailyWorkHours(int DailyWorkHours){
        this.DailyWorkHours = DailyWorkHours;
    }
    
    public int getPricePerHour(){
        return PricePerHour;
    }
    
    public void setPricePerHour(int PricePerHour){
        this.PricePerHour = PricePerHour;
    }
    
    public int getBankAccountNumber(){
        return BankAccountNumber;
    }
    
    public void setBankAccountNumber(int BankAccountNumber){
        this.BankAccountNumber = BankAccountNumber;
    }
    
}
