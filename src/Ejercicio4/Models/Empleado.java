package Ejercicio4.Models;

public class Empleado {
    private String nombre;
    private int categoria;
    private Double sueldoBasico;
    private int numeroHijos;

    public Empleado(String nombre, int categoria, Double sueldoBasico, int numeroHijos) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.sueldoBasico = sueldoBasico;
        this.numeroHijos = numeroHijos;
    }

    private double getBonificacionXCategoria() {
        double porcentajeBonificacion = switch (categoria) {
                                            case 1 -> 0.15;
                                            case 2 -> 0.12;
                                            case 3 -> 0.10;
                                            default -> 0.07;
                                        };
        return sueldoBasico * porcentajeBonificacion;
    }

    private int getBonificacionXHijos() {
        if (numeroHijos <= 3) {
            return numeroHijos * 25;
        }
        else if (numeroHijos <= 6) {
            return numeroHijos * 40;
        }
        else {
            return numeroHijos * 60;
        }
    }

    @Override
    public String toString() {
        return "- Nombre: " + nombre +
             "\n- Sueldo Basico: " + sueldoBasico +
             "\n- Bonificacion por categoria: " + String.format("%.2f", getBonificacionXCategoria()) +
             "\n- Bonificacion por hijos: " + getBonificacionXHijos();
    }
}
