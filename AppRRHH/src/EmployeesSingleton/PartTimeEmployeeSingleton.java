
package EmployeesSingleton;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PartTimeEmployeeSingleton {
    
    private static PartTimeEmployeeSingleton instance;
    private PrintWriter logWriter;

    private PartTimeEmployeeSingleton() {
        try {
            logWriter = new PrintWriter(new FileWriter("PartTimeEmployee_log.txt", true));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static synchronized PartTimeEmployeeSingleton getInstance() {
        if (instance == null) {
            instance = new PartTimeEmployeeSingleton();
        }
        return instance;
    }

    public void CreateEmployee(String EmployeeName,
            String EmployeeDepartment,
            String EmployeePosition,
            double EmployeeSalary,
            int DailyWorkHours,
            int PricePerHour,
            int BankAccountNumber) {
        
        String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        String logMessage = String.format(
                "Date and Time: "
                + "%s\nName: "
                + "%s\nDepartment: "
                + "%s\nPosition: "
                + "%s\nSalary: "
                + "%s\nDaily Work Hours: "
                + "%s\nPrice Per Hour: "
                + "%s\nBank Account Number: "
                + "%s\n",
                timestamp, 
                EmployeeName, 
                EmployeeDepartment, 
                EmployeePosition, 
                EmployeeSalary,
                DailyWorkHours,
                PricePerHour,
                BankAccountNumber);

        logWriter.println(logMessage);
        logWriter.flush();
    }

    public void closeLog() {
        logWriter.close();
    }
    
}
