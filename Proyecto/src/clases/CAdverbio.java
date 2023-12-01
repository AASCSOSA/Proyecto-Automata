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
            "Rápidamente", "Lentamente", "Bien", "Mal", "Pronto",
            "Tarde", "Aquí", "Allí", "Ahora", "Siempre",
            "Nunca", "Cerca", "Lejos", "Adelante", "Atrás",
            "Despacio", "Deprisa", "Así", "Casi", "Seguro",
            "Quizás", "Jamás", "Mucho", "Poco", "Muy",
            "Menos", "Más", "Apenas", "Demasiado", "Bastante",
            "Exactamente", "Sí", "No", "También", "Solo",
            "Solamente", "Ciertamente", "Realmente", "Prácticamente", "Hoy",
            "Mañana", "Ayer", "Aún", "Todavía", "Ahora",
            "Afuera", "Adentro", "Arriba", "Abajo", "Erguido",
            "Tumbado", "Derecha", "Izquierda", "Casi", "Con",
            "Sin", "Más", "Menos", "Mejor", "Peor",
            "Así", "Sí", "No", "Tal", "Cual",
            "Pronto", "Lejos", "Cerca", "Siempre", "Nunca",
            "Seguramente", "Quizás", "Jamás", "Mucho", "Poco",
            "Muy", "Menos", "Más", "Apenas", "Demasiado",
            "Bastante", "Exactamente", "Solo", "Solamente", "Ciertamente",
            "Realmente", "Prácticamente", "Aquí", "Allí", "Ahora",
            "Ayer", "Hoy", "Mañana", "Aún", "Todavía",
            "Después", "Antes", "Pronto", "Tarde", "Nunca",
            "Siempre", "Casi", "Quizás", "Seguramente", "Bastante", "Quizás", "Seguramente", "Bastante", "Dulcemente",
            "Curiosamente", "Valientemente", "Alegremente", "Cuidadosamente", "Suavemente",
            "Ansiosamente", "Amigablemente", "Juguetonamente", "Hábilmente", "Tiernamente", "Astutamente",
            "Felizmente", "Ligeramente", "Sorprendentemente", "Intensamente", "Diariamente", "Eventualmente",
            "Lentamente"
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
