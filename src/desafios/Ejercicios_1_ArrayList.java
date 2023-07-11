package desafios;

import javax.swing.*;
import java.util.Arrays;


/**
 * Clase que implementa la solucion al problema
 * propuesto en la pagina 35.
 * Profesor: Carlos Felipe Montoyoa Rincon
 * Universidad del Valle
 * Alumno: Federico Barbetti Ruiz
 * Codigo: 2181247-2724
 * Julio 11 de 2023
 *
 */
public class Ejercicios_1_ArrayList extends JFrame {




    /**
     * Metodo que recibe un arreglo de enteros
     * desordeenado o no, lo procesa y entrega
     * @param arreglo_en_desorden
     */
    public int[] solucion_Array(int [] arreglo_en_desorden){

        /**
         * Arreglo que recepciona los datos del proceso y
         * presenta la solucion.
          */
        int [] respuesta = new int[arreglo_en_desorden.length];


        /**
         * String que recoge los datos en cada paso dl proceso
         * Se usa al final para la impresion del resultado
         * del metodo.
         */
        String recolector = " ";

        if (arreglo_en_desorden[0]%2==0){

            for (int i = 0; i < arreglo_en_desorden.length; i++) {

                if (i%2==0){
                    arreglo_en_desorden[i] = arreglo_en_desorden[i]+(i/2);
                    respuesta[i] = arreglo_en_desorden[i] ;
                    recolector = recolector + arreglo_en_desorden[i] + " ";//para impresion
                }
                else if (i%2>0) {
                    arreglo_en_desorden[i] = arreglo_en_desorden[i]-1;
                    if (arreglo_en_desorden[i]<0){
                        arreglo_en_desorden[i]=arreglo_en_desorden.length-1;
                    }
                    respuesta[i] = arreglo_en_desorden[i] ;
                    recolector = recolector + arreglo_en_desorden[i] + " ";//para impresion
                }
            }

        }
        else if (arreglo_en_desorden[0]%2>0) {

            for (int i = 0; i < arreglo_en_desorden.length; i++) {

                arreglo_en_desorden[i] = arreglo_en_desorden[i]-1;

                if (arreglo_en_desorden[i]<0){
                    arreglo_en_desorden[i]=arreglo_en_desorden.length-1;
                }
                respuesta[i] = arreglo_en_desorden[i] ;
                recolector = recolector + arreglo_en_desorden[i] + " ";//para impresion
            }
        }

        // COMPROBACION DE LA SALIDA

        for (int seleccionado :respuesta // impresion del array foreach
                ) {
            System.out.println("La solucion es [" + seleccionado +"]");
        }

        Arrays.stream(respuesta).forEach(System.out::println);//impresion del array stream

        System.out.println("La salida final es " + recolector + "\n" );//impresion del string.

        return respuesta;

    }


    /**
     * Main process of the Java program
     * @param args Object used in order to send input data from command line when
     *             the program is execute by console.
     */
    public static void main(String[] args){

        int[] example_1 = {0, 2, 1, 5, 3, 4};//entrada para caso_Nums
        int[] example_2 = {5, 0, 1, 2, 3, 4};//entrada para caso_Nums

        Ejercicios_1_ArrayList ej = new Ejercicios_1_ArrayList();

        ej.solucion_Array(example_1); // salida esperada [ 0,1,2,4,5,3 ]

        ej.solucion_Array(example_2); // salida esperada [ 4,5,0,1,2,3 ]




    }
}
