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
public interface ISustantivo {

    String[] agregarSustantivo();

    String obtenerSustantivo(String palabra);

    String obtenerSustantivoOracion(String palabra);

    boolean obtenerSustantivoBool(String palabra);

}
