package Ejercicio5;
import java.util.Scanner;

public class Main {
    private String nombre;
    private double saldoInicial;
    private double saldoActual;
    private int depositosEfectivo;
    private int depositosCheque;

    // Constructor
    public Main(String nombre, double saldoInicial) {
        this.nombre = nombre;
        this.saldoInicial = saldoInicial;
        this.saldoActual = saldoInicial;
        this.depositosEfectivo = 0;
        this.depositosCheque = 0;
    }

    // Método para realizar un depósito
    public void deposito(double cantidad, int tipo) {
        if (tipo == 1) { // Depósito en efectivo
            saldoActual += cantidad;
            depositosEfectivo++;
        } else if (tipo == 2) { // Depósito con cheque
            double comision = cantidad * 0.01;
            saldoActual += (cantidad - comision);
            depositosCheque++;
        }
        System.out.println("Depósito realizado. Saldo actual: " + saldoActual);
    }

    // Método para realizar un retiro
    public void retiro(double cantidad) {
        if (cantidad <= saldoActual) {
            saldoActual -= cantidad;
            System.out.println("Retiro realizado. Saldo actual: " + saldoActual);
        } else {
            System.out.println("Error: Saldo insuficiente para realizar el retiro (Sobregiro).");
        }
    }

    // Método para mostrar el resumen
    public void mostrarResumen() {
        System.out.println("\n--- Resumen de Operaciones ---");
        System.out.println("Nombre del cliente: " + nombre);
        System.out.println("Saldo inicial: " + saldoInicial);
        System.out.println("Saldo final: " + saldoActual);
        System.out.println("Número de depósitos en efectivo: " + depositosEfectivo);
        System.out.println("Número de depósitos con cheque: " + depositosCheque);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos iniciales
        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese su saldo inicial: ");
        double saldoInicial = scanner.nextDouble();

        // Crear objeto de la clase Main
        Main cliente = new Main(nombre, saldoInicial);

        // Proceso repetitivo para las operaciones bancarias
        char opcion;
        do {
            System.out.println("\n--- Menú de Operaciones ---");
            System.out.println("D: Depósito");
            System.out.println("R: Retiro");
            System.out.println("F: Finalizar");
            System.out.println("Ingrese la opción: ");
            opcion = scanner.next().toUpperCase().charAt(0);

            switch (opcion) {
                case 'D':
                    System.out.println("Depósito en efectivo (1) o con cheque (2): ");
                    int tipoDeposito = scanner.nextInt();
                    if (tipoDeposito == 1 || tipoDeposito == 2) {
                        System.out.println("Ingrese la cantidad a depositar: ");
                        double cantidadDeposito = scanner.nextDouble();
                        cliente.deposito(cantidadDeposito, tipoDeposito);
                    } else {
                        System.out.println("Opción inválida.");
                    }
                    break;

                case 'R':
                    System.out.println("Ingrese la cantidad a retirar: ");
                    double cantidadRetiro = scanner.nextDouble();
                    cliente.retiro(cantidadRetiro);
                    break;

                case 'F':
                    cliente.mostrarResumen();
                    break;

                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opcion != 'F');
    }
}
