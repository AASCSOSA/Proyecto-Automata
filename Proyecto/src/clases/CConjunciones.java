/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import interfaz.IConjuciones;

/**
 *
 * @author Felipe García
 */
public class CConjunciones implements IConjuciones {

    @Override
    public String[] agregarConjucion() {
        String[] conjucion = {
            "y", "o", "pero", "aunque", "sino", "porque", "si", "como", "mientras", "después", "antes",
            "hasta que", "ya que", "así que", "para que", "ni", "tanto como", "cuando", "donde",
            "con tal de que", "como si", "siempre que", "por tanto", "por lo tanto", "a pesar de que",
            "puesto que", "ya", "pues", "luego", "aun cuando", "por consiguiente", "no obstante", "en cambio",
            "en tanto que", "a fin de que", "conforme a", "según", "además", "a su vez", "si bien", "como resultado", "por ende"
        };
        return conjucion;
    }

    @Override
    public String obtenerConjucion(String palabra) {
        String salida = "";
        String[] obtenerConjunciones = agregarConjucion();
        for (String obtenerConjucion : obtenerConjunciones) {
            if (palabra.equals(obtenerConjucion)) {
                salida = palabra + " ";
            }
        }
        return salida;
    }

    public boolean obtenerConjucionBool(String palabra) {
        boolean salida = false;
        String[] obtenerConjunciones = agregarConjucion();
        for (String obtenerConjucion : obtenerConjunciones) {
            if (palabra.equals(obtenerConjucion)) {
                salida = true;
                break;
            }
        }
        return salida;
    }
}
