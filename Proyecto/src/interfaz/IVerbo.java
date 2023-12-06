/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaz;

/**
 *
 * @author alanh
 */
public interface IVerbo {

    String[] agregarVerbo();

    String obtenerVerbo(String palabra);
    
    String obtenerVerboOracion(String palabra);

    boolean obtenerVerboBool(String palabra);

}
