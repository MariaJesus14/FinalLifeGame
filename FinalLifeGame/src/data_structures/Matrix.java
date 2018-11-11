
package data_structures;

import logical_model.Cell;

/**
 *@author Jerry Rivera
 * @author Roibin Elizondo
 * @author Maria Rodriguez
 */
public class Matrix {
   
  
    private static String[][] matrixGame;
    private static String[][] matrixClone;
    

    
 /*
 * Matrix es un metodo constructor que esta vacio
 * @return no retorna nada
 * @param no recibe parametros
 */
    public Matrix() {
     
    }
 /*
 * Matrix es un metodo constructor que inicializa el constructor
 * @return no retorna nada
 * @param recibe el numero de columnas y de filas para la matriz
 */
     public Matrix(int row,int column){
        matrixClone= new String  [row][column];
        matrixGame= new String [row][column];
    }
 /*
 * matrix_size es un metodo que le asigna a la matriz el tamaño que  el usuario desee
 * @return no retorna nada
 * @param recibe un numero tanto para las filas como para las columnas
 */
    public static void matrix_size(int size){
      matrixClone= new String  [size][size];
      matrixGame= new String [size][size];
    }
 /*
 * matrixLenght es un metodo que muestra la longitud de la matriz
 * @return retorna la longitud de la matriz
 * @param no recibe parametros
 */
    
    public static int matrixLenght (){
        return matrixGame.length;
        
    }
 /*
 * createCells es un metodo que muestra la celula en la mtriz en su estado de muerta
 * @return res void, por lo tanto no retorna nada
 * @param no recibe parametros
 */
    public static void createCells (){
        for (int i = 0; i < matrixGame.length; i++) {
            for (int j = 0; j < matrixGame.length; j++) {
                matrixGame[i][j] = Cell.dead();
                
                
            }
        }
    }
    public static void createCellsClone (){
        for (int i = 0; i < matrixClone.length; i++) {
            for (int j = 0; j < matrixClone.length; j++) {
                matrixClone[i][j] = Cell.dead();
                
            }
        }
    }
    
   
    public static String getMatrixPosition(int rows, int columns){
        return matrixGame[rows][columns];
    }
    
    
    
    public static void addCell (int row, int colunm){
        if(row <0 && colunm <0){
        }else{
            matrixGame [row][colunm] = Cell.alive();
            matrixClone [row][colunm] = Cell.alive();
            
        }
    }
    
    public static int randomRow (){
        int ramdom = (int)(Math.random() * matrixLenght()+0);
        return ramdom;
    }
    
    public static int randomColumn (){
        int ramdom = (int)(Math.random() * matrixLenght()+0);
        return ramdom;
    }
    
    public static void checkRandom(){
        boolean checked = false;
        do{
            if(Matrix.getMatrixPosition(Matrix.randomRow(), Matrix.randomColumn()) != Cell.alive()){
            Matrix.setStatus(Matrix.randomRow(), Matrix.randomColumn(), Cell.alive());
            checked = true;
        }else{
            
        }
        }while(checked == false);
       
    }
    
    public static void setStatus (int rows, int columns, String status){
        matrixClone[rows][columns]= status;
    }
    
    public static String printMatrix (){
        String tabla = "";
        for (int fila = 0; fila < matrixGame.length; fila++) {
            for (int columna = 0; columna < matrixGame.length; columna++) {
                tabla = tabla +" | "+matrixGame[fila][columna];
            }
            
            tabla = tabla +" | ";
            tabla = tabla + "\n";
           
        }
        return tabla;
    }
    public static String printMatrixClone (){
        String tabla = "";
        for (int fila = 0; fila < matrixClone.length; fila++) {
            for (int columna = 0; columna < matrixClone.length; columna++) {
                tabla = tabla +" | "+matrixClone[fila][columna];
            }
            
            tabla = tabla +" | ";
            tabla = tabla + "\n";
           
        }
        return tabla;
    }  

 
    public static void matrixClone(){
        for (int i = 0; i < matrixClone.length; i++) {
            for (int j = 0; j < matrixClone.length; j++) {
                matrixGame[i][j]=matrixClone[i][j];
                 
            }
        }
    }
//    public static void positionRandom(){
//        for (int x=0; x < matrixGame.length; x++) {
//        for (int y=0; y < matrixGame[x].length; y++) {
//        matrixClone[x][y] = (int) (Math.random()*9+1);
//  }
//}
//    }

        
}
