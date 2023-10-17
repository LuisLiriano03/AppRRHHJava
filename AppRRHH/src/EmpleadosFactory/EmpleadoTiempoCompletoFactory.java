
package EmpleadosFactory;

import Empleados.EmpleadoTiempoCompleto;
import EmpleadosSingleton.EmpleadoTiempoCompletoSingleton;

public class EmpleadoTiempoCompletoFactory {
    
    public static EmpleadoTiempoCompleto createEmployee(String NombreEmpleado,
            String DepartamentoDelEmpleado,
            String CargoDelEmpleado,
            double SalarioDelEmpleado,
            int HoraDiarariasDeTrabajo,
            int PrecioPorHoras,
            int NumeroDeCuentaBancaria) {
        
        EmpleadoTiempoCompleto employee = new EmpleadoTiempoCompleto(NombreEmpleado, 
                DepartamentoDelEmpleado, 
                CargoDelEmpleado, 
                SalarioDelEmpleado,
                HoraDiarariasDeTrabajo,
                PrecioPorHoras,
                NumeroDeCuentaBancaria);
        
        EmpleadoTiempoCompletoSingleton logger = EmpleadoTiempoCompletoSingleton.getInstance();
        logger.EmpleadoCreacion(NombreEmpleado, 
                DepartamentoDelEmpleado, 
                CargoDelEmpleado, 
                SalarioDelEmpleado,
                HoraDiarariasDeTrabajo,
                PrecioPorHoras,
                NumeroDeCuentaBancaria);
        
        return employee;
    }
    
   
}
