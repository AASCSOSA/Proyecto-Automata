/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import interfaz.IMetodosGenerales;
import java.util.ArrayList;

/**
 *
 * @author alanh
 */
public class CMetodosGenerales implements IMetodosGenerales {

    CSustantivo Csus = new CSustantivo();
    CAdjetivos CAdj = new CAdjetivos();
    CAdverbio CAdv = new CAdverbio();
    CVerbo Cverb = new CVerbo();
    CPronombre Cpro = new CPronombre();
    CArticulos CArti = new CArticulos();
    CConjunciones CCon = new CConjunciones();

    @Override
    public ArrayList<String> separarXPalabra(String palabra) {
        ArrayList<String> palabrasSeparadasList = new ArrayList<>();
        String[] palabrasSeparadasArray;
        String delimitadores = "(?<=\\s)|(?=\\s)|(?<=[-+*/(),;=])|(?=[-+*/(),;=])";
        palabrasSeparadasArray = palabra.split(delimitadores);
        for (String palabraSeparada : palabrasSeparadasArray) {
            if (!palabraSeparada.isEmpty() && !palabraSeparada.trim().isEmpty()) {
                palabrasSeparadasList.add(palabraSeparada);
            }
        }
        return palabrasSeparadasList;
    }

    @Override
    public String[] separarXOracion(String palabra) {
        String[] palabrasSeparadasArray;
        String delimitadores = "[.,\\-;:]+";
        palabrasSeparadasArray = palabra.split(delimitadores);
        return palabrasSeparadasArray;
    }

    @Override
    public ArrayList<String> obtenerElementoLexico(ArrayList<String> palabra) {
        ArrayList<String> salida = new ArrayList<>();
        String salidaSustantivo = "", salidaAdjetivo = "", salidaAdverbio = "", salidaVerbo = "", salidaPronombre = "", salidaArticulo = "", salidaConjuncion = "";
        ArrayList<String> palabrasSeparadasList = new ArrayList<>();
        palabrasSeparadasList = palabra;
        for (String elementoLexico : palabrasSeparadasList) {
            salidaSustantivo += Csus.obtenerSustantivo(elementoLexico);
            salidaAdjetivo += CAdj.obtenerAdjetivo(elementoLexico);
            salidaAdverbio += CAdv.obtenerAdverbio(elementoLexico);
            salidaVerbo += Cverb.obtenerVerbo(elementoLexico);
            salidaPronombre += Cpro.obtenerPronombre(elementoLexico);
            salidaArticulo += CArti.obtenerArticulo(elementoLexico);
            salidaConjuncion += CCon.obtenerConjucion(elementoLexico);
        }
        salida.add("Sustantivo: " + salidaSustantivo);
        salida.add("Adjetivo: " + salidaAdjetivo);
        salida.add("Adverbio: " + salidaAdverbio);
        salida.add("Verbo: " + salidaVerbo);
        salida.add("Pronombre: " + salidaPronombre);
        salida.add("Artículo: " + salidaArticulo);
        salida.add("Conjunción: " + salidaConjuncion);
        return salida;
    }

    @Override
    public String obtenerElementoLexicoBoolean(String palabra) {
        String salida = "";
        ArrayList<String> palabrasSeparadasList = new ArrayList<>();
        ArrayList<String> lexico = separarXPalabra(palabra);
        for (String palabraXPalabra : lexico) {
            if (Csus.obtenerSustantivoBool(palabraXPalabra)) {
                palabrasSeparadasList.add("Sustantivo");
            } else if (CAdj.obtenerAdjetivoBool(palabraXPalabra)) {
                palabrasSeparadasList.add("Adjetivo");
            } else if (CAdv.obtenerAdverbioBool(palabraXPalabra)) {
                palabrasSeparadasList.add("Adverbio");
            } else if (Cverb.obtenerVerboBool(palabraXPalabra)) {
                palabrasSeparadasList.add("Verbo");
            } else if (Cpro.obtenerPronombreBool(palabraXPalabra)) {
                palabrasSeparadasList.add("Pronombre");
            } else if (CArti.obtenerArticuloBool(palabraXPalabra)) {
                palabrasSeparadasList.add("Artículo");
            } else if (CCon.obtenerConjucionBool(palabraXPalabra)) {
                palabrasSeparadasList.add("Conjunción");
            }
        }
        for (String palabraSeparada : palabrasSeparadasList) {
            if(!palabraSeparada.isEmpty()){
                salida += palabraSeparada + " + ";
            }
        }
        if(!salida.isEmpty()){
        salida = salida.substring(0, salida.length() - 3);
        }
        return salida;
    }

}
