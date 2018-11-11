
package logical_model;


import data_structures.GestorEs;
import data_structures.Matrix;
import static data_structures.Matrix.matrixLenght;

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
    private  static int[] arrayDatos = new int[7];

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
                    neighborHood(rows, columns);
                    neighborDistance();
                    for (vecinoInicialFila = getArrayDatosPosition(0); vecinoInicialFila < getArrayDatosPosition(5); vecinoInicialFila++) {
                        for (vecinoInicialColumna = getArrayDatosPosition(1); vecinoInicialColumna < getArrayDatosPosition(6); vecinoInicialColumna++) {
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
 * getArrayDatosPosition es el metodo encargado de generar obtener los datos de la posicion del arreglo
 * @return retorna los datos del arreglo en la posicion index
 * @param recibe un int que es la posicion que se quiere obtener
 */
       public static int getArrayDatosPosition (int index){
        return arrayDatos[index];
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
                    neighborHood(rows, columns);
                    neighborDistance();
                    for (vecinoInicialFila = getArrayDatosPosition(0); vecinoInicialFila < getArrayDatosPosition(5); vecinoInicialFila++) {
                        for (vecinoInicialColumna = getArrayDatosPosition(1); vecinoInicialColumna < getArrayDatosPosition(6); vecinoInicialColumna++) {
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
 /*
 * neighborHood es el metodo que obtiene las vecinas de la celula viva  
 * @return retorna el vector
 * @param recibe un entero para las columnas de la matriz y otro para las filas
 */
    
    public static int[] neighborHood(int rowsCell, int columnsCell){
        int rC=rowsCell;
        int cC=columnsCell;
        int neighbor1 = 0;
        int neighbor2 = 0;
        
        if(rC == rC && cC+1 < 0 || rC == rC && cC+1 >=matrixLenght()){
            neighbor1 = 2;
        }else{
            
        }
        
        if(rC == rC && cC-1 < 0 || rC == rC && cC-1 >=matrixLenght()){
            neighbor1 = 4;
        }else{
            
        }
        
        if(cC==cC && rC+1 <0 || cC==cC && rC+1 >=matrixLenght()){
            neighbor2 =3;
        }else{
            
        }
        
        if(cC == cC && rC-1 <0 || cC == cC && rC-1 >=matrixLenght() ){
            neighbor2 = 1;
        }else{
            
        }
       
        neighbor2 = neighbor2 * 10;
        int neighbors = neighbor1 + neighbor2;
        switch(neighbors){
            case 14:
                 arrayDatos[0] = rowsCell;
                 arrayDatos[1] = columnsCell;
                 arrayDatos[2] = rowsCell+1;
                 arrayDatos[3] = columnsCell+1;
                 System.out.print("\nrow inicio = "+arrayDatos[0]+"\ncolumn inicio"+arrayDatos[1]+"\nrows fin = "+arrayDatos[2]+"\ncolmns fin = "+arrayDatos[3]);
                break;
            case 1:
                 arrayDatos[0] = rowsCell;
                 arrayDatos[1] = columnsCell-1;
                 arrayDatos[2] = rowsCell+1;
                 arrayDatos[3] = columnsCell+1;
                break;
            case 12:
                 arrayDatos[0] = rowsCell;
                 arrayDatos[1] = columnsCell-1;
                 arrayDatos[2] = rowsCell+1;
                 arrayDatos[3] = columnsCell;
                break;
            case 4:
                 arrayDatos[0] = rowsCell-1;
                 arrayDatos[1] = columnsCell;
                 arrayDatos[2] = rowsCell+1;
                 arrayDatos[3] = columnsCell+1;
                break;
            case 0:
                 arrayDatos[0] = rowsCell-1;
                 arrayDatos[1] = columnsCell-1;
                 arrayDatos[2] = rowsCell+1;
                 arrayDatos[3] = columnsCell+1;
                 System.out.print("NIGGER");
                break;
            case 2:
                 arrayDatos[0] = rowsCell-1;
                 arrayDatos[1] = columnsCell-1;
                 arrayDatos[2] = rowsCell+1;
                 arrayDatos[3] = columnsCell;
                break;
            case 34:
                 arrayDatos[0] = rowsCell-1;
                 arrayDatos[1] = columnsCell;
                 arrayDatos[2] = rowsCell;
                 arrayDatos[3] = columnsCell+1;
                break;
            case 30:
                 arrayDatos[0] = rowsCell-1;
                 arrayDatos[1] = columnsCell-1;
                 arrayDatos[2] = rowsCell;
                 arrayDatos[3] = columnsCell+1;
                break;
            case 32:
                 arrayDatos[0] = rowsCell-1;
                 arrayDatos[1] = columnsCell-1;
                 arrayDatos[2] = rowsCell;
                 arrayDatos[3] = columnsCell;
                break;
            default:
                break;        
        }
          
        return arrayDatos;
    }
 /*
 * distanciaVecinos es el metodo que se encarga de medir la distancia entre cada vecino de la celula 
 * @return es void, por lo tanto no retorna nada
 * @param no recibe parametros
 */
       public static void neighborDistance(){
        int distancia1;
        int distancia2;
        distancia1 = arrayDatos[0]-arrayDatos[2];
        distancia2 = arrayDatos[1]-arrayDatos[3];
        if(distancia1< 0 || distancia2 < 0){
            distancia1 = distancia1*-1;
            distancia2 = distancia2*-1;
        }
       
        if(distancia1 == distancia2){
            arrayDatos[5] = arrayDatos[2]+1;
            arrayDatos[6] = arrayDatos[3]+1;
        }else{
            if(distancia1 == 1 && distancia2==2){
                arrayDatos[5] = arrayDatos[2]+1;
                arrayDatos[6] = arrayDatos[3]+1;
            }else if(distancia1 == 2 && distancia2 ==1){
                System.out.print("Si sirve");
                arrayDatos[5] = arrayDatos[2]+1;
                arrayDatos[6] = arrayDatos[3]+1;
            }
        }
        
        
    }
    


}
