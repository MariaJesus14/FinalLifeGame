
package data_structures;

import javax.swing.JOptionPane;

/**
 *@author Jerry Rivera
 * @author Roibin Elizondo
 * @author Maria Rodriguez
 */
public class GestorEs {
 /*
 * mostrarMensaje es el metodo encargado de mostrarle al usuario algun mensaje
 * @return retorna un mensaje por medio de JOptionPane
 * @param recibe un mensaje de tipo string
 */
   public static void mostrarMensaje (String mensaje){
       JOptionPane.showMessageDialog(null, mensaje);
   }
 /*
 * pedirEntero es el metodo encargado de solicitar al usuario un numero entero
 * @return retorna el numero solicitado
 * @param recibe un mensaje de tipo string
 */
   
   public int pedirEntero (String mensaje){
       int entero = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
       return entero;
   }
  /*
 * pedirString es el metodo encargado de solicitar al usuario un string
 * @return retorna el string solicitado
 * @param recibe un mensaje de tipo string
 */ 
   public String pedirString (String mensaje){
       String string = JOptionPane.showInputDialog(mensaje);
       return string;
   }
}
