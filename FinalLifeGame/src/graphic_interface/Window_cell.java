
package graphic_interface;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import logical_model.Cell;
import logical_model.Matrix;
import logical_model.GestorEs;

/**
 *@author Jerry Rivera
 * @author Roibin Elizondo
 * @author Maria Rodriguez
 */
public class Window_cell {
    Cell cell1= new Cell();
    GestorEs gestor = new GestorEs();
    
 /*
 * cell es el metodo encargado de generara las celulas aleatoria o manualmente, segun el usuario prefiera
 * @return Es void, por lo tanto no retorna
 * @param no recibe parametros
 */

    public void cell() {
        
        boolean back = true;
        String buttons2 []={"Agregar","Jugar"};
        String buttons[] = {"Aleatoreamente", "Manualmente"};
        Icon iconCell = new ImageIcon(getClass().getResource("/graphic_interface/iconCell.jpg"));
        Icon iconContinue = new ImageIcon(getClass().getResource("/graphic_interface/images.jpg"));
        String option = (String) JOptionPane.showInputDialog(null, "Seleccione la forma mediante la cual desea generar las celulas ", "Seleccion de celulas", JOptionPane.INFORMATION_MESSAGE, iconCell, buttons, buttons[0]);
         
        while (back == true) {
                switch (option) {
                case "Aleatoreamente":
                    
                    break;
                case "Manualmente":
                      
                    int option2 = (int)JOptionPane.showOptionDialog(null, "Seleccione ", "Continuar", JOptionPane.INFORMATION_MESSAGE,JOptionPane.YES_NO_CANCEL_OPTION, iconContinue, buttons2, buttons2[0]);
                    if (option2==0){
                    Matrix.addCell(gestor.pedirEntero("Ingrese fila"),gestor.pedirEntero("Ingrese columna"));
                    
                    GestorEs.mostrarMensaje(Matrix.printMatrix());
                    }else{
                        do{
                            if (Cell.countGene<=21) {
                            Cell.rule1();
                            Cell.rule2();
                            Matrix.matrixClone();
                            GestorEs.mostrarMensaje(Matrix.printMatrix());   
                    } 
                       
                        }while(back!= false);
                        Cell.rule1();
                        Cell.rule2();
                       
                        back=false;
                    }
                    break;
                    
                   
                default:
            }
        }
    }
}
