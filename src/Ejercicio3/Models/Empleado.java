package Ejercicio3.Models;

public class Empleado {
    private String nombre;
    private Double sueldoBasico;
    private Double impuestosAnual;

    public Empleado(String nombre, Double sueldoBasico) {
        this.nombre = nombre;
        this.sueldoBasico = sueldoBasico;
        this.calcularImpuestos();
    }

    private void calcularImpuestos() {
        Sunat calculosSunat = new Sunat();
        double sueldoBrutoAnual = this.getProyeccionIngresoAnual();
        this.impuestosAnual = calculosSunat.getImpuestoAnual(sueldoBrutoAnual);
    }

    @Override
    public String toString() {
        return "- Nombre: " + nombre +
             "\n- Sueldo Basico: " + sueldoBasico +
             "\n- Impuestos Mensual: " + String.format("%.2f", (impuestosAnual / 12));
    }


    public Double getSueldoBasicoAnual() {
        return sueldoBasico * 12;
    }

    public Double getGratificacionAnual(){
        return sueldoBasico * 2;
    }

    public Double getProyeccionIngresoAnual(){
        return this.getSueldoBasicoAnual() + this.getGratificacionAnual();
    }

}
