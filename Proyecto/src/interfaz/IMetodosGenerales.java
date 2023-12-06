/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaz;

import java.util.ArrayList;

/**
 *
 * @author alanh
 */
public interface IMetodosGenerales {

    ArrayList<String> separarXPalabra(String palabra);

    String[] separarXOracion(String palabra);

    ArrayList<String> obtenerElementoLexico(ArrayList<String> palabra);

    String obtenerElementoLexicoBoolean(String palabra);
    
    ArrayList<String> oracionesSimples(String palabra);
}
