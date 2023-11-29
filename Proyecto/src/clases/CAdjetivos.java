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
public class CAdjetivos implements IAdjetivo{

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
            "Minúsculo", "Completo", "Incompleto", "Dulce", "Amargo",
        };
        return adjetivo;
    }

    @Override
    public String obtenerAdjetivo(String palabra) {
        String[] obtenerAdjetivos=agregarAdjetivo();
        for (String obtenerAdjetivo : obtenerAdjetivos) {
            if(palabra.equals(obtenerAdjetivo)){
                return palabra; 
            }
        }
        return "";
        
    }

}
