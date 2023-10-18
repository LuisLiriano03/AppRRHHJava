
package People;

public class Person {
    
    protected String EmployeeName;
    protected String EmployeeDepartment;
    protected String EmployeePosition;
    protected double EmployeeSalary;
    
    public Person(String EmployeeName,
            String EmployeeDepartment,
            String EmployeePosition,
            double EmployeeSalary){
        
        this.EmployeeName = EmployeeName;
        this.EmployeeDepartment = EmployeeDepartment;
        this.EmployeePosition = EmployeePosition;
        this.EmployeeSalary = EmployeeSalary;
    }
    
}
