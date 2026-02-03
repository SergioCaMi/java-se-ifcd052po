package condicionalesbuclesyarrays;

import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

/**
 *
 * @author Sergio
 */
public class PruebasBucles {

    public static void main(String[] args) {
        testBucleWhile();
        testBucleDoWhile();
        testBucleFor();
        ejercicio();
        testBreakYContinue();
        testBuclesAnidades();
        
    }

    public static void testBucleWhile() {
        System.out.println("Bucle While");
//        int numero = 10;
//        while (numero>= 0){
//            System.out.println(numero);
//            numero--;
//        }

        int numero = 1;
        //menos 5 y 7
//        while (numero <= 10) {
//            if (numero == 7 || numero == 9)numero++;
//            System.out.println(numero);
//            numero++;
//        }

        while (numero <= 10) {
            System.out.println(numero);
            numero++;
            if (numero == 7 || numero == 9) {
                numero++;
            }
        }

    }

    public static void testBucleDoWhile() {
        System.out.println("Bucle Do-While");
        int numero = 1;
        do {
            System.out.println(numero);
            numero++;
            if (numero == 7 || numero == 9) {
                numero++;
            }
        } while (numero <= 10);
    }

    public static void testBucleFor() {
        System.out.println("Bucle For");
        for (int numero = 1; numero <= 10; numero++) {
            if (numero == 7 || numero == 9) {
                numero++;
            }
            System.out.println(numero);
        }

        System.out.println("---------------Ejemplo 1--------------------");
        for (int numero = 1; numero <= 10; numero++) {

            System.out.println(numero);

        }

        System.out.println("--------------Ejemplo 2---------------------");

        int numero2 = 1;

        for (; numero2 <= 10; numero2++) {

            System.out.println(numero2);

        }

        System.out.println("--------------Ejemplo 3----------------------");
        System.out.println("Bucle infinito");
        // bucle infinito!!!
//        for ( ; ; ) {
//            
//            System.out.println("infinito");
//        }

        System.out.println("-------------Ejemplo 4-----------------------");

        for (int num1 = 0, num2 = 10; num1 < num2; num1++, num2--) {

            System.out.println(num1 + " - " + num2);

        }

    }

    public static void ejercicio() {
        
        int intentos = 10;
        int numero = 0;
        String mensaje = "";
        String valorRango = JOptionPane.showInputDialog("Dime el límite maximo");
        int limite = Integer.parseInt(valorRango);
        int numeroSecreto = ThreadLocalRandom.current().nextInt(1, limite+1);
        System.out.println("El número secreto a buscar es: " + numeroSecreto);
        int margen = limite / 10;
                
        do {
            String valorIntroducido = JOptionPane.showInputDialog("Intenta acertar el número... (1 - "+limite+"). Te quedan "+intentos+" intentos.");
            if (valorIntroducido == null) break;
            numero = Integer.parseInt(valorIntroducido);
            intentos--;

            mensaje = (numero == numeroSecreto)
                    ? "Has acertado en el intento numero " + intentos + ". El número secreto era el " + numeroSecreto + "."
                    : (numero > numeroSecreto)
                            ? ((numero - numeroSecreto <= margen) ? "¡Casi casi! Estás un 10% por encima." : "Te has pasado.")
                            : ((numeroSecreto - numero <= margen) ? "¡Casi casi! Estás un 10% por debajo." : "Te has quedado corto.");
            JOptionPane.showMessageDialog(null, mensaje);

        } while ((numero != numeroSecreto)&&(intentos>0) );
        if (intentos == 0)JOptionPane.showMessageDialog(null, "Has perdido!");
    }
    
    
    public static void testBreakYContinue(){
        System.out.println("Ejemplo break y continue");
        for (int i = 0; i < 10; i++) {
            if  (i==8){break;}
            else if (i>3 && i < 5){
            continue;
            }
            System.out.println(i);
        }
    }
    
    public static void testBuclesAnidades() {
        principal:
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteración numero "+i+" del bucle i");
            anidado:
            for (int j = 0; j < 5; j++) {
                System.out.println("\t Iteración numero "+j+" del bucle j");
                if (j== 6){
                break principal;
                }
            }
        }
    }
    
    
    
    
}
