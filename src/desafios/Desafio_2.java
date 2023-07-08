package desafios;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Clase que implementa la solucion
 * al segundo desafio
 */
public class Desafio_2 {

    int[] nums_1 = {0, 1, 2, 3, 4};
    int[] index_1 = {0, 1, 2, 2, 1};
    //debe retornar {0,4,1,3,2}

    int[] nums_2 = {1, 2, 3, 4, 0};
    int[] index_2 = {0, 1, 2, 3, 0};
    //debe retornar {0,1,2,3,4}

    int[] nums_3 = {1};
    int[] index_3 = {0};
    //debe retornar {1}

    private String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int[] getNums_1() {
        return nums_1;
    }

    public int[] getIndex_1() {
        return index_1;
    }

    public int[] getNums_2() {
        return nums_2;
    }

    public int[] getIndex_2() {
        return index_2;
    }

    public int[] getNums_3() {
        return nums_3;
    }

    public int[] getIndex_3() {
        return index_3;
    }

    /**
     * Metodo Constructor
     */
    public Desafio_2(){

        info = " ";



    }

    public LinkedList<Integer> desafio_2(int [] indices, int [] numeros){

        String recogedor ="";


        /**
         * LinkedList target:
         * Corresponde al elemento de salida
         */
        LinkedList<Integer> target = new LinkedList<>();

        /**
         * Ciclo para rellenar la LinkedList target.
         * se USAN los datos del arreglo de numeros
         * El ojetivo es que target no este NULL
         * al iniciar el procedimiento.
         */
        for (int i = 0; i < numeros.length; i++) {
            target.add(i, numeros[i]);
        }

        System.out.println("El arreglo nums es : " + target);

        recogedor +="El arrego nums es " + target + " \n";

        String print_Aux=" "; // para imprimir los indices

        for (int dato : indices
             ) {print_Aux+=dato + " ";
        }

        System.out.println("El arreglo index es [" + print_Aux + "]");
        recogedor +="El arrego index es [" + print_Aux + "] \n";


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

        System.out.println("La LinkedList target NUEVA es: " + target);
        recogedor +="El resultado targed es " + target + " \n=========================";

        setInfo(recogedor);


        return target;


    }



//    public static void main(String[] args){
//
//        Desafio_2 ej = new Desafio_2();
//
//        ej.desafio_2(ej.index_1, ej.nums_1);
//        ej.desafio_2(ej.index_2, ej.nums_2);
//        ej.desafio_2(ej.index_3, ej.nums_3);
//
//
//
//    }


}
