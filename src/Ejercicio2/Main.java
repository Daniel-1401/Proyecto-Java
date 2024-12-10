package Ejercicio2;
import java.util.Scanner;

public class Main {
    private String nombre;
    private double precio;
    private int cantidad;

    // Constructor 1: Nombre y precio
    public Main(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = 0;
    }

    // Constructor 2: Nombre, precio y cantidad
    public Main(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    // Método para calcular el costo total
    public double calcularCostoTotal() {
        return precio * cantidad;
    }

    // Método para actualizar la cantidad
    public void actualizarCantidad(int cantidad) {
        if (cantidad >= 0) {
            this.cantidad += cantidad;
        } else if (this.cantidad + cantidad >= 0) {
            this.cantidad += cantidad;
        } else {
            System.out.println("No se puede reducir la cantidad por debajo de 0.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear objeto con el primer constructor
        System.out.println("Ingrese el nombre del producto: ");
        String nombre1 = scanner.nextLine();
        System.out.println("Ingrese el precio del producto: ");
        double precio1 = scanner.nextDouble();
        Main producto1 = new Main(nombre1, precio1);

        // Crear objeto con el segundo constructor
        scanner.nextLine(); // Consumir el salto de línea
        System.out.println("Ingrese el nombre del segundo producto: ");
        String nombre2 = scanner.nextLine();
        System.out.println("Ingrese el precio del segundo producto: ");
        double precio2 = scanner.nextDouble();
        System.out.println("Ingrese la cantidad del segundo producto: ");
        int cantidad2 = scanner.nextInt();
        Main producto2 = new Main(nombre2, precio2, cantidad2);

        // Probar métodos
        producto1.actualizarCantidad(5); // Agregar cantidad al primer producto
        System.out.println("Producto 1: " + producto1.getNombre() + " - Costo total: " + producto1.calcularCostoTotal());

        producto2.actualizarCantidad(-2); // Reducir cantidad del segundo producto
        System.out.println("Producto 2: " + producto2.getNombre() + " - Costo total: " + producto2.calcularCostoTotal());

        // Imprimir valores actualizados
        System.out.println("Producto 1 cantidad: " + producto1.getCantidad());
        System.out.println("Producto 2 cantidad: " + producto2.getCantidad());
    }
}
