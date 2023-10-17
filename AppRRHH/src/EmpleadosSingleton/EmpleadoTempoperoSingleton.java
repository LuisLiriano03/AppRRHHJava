
package EmpleadosSingleton;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;


public class EmpleadoTempoperoSingleton {
    
    private static EmpleadoTempoperoSingleton instance;
    private PrintWriter logWriter;

    private EmpleadoTempoperoSingleton() {
        try {
            logWriter = new PrintWriter(new FileWriter("EmpleadoTemporero_log.txt", true));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static synchronized EmpleadoTempoperoSingleton getInstance() {
        if (instance == null) {
            instance = new EmpleadoTempoperoSingleton();
        }
        return instance;
    }

    public void EmpleadoCreacion(String NombreEmpleado,
            String DepartamentoDelEmpleado,
            String CargoDelEmpleado,
            double SalarioDelEmpleado,
            int HorasTrabajadas, 
            int PrecioPorHoras) {
        
        String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        String logMessage = String.format(
                "Fecha y hora: "
                + "%s\nNombre: "
                + "%s\nDepartamento: "
                + "%s\nCargo: "
                + "%s\nSalario: "
                + "%s\nHora diararias: "
                + "%s\nHoras Trabajadas: "
                + "%s\nDatos del empleado Temporero ",
                timestamp, 
                NombreEmpleado, 
                DepartamentoDelEmpleado, 
                CargoDelEmpleado, 
                SalarioDelEmpleado,
                HorasTrabajadas,
                PrecioPorHoras);

        logWriter.println(logMessage);
        logWriter.flush();
    }

    public void closeLog() {
        logWriter.close();
    }
    
}
