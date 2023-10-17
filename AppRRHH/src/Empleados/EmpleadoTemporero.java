
package Empleados;

import Persona.PersonalEmpleado;

public class EmpleadoTemporero extends PersonalEmpleado {
    protected int HorasTrabajadas;
    protected double PrecioPorHoras;
    
    public EmpleadoTemporero(){
        
    }
    
    public EmpleadoTemporero(String NombreEmpleado,
            String DepartamentoDelEmpleado,
            String CargoDelEmpleado,
            double SalarioDelEmpleado,
            int HorasTrabajadas, 
            int PrecioPorHoras){
        
        super(NombreEmpleado,DepartamentoDelEmpleado,CargoDelEmpleado,SalarioDelEmpleado);
        
        this.HorasTrabajadas = HorasTrabajadas;
        this.PrecioPorHoras = PrecioPorHoras;
        
    }
    
    
}
