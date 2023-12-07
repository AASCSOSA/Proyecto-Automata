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
        String sustantivos[] = {
            "Hombre", "Mujer", "Niño", "Maestro", "Estudiante",
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
            "Enfermedad", "Ética", "Moraleja", "Virtud", "Vicio", "Ratón",
            "Viaje", "Cuento", "Niño", "Casa", "Aventura", "Bosque", "Amistad", "Alegría",
            "Magía", "Risa", "Sueño", "Jardín", "Tesoro", "Aprendizaje", "Color", "Playera",
            "ratones", "casa", "montaña", "calcetines", "ratona", "vestido", "auto", "coche", "automóvil",
            "calcetin", "señor", "adulto", "bigote", "gorra", "mamá", "Carro", "pies", "pie", "pata",
            "hijo", "autos", "Negro", "Hormiga", "Rana", "Pez", "León", "Tigre",
            "Lápiz", "Papel", "Reloj", "Cuchillo", "Cuchara",
            "Casa", "Calle", "Ciudad", "Edificio", "Escuela",
            "Pintor", "Cantante", "Escritor", "Médico", "Bombero",
            "Cielo", "Estrella", "Cometa", "Meteorito", "Galaxia",
            "Playa", "Desierto", "Volcán", "Isla", "Selva",
            "Computadora", "Tablet", "Internet", "Redes", "Programa",
            "Película", "Actor", "Director", "Guión", "Cámara",
            "Historia", "Novela", "Poesía", "Biografía", "Cuento",
            "Sueño", "Pesadilla", "Fantasía", "Imaginación", "Realidad",
            "Familia", "Padre", "Madre", "Hermano", "Hermana",
            "Trabajo", "Empleo", "Oficina", "Proyecto", "Labor",
            "Fuego", "Llama", "Incendio", "Hoguera", "Chispa",
            "Tierra", "Continente", "Océano", "Paisaje", "Geografía",
            "Sonido", "Música", "Melodía", "Ritmo", "Armonía",
            "Silencio", "Tranquilidad", "Quietud", "Pausa", "Calma",
            "Luz", "Oscuridad", "Sombra", "Resplandor", "Brillo",
            "Viento", "Huracán", "Brisa", "Tormenta", "Susurro",
            "Lluvia", "Agua", "Gota", "Arco iris", "Tormenta",
            "Estrella", "Luna", "Planeta", "Nebulosa", "Astro",
            "Universo", "Cosmos", "Galaxia", "Constelación", "Astronomía",
            "Paz", "Armonía", "Tregua", "Cese", "Serenidad",
            "Riqueza", "Fortuna", "Bienes", "Tesoro", "Propiedad",
            "Salud", "Enfermedad", "Cuidado", "Prevención", "Recuperación",
            "Ética", "Moral", "Principios", "Conducta", "Valores",
            "Juego", "Deporte", "Competición", "Desafío", "Victoria",
            "Ratón", "Cola", "Queso", "Aventura", "Túnel", "Laberinto",
            "Bosque", "Árbol", "Floresta", "Flor", "Hoja",
            "Amistad", "Complicidad", "Compañía", "Confianza", "Lealtad",
            "Alegría", "Felicidad", "Sonrisa", "Diversión", "Celebración",
            "Mágia", "Hechizo", "Encantamiento", "Varita", "Conjuro",
            "Risa", "Carcajada", "Chiste", "Humor", "Divertimento",
            "Jardín", "Césped", "Flores", "Planta", "Hortaliza",
            "Tesoro", "Cofre", "Joyas", "Monedas", "Fortuna",
            "Aprendizaje", "Conocimiento", "Descubrimiento", "Educación", "Experiencia",
            "Color", "Matiz", "Tinte", "Pigmento", "Sombra",
            "Playera", "Camiseta", "Vestimenta", "Prenda", "Indumentaria",
            "Ratones", "Roedores", "Casa", "Vivienda", "Morada",
            "Montaña", "Colina", "Pico", "Elevación", "Cumbre",
            "Calcetines", "Medias", "Pantuflas", "Zapatos", "Calzado",
            "Ratona", "Roedora", "Vestido", "Atuendo", "Indumentaria",
            "Auto", "Vehículo", "Coche", "Automóvil", "Transporte",
            "Pies", "Extremidades", "Pie", "Pata", "Extremidad",
            "Hijo", "Descendiente", "Prole", "Infante", "Cachorro",
            "Negro", "Oscuro", "Sombrio", "Intenso", "Obscuro"
        };
        return sustantivos;

    }

    @Override
    public String obtenerSustantivo(String palabra) {
        String salida = "";
        String obtenerSustantivos[] = agregarSustantivo();
        for (String obtenerSustantivo : obtenerSustantivos) {
            if (palabra.equalsIgnoreCase(obtenerSustantivo)) {
                salida = palabra + " ";
            }
        }
        return salida;
    }

    @Override
    public boolean obtenerSustantivoBool(String palabra) {
        boolean salida = false;
        String obtenerSustantivos[] = agregarSustantivo();
        for (String obtenerSustantivo : obtenerSustantivos) {
            if (palabra.equalsIgnoreCase(obtenerSustantivo)) {
                salida = true;
                break;
            }
        }
        return salida;
    }

    @Override
    public String obtenerSustantivoOracion(String palabra) {
        String salida = "";
        String obtenerSustantivos[] = agregarSustantivo();
        for (String obtenerSustantivo : obtenerSustantivos) {
            if (palabra.equalsIgnoreCase(obtenerSustantivo)) {
                salida = palabra;
            }
        }
        return salida;
    }

}
