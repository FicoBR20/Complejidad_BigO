package desafios;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Clase que maneja el entorno grafico
 * GUI y soporta los metodos disenaddos
 * para explorar el tema del Big_0.
 */
public class Desafio_1 extends JFrame {

    private Desafio_2 desafio_2;


    private JButton jB_solucion_2;

    private Font font;

    /**
     * String con la respuesta al desafio
     * de la pagina 35 de las diapositivas
     */
    private String respuesta_Nums;

    /**
     * Atributo que indicara la cantidad de iteraciones
     * sobre los n datos de entrada a fin de definir la funcion
     * caracteristica del algoritmo (Big O)
     */
    private int big_O;

    /**
     * Atributo para ser usado en los metodos que requieran
     * de un tipo de arreglo ordenado
     */
    private int[] arreglo_ordenado;
    /**
     * Escucha de tipo Acion Listener
     */
    private Escucha escucha;

    private Header headerProject;
    private JLabel jLabel;
    private JButton jButton;
    private JScrollPane jScrollPane;
    private JTextArea jTextArea;
    private JPanel jPanel;

    /**
     * Metodo que entrega el atributo
     * big_O.
     * @return
     */
    public int getBig_O() {
        return big_O;
    }

    /**
     * Metodo que actualiza el atributo
     * big_0.
     * @param big_O
     */
    public void setBig_O(int big_O) {
        this.big_O = big_O;
    }

    /**
     * Metodo que acumula 1 en el atributo
     * big_O a fin determinar el tipo de la
     * funcion caracteristica de un Algoritmo
     */
    public void acumula_Big_O() {
        big_O = big_O+1;
    }

    public String getRespuesta_Nums() {
        return respuesta_Nums;
    }

    public void setRespuesta_Nums(String respuesta_Nums) {
        this.respuesta_Nums = respuesta_Nums;
    }

