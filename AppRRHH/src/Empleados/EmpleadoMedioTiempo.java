
package Empleados;

import Persona.PersonalEmpleado;

public class EmpleadoMedioTiempo extends PersonalEmpleado {
    protected int HoraDiarariasDeTrabajo;
    protected double PrecioPorHora;
    protected int NumeroDeCuentaBancaria;
    
    public EmpleadoMedioTiempo(){
        
    }
    
    public EmpleadoMedioTiempo(String NombreEmpleado,
            String DepartamentoDelEmpleado,
            String CargoDelEmpleado,
            double SalarioDelEmpleado,
            int HoraDiarariasDeTrabajo,
            int PrecioPorHoras,
            int NumeroDeCuentaBancaria){
        
        super(NombreEmpleado,DepartamentoDelEmpleado,CargoDelEmpleado,SalarioDelEmpleado);
        
        this.HoraDiarariasDeTrabajo = HoraDiarariasDeTrabajo;
        this.PrecioPorHora = PrecioPorHora;
        this.NumeroDeCuentaBancaria = NumeroDeCuentaBancaria;
    }
    
}
