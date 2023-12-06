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
            "Corre", "Salta", "Nada", "Vola", "Camina",
            "Baila", "Canta", "Pinta", "Escribe", "Lee",
            "Estudia", "Aprende", "Enseña", "Construye", "Destruye",
            "Crea", "Imagina", "Sueña", "Resuelve", "Piensa",
            "Habla", "Escucha", "Observa", "Experimenta", "Descubre",
            "Viaja", "Conduce", "Navega", "Explora", "Prueba",
            "Come", "Bebe", "Duerme", "Despierta", "Trabajaa",
            "Descansa", "Juega", "Compite", "Colabora", "Ayuda",
            "Ama", "Odia", "Siente", "Emociona", "Cuida",
            "Atrapa", "Libera", "Grita", "Silba", "Rie",
            "Llora", "Sonrie", "Gana", "Pierde", "Conquista",
            "Perdona", "Olvida", "Recuerda", "Celebra", "Lamenta",
            "Convence", "Debate", "Discute", "Decide", "Duda",
            "Aferra", "Abandona", "Conecta", "Desconecta", "Explota",
            "Desarrolla", "Estima", "Valora", "Prefiere", "Sugiere",
            "Acepta", "Rechaza", "Negocia", "Comparte", "Integra",
            "Separa", "Mezclar", "Comprender", "Comparte", "Integra",
            "Separa", "Mezcla", "Comprende"};
        return verbos;
    }

    @Override
    public String obtenerVerbo(String palabra) {
        String salida = "";
        String[] obtenerVerbos = agregarVerbo();
        for (String obtenerVerbo : obtenerVerbos) {
            if (palabra.equalsIgnoreCase(obtenerVerbo)) {
                salida = palabra + " ";
            }
        }
        return salida;
    }

    @Override
    public boolean obtenerVerboBool(String palabra) {
        boolean salida = false;
        String[] obtenerVerbos = agregarVerbo();
        for (String obtenerVerbo : obtenerVerbos) {
            if (palabra.equalsIgnoreCase(obtenerVerbo)) {
                salida = true;
                break;
            }
        }
        return salida;
    }

    @Override
    public String obtenerVerboOracion(String palabra) {
        String salida = "";
        String[] obtenerVerbos = agregarVerbo();
        for (String obtenerVerbo : obtenerVerbos) {
            if (palabra.equalsIgnoreCase(obtenerVerbo)) {
                salida = palabra;
            }
        }
        return salida;
    }

}
