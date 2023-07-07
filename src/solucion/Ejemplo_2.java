package solucion;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Clase que implementa la solucion
 * al segundo desafio
 */
public class Ejemplo_2 {

    private String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    /**
     * Metodo Constructor
     */
    public Ejemplo_2(){
        info = " ";
        System.out.println(" soy el constructor de ejemplo 2");
    }

    public String la_solucion (){

        int[] numeros_1 = {0, 1, 2, 3, 4};
        int[] index_Ej_1 = {0, 1, 2, 2, 1};
        //debe retornar {0,4,1,3,2}

        int[] numeros_2 = {1, 2, 3, 4, 0};
        int[] index_Ej_2 = {0, 1, 2, 3, 0};
        //debe retornar {0,1,2,3,4}

        int[] numeros_3 = {1};
        int[] index_Ej_3 = {0};
        //debe retornar {1}

        LinkedList<Integer> num_1 = new LinkedList<>();//
        ListIterator lmun = num_1.listIterator();

        for (int i = 0; i < numeros_1.length; i++) {
            num_1.add(i,numeros_1[i]);
        }

        setInfo(" La lista de numeros es: " + num_1);



        LinkedList<Integer> indx_1 = new LinkedList<>();
        ListIterator inx_1 = indx_1.listIterator();



        return info;


    }

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


        /**
         * LinkedList target:
         * Corresponde al elemento de salida
         */
        LinkedList<Integer> target = new LinkedList<>();
        ListIterator it_tardet = target.listIterator(0);//iterator en ubicacion 0

        /**
         * Ciclo para rellenar la LinkedList target.
         * se toman los datos del arreglo nums_1
         */
        for (int i = 0; i < nums_1.length; i++) {
            target.add(i, nums_1[i]);
        }


        System.out.println(" La LinkedList target INICIAL es: " + target);
        int chequeo_limite = 0; // se usara para hacer restriccion del limite del arreglo.
        if (nums_1.length==index_1.length){

            for (int i = 0; i < index_1.length; i++) {

                if (target.get(index_1[i])==null){
                    target.add(index_1[i],nums_1[i]);
                }else {
                    LinkedList<Integer> auxiliar = new LinkedList<Integer>();
                    auxiliar.equals(target.subList(index_1[i], index_1.length));
                    target.add(index_1[i], nums_1[i]);
                    target.addAll(index_1[i+1], auxiliar);


                }

            }
        }

        System.out.println(" La LinkedList target NUEVA es: " + target);













       //====================================================================
        String despierteFico= " Dios Bendito";
        Ejemplo_2 ej = new Ejemplo_2();
        ej.setInfo(despierteFico);
        System.out.println(" el despertar de fico es; " + ej.getInfo());
    }


}
