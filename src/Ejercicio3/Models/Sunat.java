package Ejercicio3.Models;

public class Sunat {
    static final int VALOR_UIT = 4200;

    Sunat(){}

    public Double getImpuestoAnual(double SueldoBrutoAnual){

        /*SI LA RENTA IMPONIBLE ES MENOR A LAS 7 UIT NO SE LE APLICA IMPUESTOS*/
        double impuestoTotal = 0;

        if (SueldoBrutoAnual <= (7 * VALOR_UIT)) {
            return 0.0;
        }
        else if (SueldoBrutoAnual <= (12 * VALOR_UIT)) {
            //impuestoTotal += SueldoBrutoAnual * 0.08;
            return SueldoBrutoAnual * 0.08;
        }
        else if (SueldoBrutoAnual <= (21 * VALOR_UIT)) {
            //impuestoTotal += (12 * VALOR_UIT) * 0.08;
            //impuestoTotal += (SueldoBrutoAnual - (12 * VALOR_UIT)) * 0.14;
            return SueldoBrutoAnual * 0.14;
        }
        else if (SueldoBrutoAnual <= (30 * VALOR_UIT)) {
            //impuestoTotal += (12 * VALOR_UIT) * 0.08;
            //impuestoTotal += (21 * VALOR_UIT) * 0.14;
            //impuestoTotal += (SueldoBrutoAnual - (21 * VALOR_UIT)) * 0.21;
            return SueldoBrutoAnual * 0.21;
        }
        else {
            //impuestoTotal += (12 * VALOR_UIT) * 0.08;
            //impuestoTotal += (21 * VALOR_UIT) * 0.14;
            //impuestoTotal += (30 * VALOR_UIT) * 0.21;
            //impuestoTotal += (SueldoBrutoAnual - (30 * VALOR_UIT)) * 0.30;
            return SueldoBrutoAnual * 0.30;
        }

        //System.out.println("Sueldo anual del trabajador: S/ " + SueldoBrutoAnual);
        //System.out.println("Impuesto total a pagar: S/ " + impuestoTotal);

        //return impuestoTotal;
    }
}
