package EmployeesSingleton;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FullTimeEmployeeSingleton {
    private static FullTimeEmployeeSingleton instance;
    private PrintWriter logWriter;

    private FullTimeEmployeeSingleton() {
        try {
            logWriter = new PrintWriter(new FileWriter("FullTimeEmployee_log.txt", true));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static synchronized FullTimeEmployeeSingleton getInstance() {
        if (instance == null) {
            instance = new FullTimeEmployeeSingleton();
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

