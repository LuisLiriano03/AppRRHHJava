
package EmpleadosFactory;

import Empleados.EmpleadoMedioTiempo;
import EmpleadosSingleton.EmpleadoMedioTiempoSingleton;

public class EmpleadoMedioTiempoFactory {
   
    public static EmpleadoMedioTiempo createEmployee(String NombreEmpleado,
            String DepartamentoDelEmpleado,
            String CargoDelEmpleado,
            double SalarioDelEmpleado,
            int HoraDiarariasDeTrabajo,
            int PrecioPorHoras,
            int NumeroDeCuentaBancaria) {
        
        EmpleadoMedioTiempo employee = new EmpleadoMedioTiempo(NombreEmpleado, 
                DepartamentoDelEmpleado, 
                CargoDelEmpleado, 
                SalarioDelEmpleado,
                HoraDiarariasDeTrabajo,
                PrecioPorHoras,
                NumeroDeCuentaBancaria);
        
        EmpleadoMedioTiempoSingleton logger = EmpleadoMedioTiempoSingleton.getInstance();
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
