package EmpleadosSingleton;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EmpleadoTiempoCompletoSingleton {
    private static EmpleadoTiempoCompletoSingleton instance;
    private PrintWriter logWriter;

    private EmpleadoTiempoCompletoSingleton() {
        try {
            logWriter = new PrintWriter(new FileWriter("EmpleadoTiempoCompleto_log.txt", true));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static synchronized EmpleadoTiempoCompletoSingleton getInstance() {
        if (instance == null) {
            instance = new EmpleadoTiempoCompletoSingleton();
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
                + "%s\nDatos del empleado tiempo completo",
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

