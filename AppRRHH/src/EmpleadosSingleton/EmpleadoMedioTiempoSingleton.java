
package EmpleadosSingleton;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EmpleadoMedioTiempoSingleton {
    
    private static EmpleadoMedioTiempoSingleton instance;
    private PrintWriter logWriter;

    private EmpleadoMedioTiempoSingleton() {
        try {
            logWriter = new PrintWriter(new FileWriter("EmpleadoMedioTiempo_log.txt", true));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static synchronized EmpleadoMedioTiempoSingleton getInstance() {
        if (instance == null) {
            instance = new EmpleadoMedioTiempoSingleton();
        }
        return instance;
    }

    public void EmpleadoCreacion(String NombreEmpleado,
            String DepartamentoDelEmpleado,
            String CargoDelEmpleado,
            double SalarioDelEmpleado,
            int HoraDiarariasDeTrabajo,
            int PrecioPorHoras,
            int NumeroDeCuentaBancaria) {
        
        String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        String logMessage = String.format(
                "Fecha y hora: "
                + "%s\nNombre: "
                + "%s\nDepartamento: "
                + "%s\nCargo: "
                + "%s\nSalario: "
                + "%s\nHora diararias: "
                + "%s\nPrecio por horas: "
                + "%s\nNumero de cuenta Bancaria: "
                + "%s\nDatos del empleado medio tiempo ",
                timestamp, 
                NombreEmpleado, 
                DepartamentoDelEmpleado, 
                CargoDelEmpleado, 
                SalarioDelEmpleado,
                HoraDiarariasDeTrabajo,
                PrecioPorHoras,
                NumeroDeCuentaBancaria);

        logWriter.println(logMessage);
        logWriter.flush();
    }

    public void closeLog() {
        logWriter.close();
    }
    
}
