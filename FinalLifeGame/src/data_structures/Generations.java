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
 *@author Jerry Rivera
 * @author Roibin Elizondo
 * @author Maria Rodriguez
 */
public class Generations {
    GestorEs gestor = new GestorEs();
    private  static String[] generations= new String[20];
    private int indexGeneration;
    
    
    public static void printGenerations (int generationNumber){
        String pastGeneration = "\nGeneracion anterior\n"+generations[generationNumber-2];
        String actualGeneration = "\nGeneracion actual\n"+generations[generationNumber-1];
        String futureGeneration = "\nGeneracion siguiente\n"+generations[generationNumber];
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
    public static String getGeneration(int index){
        return generations[index];
    }
    public void chooseGeneration(){
        Object[] buttons4 = totalGenerations(Window_cell.getGenerations());
        Icon iconGene = new ImageIcon(getClass().getResource("/graphic_interface/generacion.jpg"));
        do{
            int option2 = (int) JOptionPane.showInputDialog(null, "Seleccione la generacion que desea observar", "Generacion", JOptionPane.INFORMATION_MESSAGE, iconGene, buttons4, buttons4[0]);
            Generations.printGenerations(option2);
        }while(1 == 1);
    }
    
}
