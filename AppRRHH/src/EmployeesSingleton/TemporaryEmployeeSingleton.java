
package EmployeesSingleton;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;


public class TemporaryEmployeeSingleton {
    
    private static TemporaryEmployeeSingleton instance;
    private PrintWriter logWriter;

    private TemporaryEmployeeSingleton() {
        try {
            logWriter = new PrintWriter(new FileWriter("TemporaryEmployee_log.txt", true));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static synchronized TemporaryEmployeeSingleton getInstance() {
        if (instance == null) {
            instance = new TemporaryEmployeeSingleton();
        }
        return instance;
    }

    public void CreateEmployee(String EmployeeName,
            String EmployeeDepartment,
            String EmployeePosition,
            double EmployeeSalary,
            int DailyWorkHours,
            int PricePerHour) {
        
        String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        String logMessage = String.format(
                "Fecha y hora: "
                + "%s\nName: "
                + "%s\nDepartament: "
                + "%s\nPosition: "
                + "%s\nSalary: "
                + "%s\nDaily Work Hours: "
                + "%s\nPrice Per Hour: "
                + "%s\n",
                timestamp,
                EmployeeName, 
                EmployeeDepartment, 
                EmployeePosition, 
                EmployeeSalary,
                DailyWorkHours,
                PricePerHour);

        logWriter.println(logMessage);
        logWriter.flush();
    }

    public void closeLog() {
        logWriter.close();
    }
    
}
