
package Test;

import EmployeesFactory.EmployeeFactory;
import EmployeesSingleton.LogEmployees;
import Models.Employee;
import Models.TypeEmployee;
import java.util.Scanner;


public class data {
    
    public static void FullTimeEmployee(){
        LogEmployees logger = LogEmployees.getInstance();

        EmployeeFactory factory = new EmployeeFactory();
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del empleado:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el departamento del empleado:");
        String departamento = scanner.nextLine();

        System.out.println("Ingrese el cargo del empleado:");
        String cargo = scanner.nextLine();

        System.out.println("Ingrese el salario del empleado:");
        double salario = scanner.nextDouble();

        Employee empleado = factory.createEmployee(TypeEmployee.TEMPORARY);

        empleado.setName(nombre);
        empleado.setDepartment(departamento);
        empleado.setPosition(cargo);
        empleado.setSalary(salario);

        logger.logEmployeeCreation(empleado);

        logger.closeLogger();
    }
    
    
}
