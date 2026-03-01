package com.mycompany.mavenproject2jordan;
import java.util.Scanner;

/**
 * @author ALUMNO
 */
public class Mavenproject2jordan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pg, pe, pp, pt;
        
        System.out.println("Ingresa el numero de partidos ganados: ");
        pg = sc.nextInt();
        
        System.out.println("Ingresa el numero de partidos empatados: ");
        pe = sc.nextInt();
        
        System.out.println("Ingresa el numero de partidos perdidos: ");
        pp = sc.nextInt();
        
        pt = pg * 3 + pe * 1 + pp * 0;
        System.out.println("Puntaje Total: " + pt);
    }
}
