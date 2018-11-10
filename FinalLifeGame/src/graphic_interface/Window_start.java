
package graphic_interface;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *@author Jerry Rivera
 * @author Roibin Elizondo
 * @author Maria Rodriguez
 */
public class Window_start {

    Window_size size = new Window_size();
    //Window_cell cell = new Window_cell();
 /*
 * windowStar() es un metodo que se encarga de mostrar los mensajes de la ventana principal
 * @return Es void, por lo tanto no retorna
 * @param Recibe un vector de argumentos
 */

    public void windowStar() {
        boolean back = true;
        String buttons[] = {"Acerca del juego", "Jugar", "Salir"};
        Icon start = new ImageIcon(getClass().getResource("/graphic_interface/startIcon.png"));
        Icon Information = new ImageIcon(getClass().getResource("/graphic_interface/Info-icon.png"));
        Icon bye = new ImageIcon(getClass().getResource("/graphic_interface/close-button.png"));

        while (back == true) {
             int option = JOptionPane.showOptionDialog(null, "Bienvenido al juego de la vida"+"\n"+"Roibin Elizondo"+"\n"+"Maria Rodriguez"+"\n"+"Jerry Rivera", "Juego de la vida", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, start, buttons, buttons[1]);
            switch (option) {
                case 0:
                    JOptionPane.showConfirmDialog(null, "El juego de la vida ocurre en un tablero cuadriculado, en donde cada cuadro puede haber una célula o estar vacío.\n"
                            + "La idea es acomodar una serie de células en la malla y observar las vecindades de cada célula, cada cuadro pues -utilizando\n"
                            + "las reglas de Conway- ir calculando las nuevas configuraciones de células que aparecerán en la siguiente generación.\n"
                            + "Puede verse que el juego de la vida de Conway no es estrictamente un juego de video, pues el ‘jugador’ no hace nada más que ver la\n"
                            + "evolución que en cada tiempo, en cada generación, que aparece en la pantalla.\n"
                            + "\n"
                            + "Cabe decir que las reglas que se definan para el juego de la vida deben ser tales que la conducta de la población resulte a un tiempo\n"
                            + "interesante e impredecible. Las reglas de evolución, dadas por el propio matemático, llamadas también reglas genéticas, son de una sencillez\n"
                            + "deliciosa y pensamos que Conway las fue descubriendo poco a poco.\n"
                            + "\n"
                            + "Fuente: UNOCERO", "Informacion del juego", JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE, Information);
                    back = true;
                    break;
                case 1:
                    size.size();
                    break;
                case 2:
                    int exit = JOptionPane.showConfirmDialog(null, "Gracias por jugar, hasta pronto", "Salir", JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE, bye);
                    System.exit(exit);
                    back = false;
                    break;
                default:
            }
        }

    }
}
