package examples;

import java.util.Scanner;

/**
 *
 * @author Enzo Avena
 * @author Hernan Cano
 */
public class Division {

    /*
    This code shows a way to use "Tray-Catch-Finally" structure.
    If we tell the program to divide by zero it should notice us the error,
    but the program shouldn't stop running, so we can control this using this type
    of structure.
    
    1 - tries the code
    2 - if there is an error, it catches the exception that the error generates and does the things we tell it to do when that happens.
    3 - The finally statement executes always.
    */
    
    public Division() {
        try {
            int value1;
            double result, value2;
            
            System.out.println("////////////////////////////////////////////////");
            System.out.println("DIVISION (TRY-CATCH) EXAMPLE");
            Scanner entrada = new Scanner(System.in);
            System.out.println("----------------------------------------------");
            System.out.print("Enter value n°1: ");
            value1 = entrada.nextInt();
            System.out.print("Enter value n°2: ");
            value2 = entrada.nextInt();
            System.out.println("----------------------------------------------");
            
            result = value1 / value2;
            System.out.println("Division result: " + result);
            
            // If we divide by zero or divide an 'int' number with a 'double' number it should catch the exception.
            
        } catch (Exception e) {
            
            // When the exception is catched it should execute the code below.
            
            System.out.println("Error : " + e); // the variable 'e' saves the error occurred and its printed on console
            
        } finally {
            // This executes always.
            System.out.println("Thank you for dividing with this program. Come back soon!");
        }
    }

}
