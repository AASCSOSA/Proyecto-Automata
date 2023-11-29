/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import interfaz.IVerbo;

/**
 *
 * @author alanh
 */
public class CVerbo implements IVerbo {

    @Override
    public String[] agregarVerbo() {
        String[] verbos = {
            "Correr", "Saltar", "Nadar", "Volar", "Caminar",
            "Bailar", "Cantar", "Pintar", "Escribir", "Leer",
            "Estudiar", "Aprender", "Enseñar", "Construir", "Destruir",
            "Crear", "Imaginar", "Soñar", "Resolver", "Pensar",
            "Hablar", "Escuchar", "Observar", "Experimentar", "Descubrir",
            "Viajar", "Conducir", "Navegar", "Explorar", "Probar",
            "Comer", "Beber", "Dormir", "Despertar", "Trabajar",
            "Descansar", "Jugar", "Competir", "Colaborar", "Ayudar",
            "Amar", "Odiar", "Sentir", "Emocionar", "Cuidar",
            "Atrapar", "Liberar", "Gritar", "Silbar", "Reír",
            "Llorar", "Sonreír", "Ganar", "Perder", "Conquistar",
            "Perdonar", "Olvidar", "Recordar", "Celebrar", "Lamentar",
            "Convencer", "Debatir", "Discutir", "Decidir", "Dudar",
            "Aferrar", "Abandonar", "Conectar", "Desconectar", "Explotar",
            "Desarrollar", "Estimar", "Valorar", "Preferir", "Sugerir",
            "Aceptar", "Rechazar", "Negociar", "Compartir", "Construir",
            "Destruir", "Integrar", "Separar", "Mezclar", "Comprender",
            "Aceptar", "Rechazar", "Negociar", "Compartir", "Construir",
            "Destruir", "Integrar", "Separar", "Mezclar", "Comprender",};
        return verbos;
    }

    @Override
    public String obtenerVerbo(String palabra) {
        String[] obtenerVerbos = agregarVerbo();
        for (String obtenerVerbo : obtenerVerbos) {
            if (palabra.equals(obtenerVerbo)) {
                return palabra;
            }
        }
        return "";
    }

}
