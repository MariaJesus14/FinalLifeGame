/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logical_model;

import graphic_interface.Window_cell;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static logical_model.Cell.countGene;

/**
 *
 * @author Jerry
 */
public class Generations {
    GestorEs gestor = new GestorEs();
    private  static String[] generations= new String[20];
    public void printGenerations (int generationNumber){
        String pastGeneration = "\nGeneracion anterior\n"+generations[generationNumber-1];
        String actualGeneration = "\nGeneracion actual\n"+generations[generationNumber];
        String futureGeneration = "\nGeneracion siguiente\n"+generations[generationNumber+1];
        String totalGenerations;
        switch(generationNumber){
            case 0:
                totalGenerations = actualGeneration +"////"+ futureGeneration;
                gestor.mostrarMensaje(totalGenerations);
                break;
            case 20:
                totalGenerations = pastGeneration+"////"+actualGeneration ;
                gestor.mostrarMensaje(totalGenerations);
                break;
            default:
                totalGenerations = pastGeneration+"////"+actualGeneration +"////"+ futureGeneration;
                gestor.mostrarMensaje(totalGenerations);
                break;
        }
    }
    public static void addGenerations(int index, String generation){
        generations[index] = generation;
    }
    public String[] totalGenerations(int generations){
        String[] buttons3 = new String[generations];
        String number = "";
        for (int i = 0; i < 10; i++) {
            number = number +i;
            buttons3[i] = number;
        }
        return buttons3;
    }
    
    public void Generations() {

        //String[] buttons3 = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19"};
        String[] buttons4 = totalGenerations(Window_cell.getGenerations());
        Icon iconGene = new ImageIcon(getClass().getResource("/graphic_interface/generacion.jpg"));
        boolean continue1 = true;
        while (continue1) {
            String option2 = (String) JOptionPane.showInputDialog(null, "Seleccione la generacion que desea observar", "Generacion", JOptionPane.INFORMATION_MESSAGE, iconGene, buttons4, buttons4[0]);
            switch (option2) {
                case "0":
                    JOptionPane.showMessageDialog(null, generations[countGene] );
                    break;
                case "1":
                     JOptionPane.showMessageDialog(null, generations[countGene] );
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null, generations[countGene] );
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, generations[countGene] );
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null, generations[countGene] );
                    break;
                case "5":
                    JOptionPane.showMessageDialog(null, generations[countGene] );
                    break;
                case "6":
                    JOptionPane.showMessageDialog(null, generations[countGene] );
                    break;
                case "7":
                    JOptionPane.showMessageDialog(null, generations[countGene] );
                    break;
                case "8":
                    JOptionPane.showMessageDialog(null, generations[countGene] );
                    break;
                case "9":
                    JOptionPane.showMessageDialog(null, generations[countGene] );
                    break;
                case "10":
                    JOptionPane.showMessageDialog(null, generations[countGene] );
                    break;
                case "11":
                    JOptionPane.showMessageDialog(null, generations[countGene] );
                    break;
                case "12":
                    JOptionPane.showMessageDialog(null, generations[countGene] );
                    break;
                case "13":
                    JOptionPane.showMessageDialog(null, generations[countGene] );
                    break;
                case "14":
                    JOptionPane.showMessageDialog(null, generations[countGene] );
                    break;
                case "15":
                    JOptionPane.showMessageDialog(null, generations[countGene] );
                    break;
                case "16":
                    JOptionPane.showMessageDialog(null, generations[countGene] );
                    break;
                case "17":
                    JOptionPane.showMessageDialog(null, generations[countGene] );
                    break;
                case "18":
                    JOptionPane.showMessageDialog(null, generations[countGene] );
                    break;
                case "29":
                    JOptionPane.showMessageDialog(null, generations[countGene] );
                    break;
            }
        }
    }

}
