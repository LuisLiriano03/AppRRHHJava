
package Models;

import Models.Employee;

public class Temporary extends Employee {
    
    private int DailyWorkHours;
    private int PricePerHour;
    
    public Temporary(){
        
    }
    
    public Temporary(int IdentificationCard, String Name, String Department, String Position, 
            double Salary, int DailyWorkHours, int PricePerHour) {
        
        super(IdentificationCard, Name, Department, Position, Salary);
        
        this.DailyWorkHours = DailyWorkHours;
        this.PricePerHour = PricePerHour;
    }
    
    public int getDailyWorkHours(){
        return DailyWorkHours;
    }
    
    public void setDailyWorkHours(){
        this.DailyWorkHours = DailyWorkHours;
    }    
    
    public int getPricePerHour(){
        return PricePerHour;
    }
    
    public void setPricePerHour(){
        this.PricePerHour = PricePerHour;
    } 
    
}
