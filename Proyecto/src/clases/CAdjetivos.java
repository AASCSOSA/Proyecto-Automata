/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import interfaz.IAdjetivo;

/**
 *
 * @author alanh
 */
public class CAdjetivos implements IAdjetivo {

    @Override
    public String[] agregarAdjetivo() {
        String[] adjetivo = {
            "Alegre", "Triste", "Inteligente", "Creativo", "Valiente",
            "Divertido", "Serio", "Amable", "Energético", "Paciente",
            "Bello", "Feo", "Grande", "Pequeño", "Rápido",
            "Lento", "Fuerte", "Débil", "Cálido", "Frío",
            "Feliz", "Infeliz", "Sabio", "Joven", "Viejo",
            "Dulce", "Amargo", "Luminoso", "Oscuro", "Hermoso",
            "Feo", "Ruidoso", "Silencioso", "Limpio", "Sucio",
            "Alto", "Bajo", "Ancho", "Estrecho", "Rico",
            "Pobre", "Rápido", "Lento", "Duro", "Suave",
            "Nuevo", "Viejo", "Bueno", "Malo", "Amoroso",
            "Odioso", "Dulce", "Salado", "Brillante", "Opaco",
            "Agradable", "Desagradable", "Saludable", "Enfermo", "Fresco",
            "Stale", "Ligero", "Pesado", "Agradable", "Desagradable",
            "Elegante", "Sencillo", "Húmedo", "Seco", "Puro",
            "Contaminado", "Lindo", "Feo", "Inocente", "Culpable",
            "Alto", "Bajo", "Agradable", "Desagradable", "Afortunado",
            "Desafortunado", "Gracioso", "Serio", "Famoso", "Desconocido",
            "Duro", "Suave", "Tranquilo", "Ruidoso", "Difícil",
            "Fácil", "Antiguo", "Moderno", "Caro", "Barato",
            "Largo", "Corto", "Agradable", "Desagradable", "Gigante",
            "Minúsculo", "Completo", "Incompleto", "Dulce", "Amargo", "Pequeño",
            "Curios", "Inquieto", "Valiente", "Juguetón", "Travieso", "Listo", "Audaz",
            "Amigable", "Peludo", "Explorador", "Astuto", "Alegre", "Hambriento", "Ingenioso",
            "Asustado", "Sorprendido", "Encantado", "Animado", "Dormilon", "Azul", "Amarilla", "amarillo", "rojo",
            "azul", "naranja", "rojos", "morada", "cansado", "motivado", "morado", "violeta", "púrpura", "Enorme", "Vanidoso", "Hermoso",
            "colorado", "buenos", "nuevos", "bonitos",
            "Alegres", "Tristes", "Inteligentes", "Creativos", "Valientes", "Divertidos", "Serios", "Amables", "Energéticos", "Pacientes",
            "Bellos", "Feos", "Grandes", "Pequeños", "Rápidos", "Lentos", "Fuertes", "Débiles", "Cálidos", "Fríos", "Felices", "Infelices",
            "Sabios", "Jóvenes", "Viejos", "Dulces", "Amargos", "Luminosos", "Oscuros", "Hermosos", "Feos", "Ruidosos", "Silenciosos", "Limpios",
            "Sucios", "Altos", "Bajos", "Anchos", "Estrechos", "Ricos", "Pobres", "Rápidos", "Lentos", "Duros", "Suaves", "Nuevos", "Viejos", "Buenos",
            "Malos", "Amorosos", "Odiosos", "Dulces", "Salados", "Brillantes", "Opacos", "Agradables", "Desagradables", "Saludables", "Enfermos", "Frescos",
            "Stale", "Ligeros", "Pesados", "Agradables", "Desagradables", "Elegantes", "Sencillos", "Húmedos", "Secos", "Puros", "Contaminados", "Lindos", "Feos",
            "Inocentes", "Culpables", "Altos", "Bajos", "Agradables", "Desagradables", "Afortunados", "Desafortunados", "Graciosos", "Serios", "Famosos",
            "Desconocidos", "Duros", "Suaves", "Tranquilos", "Ruidosos", "Difíciles", "Fáciles", "Antiguos", "Modernos", "Caros", "Baratos", "Largos", "Cortos",
            "Agradables", "Desagradables", "Gigantes", "Minúsculos", "Completos", "Incompletos", "Dulces", "Amargos", "Pequeños", "Curiosos", "Inquietos",
            "Valientes", "Juguetones", "Traviesos", "Listos", "Audaces", "Amigables", "Peludos", "Exploradores", "Astutos", "Alegres", "Hambrientos",
            "Ingeniosos", "Asustados", "Sorprendidos", "Encantados", "Animados", "Dormilones", "Azules", "Amarillas", "Amarillos", "Rojos", "Azules",
            "Naranjas", "Rojos", "Morados", "Cansados", "Motivados", "Morados", "Violetas", "Púrpuras", "Enormes", "Vanidosos", "Hermosos",
            "Colorados", "Buenos", "Nuevos", "Bonitos"

        };
        return adjetivo;
    }

    @Override
    public String obtenerAdjetivo(String palabra) {
        String salida = "";
        String[] obtenerAdjetivos = agregarAdjetivo();
        for (String obtenerAdjetivo : obtenerAdjetivos) {
            if (palabra.equalsIgnoreCase(obtenerAdjetivo)) {
                salida = obtenerAdjetivo + " ";
            }
        }
        return salida;

    }

    @Override
    public boolean obtenerAdjetivoBool(String palabra) {
        boolean salida = false;
        String[] obtenerAdjetivos = agregarAdjetivo();
        for (String obtenerAdjetivo : obtenerAdjetivos) {
            if (palabra.equalsIgnoreCase(obtenerAdjetivo)) {
                salida = true;
                break;
            }
        }
        return salida;
    }

}
