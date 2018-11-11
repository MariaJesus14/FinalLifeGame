package graphic_interface;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import logical_model.Cell;
import data_structures.Generations;
import data_structures.Matrix;
import data_structures.GestorEs;

/**
 * @author Jerry Rivera
 * @author Roibin Elizondo
 * @author Maria Rodriguez
 */
public class Window_cell {

    private static int generationsCount = 0;
    Cell cell1= new Cell();
    GestorEs gestor = new GestorEs();
/*
 * getGenerations es el metodo encargado de obtener la genreacion
 * @return retorna el contador de generaciones
 * @param no recibe parametros
 */

    public static int getGenerations() {
        return generationsCount;
    }
public void showGame (){
        nextGen();
        boolean exit = false;

        int generations = generationsCount; 
        String pastGeneration = "\nGeneracion anterior\n"+Generations.getGeneration(generations-2);  
        String actualGeneration = "\nGeneracion actual\n"+Generations.getGeneration(generations-1);
        String futureGeneration = "\nGeneracion siguiente\n"+Generations.getGeneration(generations);
        String generation0 = "\nGeneracion 0\n"+Generations.getGeneration(0);
        String generation1 = "\nGeneracion siguiente\n"+Generations.getGeneration(1);
  
        String buttons5[] = {"Retroceder", "Siguiente","Finalizar"};

        Icon iconGne = new ImageIcon(getClass().getResource("/graphic_interface/images.jpg"));
         int option5 = (int) JOptionPane.showOptionDialog(null, generation0+"            "+generation1, "Continuar", JOptionPane.INFORMATION_MESSAGE, JOptionPane.YES_NO_CANCEL_OPTION, iconGne, buttons5, buttons5[0]);
         do{
             switch (option5) {
                 
         case 0:
             if(generations == 2){
                 GestorEs.mostrarMensaje("No hay una generacion anterior a la generacion 0");
                 option5 = (int) JOptionPane.showOptionDialog(null, actualGeneration+"      "+futureGeneration, "Continuar", JOptionPane.INFORMATION_MESSAGE, JOptionPane.YES_NO_CANCEL_OPTION, iconGne, buttons5, buttons5[0]);
             }else{
                 option5 = (int) JOptionPane.showOptionDialog(null, pastGeneration+"       "+actualGeneration+"      "+futureGeneration, "Continuar", JOptionPane.INFORMATION_MESSAGE, JOptionPane.YES_NO_CANCEL_OPTION, iconGne, buttons5, buttons5[0]);
             }
                 
             break;
         case 1:
             nextGen();
             option5 = (int) JOptionPane.showOptionDialog(null, pastGeneration+"       "+actualGeneration+"      "+futureGeneration, "Continuar", JOptionPane.INFORMATION_MESSAGE, JOptionPane.YES_NO_CANCEL_OPTION, iconGne, buttons5, buttons5[0]);
             nextGen();
             break;
         case 2:
             
             break;
            }
         }while(exit == false);
    }

    public void lasttGen(){
     
        generationsCount -=1;
    
        
    }
    
    public void nextGen(){
        int genCount;
        Cell.rule1();
        Cell.rule2();
        Matrix.matrixClone();
        generationsCount +=1;
        Generations.addGenerations(generationsCount, Matrix.printMatrix());
        Cell.rule1();
        Cell.rule2();
        Matrix.matrixClone();
        generationsCount +=1;
        Generations.addGenerations(generationsCount, Matrix.printMatrix());
        
    }
/*
 * cell es el metodo encargado de generara las celulas aleatoria o manualmente, segun el usuario prefiera
 * @return Es void, por lo tanto no retorna
 * @param no recibe parametros
 */

    public void cell() {

        boolean back = true;
        String buttons2[] = {"Agregar", "Jugar"};
        String buttons[] = {"Aleatoreamente", "Manualmente"};
        Object buttons3[] = {0 ,1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9 ,10 ,11 ,12 ,13 ,14 ,15 ,16 ,17 ,18 ,19 };
        Icon iconCell = new ImageIcon(getClass().getResource("/graphic_interface/iconCell.jpg"));
        Icon iconContinue = new ImageIcon(getClass().getResource("/graphic_interface/images.jpg"));
        String option = (String) JOptionPane.showInputDialog(null, "Seleccione la forma mediante la cual desea generar las celulas ", "Seleccion de celulas", JOptionPane.INFORMATION_MESSAGE, iconCell, buttons, buttons[0]);
        
        while (back == true) {
            switch (option) {
                case "Aleatoreamente":
                    int option6 = (int) JOptionPane.showOptionDialog(null, "Seleccione Agregar para mas celulas,o Jugar si ya no quiere agregar mas ", "Continuar", JOptionPane.INFORMATION_MESSAGE, JOptionPane.YES_NO_CANCEL_OPTION, iconContinue, buttons2, buttons2[0]);
                    if (option6 == 0) {
                    Matrix.addCell(Matrix.randomColumn(), Matrix.randomRow());
                    Matrix.checkRandom();
                    GestorEs.mostrarMensaje(Matrix.printMatrix());
                    }else{
                          Cell.rule1();
                          Cell.rule2();
                          Matrix.matrixClone();
                          GestorEs.mostrarMensaje(Matrix.printMatrix());
                    }
                        
                    break;
                case "Manualmente":

                    int option2 = (int) JOptionPane.showOptionDialog(null, "Seleccione Agregar para mas celulas,o Jugar si ya no quiere agregar mas ", "Continuar", JOptionPane.INFORMATION_MESSAGE, JOptionPane.YES_NO_CANCEL_OPTION, iconContinue, buttons2, buttons2[0]);
                    if (option2 == 0) {
                        int option1 = (int) JOptionPane.showInputDialog(null, "Seleccione la posicion de la fila en la que desea agregar la celula", "Seleccion de posicion", JOptionPane.INFORMATION_MESSAGE, iconCell, buttons3, buttons3[0]);
                        int option3 = (int) JOptionPane.showInputDialog(null, "Seleccione la posicion de la columna en la que desea agregar la celula", "Seleccion de posicion", JOptionPane.INFORMATION_MESSAGE, iconCell, buttons3, buttons3[0]);
                        if (option1 >= Matrix.matrixLenght() || option3 >= Matrix.matrixLenght()) {
                            GestorEs.mostrarMensaje("Datos invalidos el numero ingresado supera la dimension de la matriz");
                        } else if(option1 < Matrix.matrixLenght() && option3 < Matrix.matrixLenght()){
                            Matrix.addCell(option1, option3);
                            GestorEs.mostrarMensaje(Matrix.printMatrix());
                        }

                    } else {
                        Generations.addGenerations(generationsCount, Matrix.printMatrix());
                        do {
                          showGame();
                        } while (generationsCount <= 19);
                    }
              
                    break;

                default:
            }
        }
    }
}