    /**
     * Constructor of GUI class
     */
    public Desafio_1(){
        initGUI();

        //Default JFrame configuration
        this.setTitle("Datos Estructurados");
        this.setSize(600,300);
        //this.pack();
        this.setResizable(true);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * This method is used to set up the default JComponent Configuration,
     * create Listener and control Objects used for the GUI class
     */
    private void initGUI() {

        desafio_2= new Desafio_2();


        jB_solucion_2 = new JButton(" Ejecutar solucion 2");
        jB_solucion_2.setFont(new Font(Font.DIALOG,Font.BOLD,20));
        jB_solucion_2.setBackground(Color.BLUE);
        jB_solucion_2.setForeground(Color.WHITE);
        jB_solucion_2.addActionListener(escucha);





        font = new Font("Serif", Font.PLAIN, 20);
        respuesta_Nums = " ";
        int [] example_1 = {0,2,1,5,3,4};//entrada para caso_Nums
        int [] example_2 = {5,0,1,2,3,4};//entrada para caso_Nums
        big_O = 0;
        escucha = new Escucha();
        arreglo_ordenado = new int[5];

        String auxiliar=" ";
        //se genera un arreglo ordeneado para probar metodos que lo requieran.
        for (int i = 0; i < 5; i++) {
            arreglo_ordenado[i]=i+1;
            auxiliar=auxiliar + Integer.valueOf(i+1) + " ";
        }
       // System.out.println("el arreglo ordenado es; [" + auxiliar + "]");

        headerProject = new Header("Complejidad Big O", Color.BLUE);

        jLabel = new JLabel("Federico Barbetti Ruiz " +
                "Codigo 2181247-2724");
        jLabel.setFont(new Font(Font.DIALOG,Font.BOLD,20));
        jLabel.setBackground(Color.BLUE);



        jButton = new JButton(" Ejecutar ");
        jButton.setFont(new Font(Font.DIALOG,Font.BOLD,20));
        jButton.setBackground(Color.BLUE);
        jButton.setForeground(Color.WHITE);
        jButton.addActionListener(escucha);

        String info= "Se presentan las soluciones a los desafios\n" +
                "Nota: por favor dar clik al boton ejecutar.\n" +
                "Los resultados se presentaran en este panel y \n" +
                "en la consola\n" +
                "Gracias.";

        jTextArea = new JTextArea(info, 8,5);
        jTextArea.setSize(new Dimension(440,190));
        jTextArea.setForeground(new Color(1, 5, 14));
        jTextArea.setBounds(30,50,540,170);
        jTextArea.setFont(font);

        jScrollPane = new JScrollPane(jTextArea);
        jScrollPane.setBounds(30,50,540,170);


        jPanel = new JPanel();
        jPanel.setSize(new Dimension(500,200));
        jPanel.setBackground(Color.ORANGE);
        jPanel.setForeground(Color.BLUE);

        this.add(headerProject, BorderLayout.NORTH);
        this.add(jScrollPane, BorderLayout.CENTER);
        this.add(jPanel, BorderLayout.CENTER);
        this.add(jLabel, BorderLayout.SOUTH);
        this.add(jButton, BorderLayout.SOUTH);
//        this.add(jB_solucion_2, BorderLayout.SOUTH);



    }

    /**
     * Main process of the Java program
     * @param args Object used in order to send input data from command line when
     *             the program is execute by console.
     */
    public static void main(String[] args){
        EventQueue.invokeLater(() -> {
            Desafio_1 miProjectDesafio1 = new Desafio_1();
        });
    }

    /**
     * Metodo que imprime el primer alemento de una lista
     * @param un_arreglo
     */
    public void printFirstElement(int[] un_arreglo){
        acumula_Big_O();
        System.out.println("Metodo prinFirstelement;\n" +
                "El elemento en la primera ubicacion es:"+ arreglo_ordenado[0]+"" +
                "\nEl valor de big_O es: "+ getBig_O());
    }

    /**
     * Metodo que imprime parajas de los numeros del arraylo
     * @param arreglo_nuevo
     */
    public void printAllElements(int [] arreglo_nuevo){
        String auxiliar=" ";
        for (int i = 0; i < arreglo_ordenado.length; i++) {
            auxiliar = auxiliar + "[ " + arreglo_ordenado[i] + " ] ";
            acumula_Big_O();
        }
        System.out.println("Metodo printAllElements " + auxiliar + "\n" +
                "El valor de big_O es "+ getBig_O());
    }


    /**
     * Metodo para desarrollar el desafio propuesto por el
     * Profesor Carlos Felipe.
     * Oorresponde a la pagina 33
     * @param arreglo_en_desorden
     */
    public void caso_Nums_Spaguetti(int [] arreglo_en_desorden){

        setBig_O(0);

        String auxiliar = " ";

        if (arreglo_en_desorden[0]%2==0){

            for (int i = 0; i < arreglo_en_desorden.length; i++) {

                if (i%2==0){
                    arreglo_en_desorden[i] = arreglo_en_desorden[i]+(i/2);
                    auxiliar = auxiliar + arreglo_en_desorden[i] + " ";
                    acumula_Big_O();
                }
                else if (i%2>0) {
                    arreglo_en_desorden[i] = arreglo_en_desorden[i]-1;
                    if (arreglo_en_desorden[i]<0){
                        arreglo_en_desorden[i]=arreglo_en_desorden.length-1;
                    }
                    acumula_Big_O();
                    auxiliar = auxiliar + arreglo_en_desorden[i] + " ";
                }
            }

        }
        else if (arreglo_en_desorden[0]%2>0) {

            for (int i = 0; i < arreglo_en_desorden.length; i++) {

                arreglo_en_desorden[i] = arreglo_en_desorden[i]-1;

                if (arreglo_en_desorden[i]<0){
                    arreglo_en_desorden[i]=arreglo_en_desorden.length-1;
                    }
                acumula_Big_O();
                auxiliar = auxiliar + arreglo_en_desorden[i] + " ";
            }
        }

        // COMPROBACION DE LA SALIDA

        System.out.println("La salida final es " + auxiliar + "\n" +
                "La cantidad de iteraciones es " + getBig_O());

        setRespuesta_Nums(auxiliar);

    }

    /**
     * Metodo que manipula los componentds
     * jButton y jLabel.
     */
    public void change(){
        this.remove(jButton);
        this.add(jLabel, BorderLayout.SOUTH);
        jLabel.setVisible(true);
    }



    /**
     * inner class that extends an Adapter Class or implements Listeners used by GUI class
     */
    private class Escucha implements ActionListener {

        String infor = " ";


        int[] example_1 = {0, 2, 1, 5, 3, 4};//entrada para caso_Nums
        int[] example_2 = {5, 0, 1, 2, 3, 4};//entrada para caso_Nums


        /**
         * String informativo
         */
        String reporteConjunto = "Primer Desafio\n" +
                "int [] example_1 = {0,2,1,5,3,4}\n" +
                "int [] example_2 = {5,0,1,2,3,4}\n" +
                "Obtenemos; \n";

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource()==jButton){

//                System.out.println("======================================================");
//
//                printFirstElement(arreglo_ordenado);
//                setBig_O(0);
//
//                System.out.println("======================================================");
//
//                printAllElements(arreglo_ordenado);
//                setBig_O(0);
//
//                System.out.println("======================================================");
//
//
                caso_Nums_Spaguetti(example_1);
                reporteConjunto +="Para la primera entrada " + getRespuesta_Nums() + "\n";
                caso_Nums_Spaguetti(example_2);
                reporteConjunto += "Para la segunda entrada " + getRespuesta_Nums() + "\n=========================";


                desafio_2.desafio_2(desafio_2.getIndex_1(),desafio_2.getNums_1());
                change();

                reporteConjunto +="\nSegundo desafio\n" + desafio_2.getInfo();

                jTextArea.setText(reporteConjunto);
                jTextArea.setEditable(false);
                jButton.setVisible(false);
                jButton.setEnabled(false);

                System.out.println("jButton ejecutando..." );
            }


        }
    }
}
