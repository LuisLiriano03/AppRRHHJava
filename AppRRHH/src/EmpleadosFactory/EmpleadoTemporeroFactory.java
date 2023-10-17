
package EmpleadosFactory;

import Empleados.EmpleadoTemporero;
import EmpleadosSingleton.EmpleadoTempoperoSingleton;

public class EmpleadoTemporeroFactory {
    
    public static EmpleadoTemporero createEmployee(String NombreEmpleado,
            String DepartamentoDelEmpleado,
            String CargoDelEmpleado,
            double SalarioDelEmpleado,
            int HorasTrabajadas, 
            int PrecioPorHoras) {
        
        EmpleadoTemporero employee = new EmpleadoTemporero(NombreEmpleado, 
                DepartamentoDelEmpleado, 
                CargoDelEmpleado, 
                SalarioDelEmpleado,
                HorasTrabajadas,
                PrecioPorHoras);
        
        EmpleadoTempoperoSingleton logger = EmpleadoTempoperoSingleton.getInstance();
        logger.EmpleadoCreacion(NombreEmpleado, 
                DepartamentoDelEmpleado, 
                CargoDelEmpleado, 
                SalarioDelEmpleado,
                HorasTrabajadas,
                PrecioPorHoras);
        
        return employee;
    }
    
    
    
}
