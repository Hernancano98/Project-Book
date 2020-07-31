/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

/**
 *
 * @author Hernan Cano
 */
public class Tester {

    public static void main(String[] args) {

        /*
        This is the main class where i create the instances of other classes to
        show the output.
         */
        
        Decimals test1 = new Decimals();
        Random_numbers test2 = new Random_numbers();
        Division test4 = new Division();
        //Matrices test3 = new Matrices(0);
        Java_Generics<Integer, Double> test5 = new Java_Generics<>(4,34.66); // Inside the brackets we specify the types we are sending. It needs to be an object type, not a primitive.
        Ranges_Exercise test6 = new Ranges_Exercise();
    }
}
