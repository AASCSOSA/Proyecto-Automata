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

    /*Este método obtiene un texto el cual lo separa por palabra, usando expresiones regualares*/
    @Override
    public ArrayList<String> separarXPalabra(String palabra) {
        ArrayList<String> palabrasSeparadasList = new ArrayList<>();
        String[] palabrasSeparadasArray;
        String delimitadores = "(?<=\\s)|(?=\\s)|(?<=[-+*/(),;=])|(?=[-+*/(),;=])||(?<=\\?¿)|(?=\\?¿)";
        palabrasSeparadasArray = palabra.split(delimitadores);
        /*Se recorre el array para eliminar los espacios vacíos o en blanco, asi como lo es la tabulaciones, saltos de líneas*/
        for (String palabraSeparada : palabrasSeparadasArray) {
            if (!palabraSeparada.isEmpty() && !palabraSeparada.trim().isEmpty()) {
                palabrasSeparadasList.add(palabraSeparada);
            }
        }
        return palabrasSeparadasList;
    }

    /*Este método separa un texto por oraciones, la manera en la cual realiza la separación es por puntos,punto coma, dos puntos, 
    comas y guiones*/
    @Override
    public String[] separarXOracion(String palabra) {
        String[] palabrasSeparadasArray;
        String delimitadores = "[.,\\-;:]+";
        palabrasSeparadasArray = palabra.split(delimitadores);
        return palabrasSeparadasArray;
    }

    /*Se obtiene que tipo de elemento es la palabra que se está analizando, esto es reservado en un arryList*/
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

    /*Separa un texto por palabras las cuales las va concatenando, este método es en especifico para la actividad número 3,
    ya que concatena con un "+"*/
    @Override
    public String obtenerElementoLexicoBoolean(String palabra) {
        String salida = "",salir="";
        ArrayList<String> palabrasSeparadasList = new ArrayList<>();
        ArrayList<String> lexico = separarXPalabra(palabra);
        /*Se recorre el arrayList de para realizar la comparación, regresará el nombre del elemento léxico*/
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
            }else if(palabraXPalabra.equalsIgnoreCase("?")|| palabraXPalabra.equalsIgnoreCase("¿")){
                palabrasSeparadasList.add("Delimitador");
            }           
            try{
                if(Integer.valueOf(palabraXPalabra)instanceof Integer){
                    palabrasSeparadasList.add("Digito");}
            }
            catch(Exception e){               
            }
                
        }
        for (String palabraSeparada : palabrasSeparadasList) {
            if (!palabraSeparada.isEmpty()) {
                salida += palabraSeparada + " + ";
            }
        }
        /*Al final de las oraciones se termina con oracion+,el signo +, debe de ser eliminado*/
 /*Se toma el valor de la cadena y se eliminan 3 posiciones*/
 /*Las posiciones son espacio signo espacio ( + ), por tal motivo se eliminan tres posiciones*/
        if (!salida.isEmpty()) {
            salida = salida.substring(0, salida.length() - 3);
        }
        return salida;
    }

    @Override
    public ArrayList<String> oracionesSimples(String palabra) {
        int contadorSujeto = 0,contadorPredicado=0;
        ArrayList<String> separarXOracion = new ArrayList();
        ArrayList<String> separarPorPalabras = new ArrayList();
        ArrayList<String> salida = new ArrayList();
        String[] separadorPalabras = separarXOracion(palabra);

        for (String separadorPalabra : separadorPalabras) {
            separarPorPalabras = separarXPalabra(separadorPalabra);
            for (String separarPorPalabra : separarPorPalabras) {
                if (separarPorPalabra.equalsIgnoreCase(Csus.obtenerSustantivoOracion(separarPorPalabra))) {
                    contadorSujeto++;
                }
                if (separarPorPalabra.equalsIgnoreCase(Cverb.obtenerVerboOracion(separarPorPalabra))) {
                    contadorPredicado++;
                }
            }
            if (contadorSujeto > 1 && contadorPredicado>1) {
                break;
            } else if(contadorSujeto==1 && contadorPredicado==1) {
                salida.add(separadorPalabra);
                contadorSujeto =0;
                contadorPredicado =0;
            }
        }
        return salida;

    }

}
