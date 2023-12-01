/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import interfaz.IPronombre;

/**
 *
 * @author alanh
 */
public class CPronombre implements IPronombre {

    @Override
    public String[] agregarPronombre() {
        String pronombre[] = {"Yo", "me", "mí", "conmigo", "Nosotros", "nos", "nosotras", "Tú", "te", "ti", "contigo", "usted", "vos", "vosotros", "vosotras", "os",
            "ustedes", "él", "lo", "le", "se", "consigo", "ella", "la", "ello", "lo", "ellos", "ellas", "los", "las", "les", "se", "sí"};

        return pronombre;
    }

    @Override
    public String obtenerPronombre(String palabra) {
        String salida = "";
        String obtenerPronombres[] = agregarPronombre();
        for (String obtenerPronombre : obtenerPronombres) {
            if (palabra.equalsIgnoreCase(obtenerPronombre)) {
                salida = palabra + " ";
            }
        }
        return salida;
    }

    @Override
    public boolean obtenerPronombreBool(String palabra) {
        boolean salida = false;
        String obtenerPronombres[] = agregarPronombre();
        for (String obtenerPronombre : obtenerPronombres) {
            if (palabra.equalsIgnoreCase(obtenerPronombre)) {
                salida =true;
                break;
            }
        }
        return salida;
    }

}
