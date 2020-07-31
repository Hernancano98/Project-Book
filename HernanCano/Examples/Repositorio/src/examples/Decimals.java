package examples;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Hernan Cano
 */
public class Decimals {

    public Decimals() {
        
        System.out.println("////////////////////////////////////////////////////");
        System.out.println("DECIMALS EXAMPLE");

        /* 
        
        This class shows the different ways to get the amount of decimals
        of a number that we want.
        
        + Decimal Format
        + String Format
        + Math.round
        + Big Decimal
        
        */
        
        // The user is asked to enter a number, that is going to be used for the demonstration.
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = s1.nextInt();

        // The square root of the number is calculated, saved in root and printed on console with all the decimals.
        double root = Math.sqrt(number);
        System.out.println("The square root of " + number + " is = " + root);
        System.out.println("----------------------------------------------");

        /*
        Now we assume we don't want to use all decimals.
         */
        
        // Decimals using DecimalFormat (coma 1,0)
        System.out.println("Using DecimalFormat class:");// import java.text.DecimalFormat;
        DecimalFormat df = new DecimalFormat("#.00");// The class is instantiated with a format. The amount of zeros is the amount of decimals after the coma that we are going to get.
        System.out.println("    The square root of " + number + " is = " + df.format(root));// The entered format is applied to root.
        System.out.println("----------------------------------------------");

        // Decimals using String.format (coma 1,0)
        System.out.println("Using String.format:"); // No need for instantiation.
        System.out.println("    The square root of " + number + " is = " + String.format("%.3f", root));
        // Similar to Decimal Format but the format is inside the argument and the number before letter f is the amount of decimals.
        System.out.println("----------------------------------------------");

        // Decimals using Math.round (dot 1.0)
        System.out.println("Using Math.round:"); // No need for instantiation.
        System.out.println("    The square root of " + number + " is = " + (double) Math.round(root * 10000d) / 10000);
        // I dont know how decimals are set in this one.
        System.out.println("----------------------------------------------");

        // Decimals using BigDecimal (dot 1.0)
        System.out.println("Using BigDecimal class:"); // import java.math.BigDecimal; import java.math.RoundingMode;
        BigDecimal bd = new BigDecimal(root);// The class is instntiated sending the number as an argument.
        bd = bd.setScale(5, RoundingMode.HALF_UP);// We set the amount of decimals that we want to get and the rounding mode from a list.
        System.out.println("    Raiz cuadrada de " + number + " es = " + bd.doubleValue()); // converts de result into double.

    }

}
