/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import interfaz.ISustantivo;
import java.util.ArrayList;

/**
 *
 * @author alanh
 */
public class CSustantivo implements ISustantivo {

    @Override
    public String[] agregarSustantivo() {
        String sustantivos[] = {"Hombre", "Mujer", "Niño", "Maestro", "Estudiante",
            "Perro", "Gato", "Elefante", "Serpiente", "Pájaro",
            "Mesa", "Silla", "Computadora", "Libro", "Teléfono",
            "Amor", "Odio", "Libertad", "Justicia", "Tiempo",
            "Árbol", "Río", "Montaña", "Cielo", "Mar",
            "Casa", "Calle", "Ciudad", "País", "Continente",
            "Pintura", "Escultura", "Música", "Película", "Teatro",
            "Canción", "Poesía", "Historia", "Matemáticas", "Ciencia",
            "Idea", "Sueño", "Realidad", "Felicidad", "Tristeza",
            "Aventura", "Viaje", "Destino", "Familia", "Amistad",
            "Trabajo", "Éxito", "Fracaso", "Fuego", "Aire",
            "Agua", "Tierra", "Energía", "Fuerza", "Color",
            "Sabor", "Olor", "Sonido", "Silencio", "Sombra",
            "Luz", "Calor", "Frío", "Viento", "Lluvia",
            "Nube", "Estrella", "Luna", "Sol", "Universo",
            "Esperanza", "Fe", "Caridad", "Paz", "Guerra",
            "Cambio", "Transformación", "Riqueza", "Pobreza", "Salud",
            "Enfermedad", "Ética", "Moraleja", "Virtud", "Vicio"};
        return sustantivos;

    }

    @Override
    public String obtenerSustantivo(String palabra) {
        String salida="";
        String obtenerSustantivos[] = agregarSustantivo();
        for (String obtenerSustantivo : obtenerSustantivos) {
            if(palabra.equalsIgnoreCase(obtenerSustantivo)){
            salida=obtenerSustantivo;
            }
        }
        return salida;
    }

}
