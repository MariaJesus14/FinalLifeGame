
package graphic_interface;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import data_structures.Matrix;
import logical_model.GestorEs;

/**
 *@author Jerry Rivera
 * @author Roibin Elizondo
 * @author Maria Rodriguez
 */


public class Window_size {
  
    Window_cell cell = new Window_cell();
    GestorEs gestor = new GestorEs();
 /*
 * size() es un metodo que se encarga de asignar el tamaño a la cuadricula.
 * @return Es void, por lo tanto no retorna
 * @param Recibe un vector de argumentos
 */
        
    public void size() {
        boolean back = true;
        String buttons[] = {"8 x 8", "9 x 9", "10 x 10", "11 x 11", "12 x 12", "13 x 13", "14 x 14", "15 x 15", "16 x 16", "17 x 17", "18 x 18", "19 x 19", "20 x 20"};
        Icon iconSize = new ImageIcon(getClass().getResource("/graphic_interface/iconSize.jpg"));
       // try {

            while (back == true) {
                String option = (String) JOptionPane.showInputDialog(null, "Elija el tamaño de la cuadricula para iniciar el juego", "Tamaño de cuadricula", JOptionPane.INFORMATION_MESSAGE, iconSize, buttons, buttons[0]);

                switch (option) {
                    case "8 x 8":
                        Matrix.matrix_size(8);
                        Matrix.createCells();
                        Matrix.createCellsClone();
                        JOptionPane.showMessageDialog(null, Matrix.printMatrix());
                        cell.cell();
                        
                     
                        break;
                    case "9 x 9":
                        Matrix.matrix_size(9);
                        Matrix.createCells();
                        Matrix.createCellsClone();
                        JOptionPane.showMessageDialog(null, Matrix.printMatrix());
                        cell.cell();
                        break;
                    case "10 x 10":
                        Matrix.matrix_size(10);
                        Matrix.createCells();
                        Matrix.createCellsClone();
                        JOptionPane.showMessageDialog(null, Matrix.printMatrix());
                        cell.cell();
                        break;
                    case "11 x 11":
                        Matrix.matrix_size(11);
                        Matrix.createCells();
                        Matrix.createCellsClone();
                        JOptionPane.showMessageDialog(null, Matrix.printMatrix());
                        cell.cell();
                        break;
                    case "12 x 12":
                        Matrix.matrix_size(12);
                        Matrix.createCells();
                        Matrix.createCellsClone();
                        JOptionPane.showMessageDialog(null, Matrix.printMatrix());
                        cell.cell();
                        break;
                    case "13 x 13":
                        Matrix.matrix_size(13);
                        Matrix.createCells();
                        Matrix.createCellsClone();
                        JOptionPane.showMessageDialog(null, Matrix.printMatrix());
                        cell.cell();
                        break;
                    case "14 x 14":
                        Matrix.matrix_size(14);
                        Matrix.createCells();
                        Matrix.createCellsClone();
                        JOptionPane.showMessageDialog(null, Matrix.printMatrix());
                        cell.cell();
                        break;
                    case "15 x 15":
                        Matrix.matrix_size(15);
                        Matrix.createCells();
                        Matrix.createCellsClone();
                        JOptionPane.showMessageDialog(null, Matrix.printMatrix());
                        cell.cell();
                        break;
                    case "16 x 16":
                        Matrix.matrix_size(16);
                        Matrix.createCells();
                        Matrix.createCellsClone();
                        JOptionPane.showMessageDialog(null, Matrix.printMatrix());
                        cell.cell();
                        break;
                    case "17 x 17":
                        Matrix.matrix_size(17);
                        Matrix.createCells();
                        Matrix.createCellsClone();
                        JOptionPane.showMessageDialog(null, Matrix.printMatrix());
                        cell.cell();
                        break;
                    case "18 x 18":
                        Matrix.matrix_size(18);
                        Matrix.createCells();
                        Matrix.createCellsClone();
                        JOptionPane.showMessageDialog(null, Matrix.printMatrix());
                        cell.cell();
                        break;
                    case "19 x 19":
                        Matrix.matrix_size(19);
                        Matrix.createCells();
                        Matrix.createCellsClone();
                        JOptionPane.showMessageDialog(null, Matrix.printMatrix());
                        cell.cell();
                        break;
                    case "20 x 20":
                        Matrix.matrix_size(20);
                        Matrix.createCells();
                        Matrix.createCellsClone();
                        JOptionPane.showMessageDialog(null, Matrix.printMatrix());
                        cell.cell();
                        break;
                    default:
                }
            }
       // } catch (Exception e) {
        //}
    }
}
