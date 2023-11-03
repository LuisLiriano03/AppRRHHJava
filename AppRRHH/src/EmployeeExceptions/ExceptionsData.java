
package EmployeeExceptions;

import java.util.Scanner;

public class ExceptionsData {
    
    public static int AskForNumber() {
        
        Scanner scanner = new Scanner(System.in);

        while (true) {
            
            String input = scanner.nextLine();

            try {
                int numero = Integer.parseInt(input);
                return numero;
            } catch (NumberFormatException e) {
                System.out.println("Invalid value, please enter a Number.");
            }
            
        }
        
    }
    
    public static double AskForDouble() {
        
        Scanner scanner = new Scanner(System.in);

        while (true) {
            
            String input = scanner.nextLine();

            try {
                double numero = Double.parseDouble(input);
                return numero;
            } catch (NumberFormatException e) {
                System.out.println("Invalid value, please enter a Number. decimal.");
            }
            
        }
        
    }
    
    public static String RequestTheText() {
        
        Scanner scanner = new Scanner(System.in);

        while (true) {
            
            String input = scanner.nextLine();

            if (esTextoValido(input)) {
                return input;
            } else {
                System.out.println("Invalid value, please enter a Text.");
            }
        }
        
    }

    public static boolean esTextoValido(String input) {
        return !input.matches(".*\\d.*");
    }
}
