/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import interfaz.IArticulo;

/**
 *
 * @author Lorenz
 */
public class CArticulos implements IArticulo {

    @Override
    public String[] agregarArticulo() {
        String[] articulos = {
            "un", "una", "unos", "unas", "el", "los", "la", "las", "lo", "este",
            "esta", "aquel", "aquella", "esos", "esas", "algún", "alguna",
            "Ningún", "Ninguna", "Aquellos", "Aquellas", "con", "su", "mi",
            "tu", "nuestro", "vuestro", "ese", "esa", "estos", "estas", "aquellos",
            "aquellas", "cualquier", "algunos", "algunas", "ninguna", "todo", "toda",
            "todos", "todas", "mucho", "mucha", "muchos", "muchas", "poco", "poca",
            "pocos", "pocas", "varios", "varias", "cada", "otro", "otra", "otros", "otras", "alguno", "alguna"
        };

        return articulos;
    }

    @Override
    public String obtenerArticulo(String palabra) {
        String salida = "";
        String obtenerArticulos[] = agregarArticulo();
        for (String obtenerArticulo : obtenerArticulos) {
            if (palabra.equalsIgnoreCase(obtenerArticulo)) {
                salida = palabra + " ";
            }
        }
        return salida;
    }

    @Override
    public boolean obtenerArticuloBool(String palabra) {
        boolean salida = false;
        String obtenerArticulos[] = agregarArticulo();
        for (String obtenerArticulo : obtenerArticulos) {
            if (palabra.equalsIgnoreCase(obtenerArticulo)) {
                salida = true;
            }
        }
        return salida;
    }

}
