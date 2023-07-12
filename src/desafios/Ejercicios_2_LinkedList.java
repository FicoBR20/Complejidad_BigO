package desafios;

import javax.swing.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;


/**
 * Clase que implementa la solucion al problema
 * propuesto en la pagina 37.
 * Profesor: Carlos Felipe Montoyoa Rincon
 * Universidad del Valle
 * Alumno: Federico Barbetti Ruiz
 * Codigo: 2181247-2724
 * Julio 11 de 2023
 *
 */
public class Ejercicios_2_LinkedList extends JFrame {


    public LinkedList<Integer> solucion_LinkedList(int [] indices, int [] numeros){

        /**
         * String que recoge datos y se
         * usa solo para la impresion final
         */
        String recogedorrecogedor ="";


        /**
         * LinkedList target, inicialmente esta vacia
         * Corresponde al elemento de salida
         * que contiene la solucion
         */
        LinkedList<Integer> target = new LinkedList<>();

        /**
         * Ciclo para rellenar la LinkedList target.
         * se adiciona el arreglo de numeros a target
         * El ojetivo es que target no este NULL
         * al iniciar el procedimiento.
         */
        for (int i = 0; i < numeros.length; i++) {
            target.add(i,numeros[i]);
        }

        System.out.println("El arreglo nums es : " + target);


        String print_Aux=" "; // para imprimir los indices

        for (int dato : indices
        ) {print_Aux+=dato + " ";
        }

        System.out.println("El arreglo index es [" + print_Aux + "]");


        int chequeo_limite = 0; // se usara para hacer restriccion del limite del arreglo.

        if (numeros.length==indices.length){

            for (int i = 0; i < indices.length; i++) {

                if (target.get(indices[i])==null){
                    target.add(indices[i],numeros[i]);
                    chequeo_limite++;
                }else {
                    LinkedList<Integer> auxiliar = new LinkedList<Integer>();
                    auxiliar.equals(target.subList(indices[i], indices.length));
                    target.add(indices[i], numeros[i]);
                    target.removeLast();
                    chequeo_limite++;
                    System.out.println("Target es; " + target);
                    if (chequeo_limite<indices.length){
                       target.addAll(indices[i+1], auxiliar);
                    }


                }

            }
        }


        // COMPROBACION DE LA SALIDA

        int pos=0;// para imprimir la posicion.

        for (int seleccionado :target // impresion del array foreach
        ) {
            System.out.println("Target [" + pos + "] es " + seleccionado);
            pos++;
        }

        System.out.println("La LinkedList target NUEVA es: " + target + "\n");





        return target;


    }






    /**
     * Main process of the Java program
     * @param args Object used in order to send input data from command line when
     *             the program is execute by console.
     */
    public static void main(String[] args){

        int[] nums_1 = {0, 1, 2, 3, 4};
        int[] index_1 = {0, 1, 2, 2, 1};
        //debe retornar {0,4,1,3,2}

        int[] nums_2 = {1, 2, 3, 4, 0};
        int[] index_2 = {0, 1, 2, 3, 0};
        //debe retornar {0,1,2,3,4}

        int[] nums_3 = {1};
        int[] index_3 = {0};
        //debe retornar {1}

        Ejercicios_2_LinkedList ej2 = new Ejercicios_2_LinkedList();

        ej2.solucion_LinkedList(index_1, nums_1); //debe retornar {0,4,1,3,2}
        ej2.solucion_LinkedList(index_2, nums_2); //debe retornar {0,1,2,3,4}
        ej2.solucion_LinkedList(index_3, nums_3); //debe retornar {1}





    }
}
