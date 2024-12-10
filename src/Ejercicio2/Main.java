package Ejercicio2;
import java.util.Scanner;

// Clase Producto
class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    // Constructor 1: nombre y precio, cantidad inicializada en 0
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = 0;
    }

    // Constructor 2: nombre, precio y cantidad
    public Producto(String nombre, double precio, int cantidad) {
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
    public void actualizarCantidad(int cantidadNueva) {
        if (cantidadNueva >= 0 || (this.cantidad + cantidadNueva >= 0)) {
            this.cantidad += cantidadNueva;
        } else {
            System.out.println("La cantidad no puede ser negativa.");
        }
    }
}

// Clase principal para probar Producto
public class MainProducto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear producto con el primer constructor
        Producto producto1 = new Producto("Laptop", 1500.00);
        
        // Crear producto con el segundo constructor
        Producto producto2 = new Producto("Smartphone", 800.00, 5);

        // Mostrar costos iniciales
        System.out.println("Producto 1: " + producto1.getNombre() + " | Costo total: $" + producto1.calcularCostoTotal());
        System.out.println("Producto 2: " + producto2.getNombre() + " | Costo total: $" + producto2.calcularCostoTotal());

        // Actualizar cantidades
        System.out.print("Ingrese cantidad para agregar al Producto 1: ");
        int cantidad1 = scanner.nextInt();
        producto1.actualizarCantidad(cantidad1);
        System.out.print("Ingrese cantidad para agregar al Producto 2: ");
        int cantidad2 = scanner.nextInt();
        producto2.actualizarCantidad(cantidad2);

        // Mostrar costos actualizados
        System.out.println("Producto 1: " + producto1.getNombre() + " | Cantidad: " + producto1.getCantidad() + " | Costo total: $" + producto1.calcularCostoTotal());
        System.out.println("Producto 2: " + producto2.getNombre() + " | Cantidad: " + producto2.getCantidad() + " | Costo total: $" + producto2.calcularCostoTotal());

        scanner.close();
    }
}
