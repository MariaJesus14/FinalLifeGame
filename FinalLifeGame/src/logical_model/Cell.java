
package logical_model;

import graphic_interface.Window_cell;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * @author Jerry Rivera
 * @author Roibin Elizondo
 * @author Maria Rodriguez
 */
public class Cell {

    
    public static int countGene;
    GestorEs gestor = new GestorEs();
    Matrix matrixGame = new Matrix();
    Matrix matrixClon = new Matrix();

    private static String alive = "■";
    private static String dead = "□";

 /*
 * alive es el metodo encargado de generar celuals vivas
 * @return retorna la celula viva
 * @param no recibe parametros
 */
    public static String alive() {

        return alive;
    }
/*
 * dead es el metodo encargado de generar celuals muerta
 * @return retorna la celula muerta
 * @param no recibe parametros
 */
    public static String dead() {
        return dead;
    }
 /*
 * rule1 es el metodo encargado de generar ejecutar la regla numero uno del juego 
 *Una célula muerta con exactamente 3 células vecinas vivas "nace" (es decir, al turno siguiente
 *estará viva).
 * @return es void, por lo tanto no retorna nada
 * @param no recibe parametros
 */

    public static void rule1() {
        int alive;
        int vecinoInicialFila;
        int vecinoInicialColumna;
       
        for (int rows = 0; rows < Matrix.matrixLenght(); rows++) {
            for (int columns = 0; columns < Matrix.matrixLenght(); columns++) {
                if (Matrix.getMatrixPosition(rows, columns).equals(Cell.dead())) {
                    alive = 0;
                    Matrix.neighborHood(rows, columns);
                    Matrix.distanciaVecinos();
                    for (vecinoInicialFila = Matrix.getArrayDatosPosition(0); vecinoInicialFila < Matrix.getArrayDatosPosition(5); vecinoInicialFila++) {
                        for (vecinoInicialColumna = Matrix.getArrayDatosPosition(1); vecinoInicialColumna < Matrix.getArrayDatosPosition(6); vecinoInicialColumna++) {
                            if (Matrix.getMatrixPosition(vecinoInicialFila, vecinoInicialColumna).equals(Cell.alive())) {
                                alive = alive + 1;
                            } else {
                            }
                        }

                    }
                    if (alive == 3) {
                        Matrix.setStatus(rows, columns, Cell.alive);
                    }
                } else {

                }
            }

        }
        
        //GestorEs.mostrarMensaje("\nCount\n"+Matrix.printMatrix());

        }
/*
 * rule2 es el metodo encargado de ejecutar la regla numero dos del juego 
 *Una célula viva con 2 o 3 células vecinas vivas sigue viva, en otro caso muere (por "soledad" o
 *"superpoblación").  
 * @return es void, por lo tanto no retorna nada
 * @param no recibe parametros
 */
    public static void rule2() {
        int alive;
        int vecinoInicialFila;
        int vecinoInicialColumna;

        for (int rows = 0; rows < Matrix.matrixLenght(); rows++) {
            for (int columns = 0; columns < Matrix.matrixLenght(); columns++) {
                if (Matrix.getMatrixPosition(rows, columns).equals(Cell.alive())) {
                    alive = -1;
                    Matrix.neighborHood(rows, columns);
                    Matrix.distanciaVecinos();
                    for (vecinoInicialFila = Matrix.getArrayDatosPosition(0); vecinoInicialFila < Matrix.getArrayDatosPosition(5); vecinoInicialFila++) {
                        for (vecinoInicialColumna = Matrix.getArrayDatosPosition(1); vecinoInicialColumna < Matrix.getArrayDatosPosition(6); vecinoInicialColumna++) {
                            if (Matrix.getMatrixPosition(vecinoInicialFila, vecinoInicialColumna).equals(Cell.alive())) {
                                alive = alive + 1;

                            } else {

                            }
                        }
                    }
                    if (alive == 3 || alive == 2) {
                    } else {
                        Matrix.setStatus(rows, columns, Cell.dead);
                    }
                } else {

                }
            }
        }

    }
    
//    public void printGenerations (int generations){
//        switch(generations){
//            case 0:
//                gestor.mostrarMensaje(dead);
//                break;
//            case 1:
//                break;
//            default:
//                break;
//        }
//    }
//    
//    public String[] totalGenerations(int generations){
//        String[] buttons3 = new String[generations];
//        String number = "";
//        for (int i = 0; i < 10; i++) {
//            number = number +i;
//            buttons3[i] = number;
//        }
//        return buttons3;
//    }
//    
//    public void Generations() {
//
//        //String[] buttons3 = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19"};
//        String[] buttons4 = totalGenerations(Window_cell.getGenerations());
//        Icon iconGene = new ImageIcon(getClass().getResource("/graphic_interface/generacion.jpg"));
//        boolean continue1 = true;
//        while (continue1) {
//            String option2 = (String) JOptionPane.showInputDialog(null, "Seleccione la generacion que desea observar", "Generacion", JOptionPane.INFORMATION_MESSAGE, iconGene, buttons4, buttons4[0]);
//            switch (option2) {
//                case "0":
//                    JOptionPane.showMessageDialog(null, generations[countGene] );
//                    break;
//                case "1":
//                     JOptionPane.showMessageDialog(null, generations[countGene] );
//                    break;
//                case "2":
//                    JOptionPane.showMessageDialog(null, generations[countGene] );
//                    break;
//                case "3":
//                    JOptionPane.showMessageDialog(null, generations[countGene] );
//                    break;
//                case "4":
//                    JOptionPane.showMessageDialog(null, generations[countGene] );
//                    break;
//                case "5":
//                    JOptionPane.showMessageDialog(null, generations[countGene] );
//                    break;
//                case "6":
//                    JOptionPane.showMessageDialog(null, generations[countGene] );
//                    break;
//                case "7":
//                    JOptionPane.showMessageDialog(null, generations[countGene] );
//                    break;
//                case "8":
//                    JOptionPane.showMessageDialog(null, generations[countGene] );
//                    break;
//                case "9":
//                    JOptionPane.showMessageDialog(null, generations[countGene] );
//                    break;
//                case "10":
//                    JOptionPane.showMessageDialog(null, generations[countGene] );
//                    break;
//                case "11":
//                    JOptionPane.showMessageDialog(null, generations[countGene] );
//                    break;
//                case "12":
//                    JOptionPane.showMessageDialog(null, generations[countGene] );
//                    break;
//                case "13":
//                    JOptionPane.showMessageDialog(null, generations[countGene] );
//                    break;
//                case "14":
//                    JOptionPane.showMessageDialog(null, generations[countGene] );
//                    break;
//                case "15":
//                    JOptionPane.showMessageDialog(null, generations[countGene] );
//                    break;
//                case "16":
//                    JOptionPane.showMessageDialog(null, generations[countGene] );
//                    break;
//                case "17":
//                    JOptionPane.showMessageDialog(null, generations[countGene] );
//                    break;
//                case "18":
//                    JOptionPane.showMessageDialog(null, generations[countGene] );
//                    break;
//                case "29":
//                    JOptionPane.showMessageDialog(null, generations[countGene] );
//                    break;
//            }
//        }
//    }

}
