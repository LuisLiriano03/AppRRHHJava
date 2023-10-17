
package Empleados;

import Persona.PersonalEmpleado;

public class EmpleadoTiempoCompleto extends PersonalEmpleado {
    protected int HoraDiarariasDeTrabajo;
    protected int PrecioPorHoras;
    protected int NumeroDeCuentaBancaria;
    
    public EmpleadoTiempoCompleto(String NombreEmpleado,
            String DepartamentoDelEmpleado,
            String CargoDelEmpleado,
            double SalarioDelEmpleado,
            int HoraDiarariasDeTrabajo,
            int PrecioPorHoras,
            int NumeroDeCuentaBancaria){
        
        super(NombreEmpleado,DepartamentoDelEmpleado,CargoDelEmpleado,SalarioDelEmpleado);
        
        this.HoraDiarariasDeTrabajo = HoraDiarariasDeTrabajo;
        this.PrecioPorHoras = PrecioPorHoras;
        this.NumeroDeCuentaBancaria = NumeroDeCuentaBancaria;
        
    }
}
