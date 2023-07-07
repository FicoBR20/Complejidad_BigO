package desafios;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Clase que implementa la solucion
 * al segundo desafio
 */
public class Desafio_2 {

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
    public Desafio_2(){
        info = " ";
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
         * se USAN los datos del arreglo nums_1
         * El ojetivo es que target no este NULL
         * al iniciar el procedimiento.
         */
        for (int i = 0; i < nums_1.length; i++) {
            target.add(i, nums_1[i]);
        }

        System.out.println(" La LinkedList target INICIAL es IDENTICA a nums_1: " + target);

        int chequeo_limite = 0; // se usara para hacer restriccion del limite del arreglo.

        if (nums_1.length==index_1.length){

            for (int i = 0; i < index_1.length; i++) {

                if (target.get(index_1[i])==null){
                    target.add(index_1[i],nums_1[i]);
                    chequeo_limite++;
                }else {
                    LinkedList<Integer> auxiliar = new LinkedList<Integer>();
                    auxiliar.equals(target.subList(index_1[i], index_1.length));
                    target.add(index_1[i], nums_1[i]);
                    target.removeLast();
                    chequeo_limite++;
                    System.out.println("auxiliar" + auxiliar + "target es " + target + " limite es " +
                            chequeo_limite);
                    if (chequeo_limite<index_1.length){
                        target.addAll(index_1[i+1], auxiliar);
                    }

                }

            }
        }

        System.out.println(" La LinkedList target NUEVA es: " + target);


        Desafio_2 ej = new Desafio_2();
    }


}
