/*
Given a list of ranges, return a random number that falls within one of the ranges.
All numbers must have the same probability of being chosen.
 */
package examples;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Hernan Cano
 */
public class Ranges_Exercise {

    private int cant_intervalos;
    private int[][] rangos;
    private int i;
    private ArrayList<Integer> numeros_in = new ArrayList<>();
    private int salir;

    public Ranges_Exercise() {
        System.out.println("////////////////////////////////////////////////////");
        System.out.println("RANGES EXERCISE");

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese cantidad de intervalos:");
        cant_intervalos = s.nextInt();
        rangos = new int[cant_intervalos][2]; // Crea la matriz de acuerdo a la cantidad de intervalos ingresada, cafa fila es un intervalo 

        for (i = 0; i < cant_intervalos; i++) {
            for (int j = 0; j < 2; j++) {

                switch (j) {
                    case 0: {
                        System.out.println("Ingrese limite INFERIOR del intervalo --->" + "[ " + (i + 1) + " ]" + ":");
                        rangos[i][j] = s.nextInt();
                    }
                    case 1: {
                        System.out.println("Ingrese limite SUPERIOR del intervalo --->" + "[ " + (i + 1) + " ]" + ":");
                        rangos[i][j] = s.nextInt();
                    }
                }
            }
            comprobar(rangos[i][0], rangos[i][1]);
            llenar(rangos[i][0], rangos[i][1]);
        }

        mostrar();

    }

    private void comprobar(int inferior, int superior) {
        if (inferior > superior || superior < inferior) {
            System.out.println("Rango mal ingresado, vuelva a ingresarlo");
            i = i - 1;
            System.out.println("-----------------------------------------------");
        }

    }

    private void llenar(int inferior, int superior) {
        for (int in = inferior; in <= superior; in++) {
            numeros_in.add(in);
        }
    }

    private void mostrar() {
        Random r = new Random();
        while (salir != 1){
            int index = r.nextInt(numeros_in.size());
            int resultado = numeros_in.get(index);
            System.out.println("Numero Generado: " + resultado);
            for (int f = 0; f < cant_intervalos; f++) {
                if (resultado >= rangos[f][0] && resultado <= rangos[f][1]) {
                    System.out.println("Perteneciente al intervalo ---> [ " + rangos[f][0] + " - " + rangos[f][1] + " ]");
                }
            }
            Scanner s1 = new Scanner(System.in);
            System.out.println("Para salir ingrese 1  ///  Para generar otro numero ingrese cualquier otra tecla");
                    
            salir = s1.nextInt();
        }

    }

}
