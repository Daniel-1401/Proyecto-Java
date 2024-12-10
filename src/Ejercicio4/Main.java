package Ejercicio4;

import Ejercicio4.Models.Empleado;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Empleado[] lstEmployees = new Empleado[0];

        String continueAddEmployees = "s";

        while (continueAddEmployees.equals("s") || continueAddEmployees.equals("S")) {
            lstEmployees = Arrays.copyOf(lstEmployees, lstEmployees.length + 1);

            System.out.println("Ingresa el nombre del empleado:");
            String nombre = sc.next();

            System.out.println("Ingresa su categoria:");
            int categoria = sc.nextInt();

            System.out.println("Ingresa su sueldo basico:");
            double sueldo = sc.nextDouble();

            System.out.println("Ingresa la cantidad de hijos:");
            int countHijos = sc.nextInt();

            Empleado empleado = new Empleado(nombre, categoria, sueldo, countHijos);

            lstEmployees[lstEmployees.length - 1] = empleado;


            System.out.println("Deseas continuar agregando empleados? (S/N)");
            continueAddEmployees = sc.next();
        }


        //System.out.println(Arrays.toString(lstEmployees));
        for (int i = 0; i < lstEmployees.length; i++) {
            System.out.println("EMPLEADO " + (i + 1) + ":");
            System.out.println(lstEmployees[i].toString());
            System.out.println();
        }
    }
}
