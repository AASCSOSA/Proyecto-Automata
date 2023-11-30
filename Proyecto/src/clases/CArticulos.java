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
public class CArticulos implements IArticulo{

    @Override
    public String[] agregarArticulo() {
         String [] articulos = {
             "un","una","unos","unas",
             "el","los", "la","las","lo"
         };
         
         return articulos;
    }

    @Override
    public String obtenerArticulo(String palabra) {
        String salida = "";
            String obtenerArticulos[] = agregarArticulo();
        for (String obtenerArticulo : obtenerArticulos) {
            if(palabra.equalsIgnoreCase(obtenerArticulo)){
            salida=obtenerArticulo;
            }
        }
        return salida;
    }
    
}
