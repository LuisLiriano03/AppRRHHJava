
package EmployeesSingleton;

import Models.Employee;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LogEmployees {
    
    private static LogEmployees instance;
    private FileWriter fileWriter;

    private LogEmployees() {
        try {
            fileWriter = new FileWriter("Employee_log.txt", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static LogEmployees getInstance() {
        if (instance == null) {
            instance = new LogEmployees();
        }
        return instance;
    }

    public void logEmployeeCreation(Employee employee) {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("\nyyyy-MM-dd HH:mm:ss");
        String logEntry = dateFormat.format(date) + employee.toString();

        try {
            fileWriter.write(logEntry + "\n");
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        finally{
            closeLogger();
        }
    }

    public void closeLogger() {
        try {
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
