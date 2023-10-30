
package Models;

public class Employee {

    private String Name;
    private String Department;
    private String Position;
    private double Salary;
    
    public Employee(){
        
    }

    public Employee(String Name, String Department, String Position, double Salary) {
        this.Name = Name;
        this.Department = Department;
        this.Position = Position;
        this.Salary = Salary;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String Position) {
        this.Position = Position;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    @Override
    public String toString() {
        return ""
                + "\nEmployee data added" 
                + "\nName: " + Name 
                + "\nDepartment: " + Department 
                + "\nPosition: " + Position 
                + "\nSalary: " + Salary +"" ;
    }
    
}
