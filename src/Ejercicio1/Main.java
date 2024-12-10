package Ejercicio1;
import java.util.Scanner;

public class Main {
    private double x;
    private int n;

    // Constructor
    public Main(double x, int n) {
        if (x >= 0) {
            this.x = x;
            this.n = n;
        } else {
            throw new IllegalArgumentException("x debe ser mayor o igual a 0.");
        }
    }

    // Método para calcular la suma de la serie
    public double calcularSuma() {
        double suma = 1.0; // Primer término S = 1
        for (int i = 1; i <= n; i++) {
            double numerador = Math.pow(x, i);
            double denominador = 0.0;
            for (int j = 1; j <= i; j++) {
                denominador += j;
            }
            suma += numerador / denominador;
        }
        return suma;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor de x (x >= 0): ");
        double x = scanner.nextDouble();

        System.out.println("Ingrese el número de términos n: ");
        int n = scanner.nextInt();

        Main serie = new Main(x, n);
        double resultado = serie.calcularSuma();

        System.out.println("La suma de la serie es: " + resultado);
    }
}
