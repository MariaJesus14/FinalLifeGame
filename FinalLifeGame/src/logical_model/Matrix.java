
package logical_model;

/**
 *@author Jerry Rivera
 * @author Roibin Elizondo
 * @author Maria Rodriguez
 */
public class Matrix {
   
  
    private static String[][] matrixGame;
    private static String[][] matrixClone;
    private  static int[] arrayDatos = new int[7];
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
    
    public static int getArrayDatosPosition (int index){
        return arrayDatos[index];
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
    
    public static int[] starterNeighbor (int rowsCelula, int columnsCelula){
        int[] array = new int[2];
        rowsCelula = rowsCelula-1;
        columnsCelula = columnsCelula-1;
        for (int rows = rowsCelula; rows < rowsCelula+3; rows++) {
            for (int columns = columnsCelula; columns < columnsCelula+3; columns++) {
                if(rows < 0 || columns < 0){
                }else{
                 arrayDatos[0] = rows;
                 arrayDatos[1] = columns;

                 return arrayDatos;                
                }
            }
        }
        return arrayDatos;
    }   
    
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
    
    public static int[] lastNeighbor (int rowsCelula, int columnsCelula){
        int[] array = new int[2];
        rowsCelula = rowsCelula+1;
        columnsCelula = columnsCelula+1;
        for (int rows = rowsCelula; rows > rowsCelula-3; rows--) {
            for (int columns = columnsCelula; columns > columnsCelula-3; columns--) {
                if(rows >= matrixLenght() || columns >= matrixLenght()){
                }else{
                 arrayDatos[2] = rows;
                 arrayDatos[3] = columns;
                 return arrayDatos;                
                }
            }
        }
        
        return arrayDatos;
    }   

    public static void distanciaVecinos(){
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
    public static void matrixClone(){
        for (int i = 0; i < matrixClone.length; i++) {
            for (int j = 0; j < matrixClone.length; j++) {
                matrixGame[i][j]=matrixClone[i][j];
                 
            }
        }
    }

        
}
