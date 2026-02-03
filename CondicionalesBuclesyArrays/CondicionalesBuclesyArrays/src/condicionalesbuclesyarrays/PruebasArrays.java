package condicionalesbuclesyarrays;

import java.util.Arrays;

/**
 *
 * @author Sergio
 */
public class PruebasArrays {

    public static void main(String[] args) {
//        System.out.println(args[0]);
//        System.out.println(args[1]);
//        System.out.println(args[2]);
//        System.out.println(args[3]);
//        System.out.println(args[4]);
        declaracionInicializacionArrays();
        mostrarPosiciones1();
        mostrarPosiciones2();
    }

    public static void declaracionInicializacionArrays() {
        //String[] nombres = new String[3];// Dimensionar el array
        //int[] edades = {25, 27, 48};//Inicialización y asignación
        String[] nombres = new String[3];
        nombres[0] = "Mary";
        nombres[1] = "Bob";
        nombres[2] = "Carlos";
        
        
        int[] numeros = {25, 27, 48};
        
        //Recorrer un Array con bucle For
        System.out.println("Recorrer un Array con bucle For");
        for (int indice = 0; indice < numeros.length; indice++) {
            System.out.println(numeros[indice]);
        }
        System.out.println("------------------------------------------------");
        //Recorrer un Array con el buble for mejorado (enhanced for)
        System.out.println("Recorrer un Array con el buble for mejorado (enhanced for)");
        for (int num: numeros) {
            System.out.println(num);
        }
        System.out.println("------------------------------------------------");
        //Procesamiento con Stream
        System.out.println("Procesamiento con Stream");
        Arrays.stream(numeros).forEach(num -> System.out.println(num));
        
        
        
    }
    
    public static void mostrarPosiciones1() {
    // Creamos una matriz de 3 filas y 4 columnas
    int[][] matriz = new int[3][4];

    System.out.println("Recorriendo matriz y mostrando posiciones [Fila][Columna]:");

    // Bucle externo para las FILAS
    for (int fila = 0; fila < matriz.length; fila++) {
        
        // Bucle interno para las COLUMNAS
        for (int col = 0; col < matriz[fila].length; col++) {
            // Mostramos la posición actual
            System.out.print("[" + fila + "][" + col + "] ");
        }
        
        // Salto de línea al terminar cada fila para que se vea como una tabla
        System.out.println();
    }
}
    
    public static void mostrarPosiciones2() {
    // Creamos una matriz de 3 filas y 4 columnas
    int[][] matriz = new int[10][];

    System.out.println("Recorriendo matriz y mostrando posiciones [Fila][Columna]:");

    // Bucle externo para las FILAS
    for (int fila = 0; fila < matriz.length; fila++) {
        matriz[fila] = new int[fila+1];
        // Bucle interno para las COLUMNAS
        for (int col = 0; col < matriz[fila].length; col++) {
            // Mostramos la posición actual
            System.out.print("[" + fila + "][" + col + "] ");
        }
        
        // Salto de línea al terminar cada fila para que se vea como una tabla
        System.out.println();
    }
}
    

}
