/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_structures;

import graphic_interface.Window_cell;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/**
 *
 * @author Jerry
 */
public class Generations {
    GestorEs gestor = new GestorEs();
    private  static String[] generations= new String[20];
    
    public static void printGenerations (int generationNumber){
        String pastGeneration = "\nGeneracion anterior\n"+generations[generationNumber-1];
        String actualGeneration = "\nGeneracion actual\n"+generations[generationNumber];
        String futureGeneration = "\nGeneracion siguiente\n"+generations[generationNumber+1];
        String totalGenerations;
        
        if(generationNumber == 0){
            totalGenerations = actualGeneration +"////"+ futureGeneration;
            GestorEs.mostrarMensaje(totalGenerations); 
        }if(generationNumber == Window_cell.getGenerations()){
            totalGenerations = pastGeneration+"////"+actualGeneration ;
            GestorEs.mostrarMensaje(totalGenerations);
        }else{
           totalGenerations = pastGeneration+"////"+actualGeneration +"////"+ futureGeneration;
           GestorEs.mostrarMensaje(totalGenerations); 
        }
    }
    
    public static void addGenerations(int index, String generation){
        generations[index] = generation;
    }
    
    public Object[] totalGenerations(int generations){
        Object[] buttons3 = new Object[generations];
        for (int i = 0; i < 10; i++) {
            buttons3[i] = i;
        }
        return buttons3;
    }
    
    public void chooseGeneration(){
        Object[] buttons4 = totalGenerations(Window_cell.getGenerations());
        Icon iconGene = new ImageIcon(getClass().getResource("/graphic_interface/generacion.jpg"));
        do{
            int option2 = (int) JOptionPane.showInputDialog(null, "Seleccione la generacion que desea observar", "Generacion", JOptionPane.INFORMATION_MESSAGE, iconGene, buttons4, buttons4[0]);
            Generations.printGenerations(option2);
        }while(1 == 1);
    }
    public void showGame (){
        String buttons2[] = {"Retroceder", "Siguiente"};
        Icon iconContinue = new ImageIcon(getClass().getResource("/graphic_interface/images.jpg"));
        int option2 = (int) JOptionPane.showOptionDialog(null, "Seleccione ", "Continuar", JOptionPane.INFORMATION_MESSAGE, JOptionPane.YES_NO_CANCEL_OPTION, iconContinue, buttons2, buttons2[0]);
     switch (option2) {
         case 0:
             break;
         case 1:
             break;
      }
    }
    
}
