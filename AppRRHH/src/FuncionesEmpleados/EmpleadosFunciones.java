
package FuncionesEmpleados;

import Empleados.EmpleadoMedioTiempo;
import Empleados.EmpleadoTemporero;
import Empleados.EmpleadoTiempoCompleto;
import EmpleadosFactory.EmpleadoMedioTiempoFactory;
import EmpleadosFactory.EmpleadoTemporeroFactory;
import EmpleadosFactory.EmpleadoTiempoCompletoFactory;
import EmpleadosSingleton.EmpleadoTiempoCompletoSingleton;


public class EmpleadosFunciones {
    public static void empleadoTiempoCompleto(){
        EmpleadoTiempoCompletoFactory factory = new EmpleadoTiempoCompletoFactory();

        EmpleadoTiempoCompleto employee1 = factory.createEmployee(
                "Mateo Perez", 
                "HR", 
                "Manager", 
                50000.0,
                40,
                30,
                2578411);
        
        EmpleadoTiempoCompletoSingleton.getInstance().closeLog();
    }
    
    public static void empleadoMedioTiempo(){
        EmpleadoMedioTiempoFactory factory1 = new EmpleadoMedioTiempoFactory();

        EmpleadoMedioTiempo employee2 = factory1.createEmployee(
                "Karla Castro", 
                "QA", 
                "Manager", 
                78000.0,
                50,
                40,
                784523955);
        
        EmpleadoTiempoCompletoSingleton.getInstance().closeLog();
    }
    
    public static void empleadoTemporero(){
        EmpleadoTemporeroFactory factory3 = new EmpleadoTemporeroFactory();

        EmpleadoTemporero employee3 = factory3.createEmployee(
                "Julio Sanchez", 
                "Desarrollo", 
                "Manager", 
                78000.0,
                50,
                40);
        
        EmpleadoTiempoCompletoSingleton.getInstance().closeLog();
    }
}
