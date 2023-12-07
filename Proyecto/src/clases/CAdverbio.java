/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import interfaz.IAdverbio;

/**
 *
 * @author alanh
 */
public class CAdverbio implements IAdverbio {

    @Override
    public String[] agregarAdverbio() {
        String[] adverbios = {
            "Rápidamente", "Lentamente", "Bien", "Mal", "Pronto", "Tarde", "Aquí", "Allí", "Ahora",
            "Siempre", "Nunca", "Cerca", "Lejos", "Adelante", "Atrás", "Despacio",
            "Deprisa", "Así", "Casi", "Seguro", "Quizás", "Jamás", "Mucho", "Poco", "Muy",
            "Menos", "Más", "Apenas", "Demasiado", "Bastante", "Exactamente", "Sí", "No", "Solo",
            "Ciertamente", "Realmente", "Prácticamente", "Hoy", "Mañana", "Ayer", "Aún",
            "Todavía", "Fuera", "Adentro", "Arriba", "Abajo", "Erguido", "Tumbado", "Derecha",
            "Izquierda", "Con", "Sin", "Mejor", "Peor", "Tal", "Cual", "Lejos", "Cerca", "Siempre",
            "Nunca", "Seguramente", "Quizás", "Jamás", "Mucho", "Poco", "Muy", "Menos", "Más",
            "Apenas", "Demasiado", "Bastante", "Exactamente", "Solo", "Solamente", "Ciertamente",
            "Realmente", "Prácticamente", "Aquí", "Allí", "Ahora", "Ayer", "Hoy", "Mañana", "Aún",
            "Todavía", "Después", "Antes", "Diariamente", "Eventualmente", "Lentamente", "junto", "por"
        };
        return adverbios;
    }

    @Override
    public String obtenerAdverbio(String palabra) {
        String salida = "";
        String[] obtenerAdverbios = agregarAdverbio();
        for (String obtenerAdverbio : obtenerAdverbios) {
            if (palabra.equalsIgnoreCase(obtenerAdverbio)) {
                salida = palabra + " ";
            }
        }
        return salida;
    }

    @Override
    public boolean obtenerAdverbioBool(String palabra) {
        boolean salida = false;
        String[] obtenerAdverbios = agregarAdverbio();
        for (String obtenerAdverbio : obtenerAdverbios) {
            if (palabra.equalsIgnoreCase(obtenerAdverbio)) {
                salida = true;
                break;
            }
        }
        return salida;
    }

}
