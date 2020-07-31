/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;
import java.util.Random;
/**
 *
 * @author Hernan Cano
 */
public class Random_numbers {

    public Random_numbers() {
        System.out.println("///////////////////////////////////////////////////");
        System.out.println("RANDOM NUMBERS EXAMPLE");
        System.out.println("Using Math class:");
        int randomNumber = (int)(Math.random()*1000); // Casting (double --> int)
        System.out.println("    Random generated number: " + randomNumber);

        /*
        Math.random() returns a 'double' random number, less than 1 and grater than 0.
        We multiply by 1000 to set the upper limit of the random number's range. in this case [ 0 , 1000 ]
        */
        
        System.out.println("---------------------------------------------------");
        System.out.println("Using Random class");
        Random r1 = new Random(); // We nedd to create an instance
        System.out.println("    Random generated number: " + (r1.nextInt(1000)));
        
        /*
        Similar to Math.random() syntax except for the upper limit, i goes inside the argument and no need for casting.
        However this only works for the method r1.nextInt(). If we use r1.nextDouble() we need to multiply to get the upper
        limit and the argument needs to be empty, we also need to do a casting. Exactly like Math.random().
        */
    }
    
}
