
package Persona;

public class PersonalEmpleado {
    
    protected String NombreEmpleado;
    protected String DepartamentoDelEmpleado;
    protected String CargoDelEmpleado;
    protected double SalarioDelEmpleado;
    
    public PersonalEmpleado(){
        
    }
    
    public PersonalEmpleado(String NombreEmpleado,
            String DepartamentoDelEmpleado,
            String CargoDelEmpleado,
            double SalarioDelEmpleado){
        
        this.NombreEmpleado = NombreEmpleado;
        this.DepartamentoDelEmpleado = DepartamentoDelEmpleado;
        this.CargoDelEmpleado = CargoDelEmpleado;
        this.SalarioDelEmpleado = SalarioDelEmpleado;
    }
    
}
