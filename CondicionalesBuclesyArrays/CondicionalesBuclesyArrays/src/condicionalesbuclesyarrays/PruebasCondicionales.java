package condicionalesbuclesyarrays;

import javax.swing.JOptionPane;

/**
 *
 * @author Sergio Capítulo 5
 *
 */
public class PruebasCondicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        testSentenciasIf();
        testOperadorTernario();
        ejercicioOperadorTernario();
    }

    public static void testSentenciasIf() {
        String valorIntroducido = JOptionPane.showInputDialog("Introduce un número");
        int numero = Integer.parseInt(valorIntroducido);
        if (numero > 0) {
            System.out.println("El número es positivo");
        } else if (numero < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es cero");
        }

    }

    public static void testOperadorTernario() {
        String valorIntroducido = JOptionPane.showInputDialog("Introduce un número");
        int numero = Integer.parseInt(valorIntroducido);
        String resultado = (numero % 2 == 0) ? "El número es Par" : "El número es Impar";
        System.out.println(resultado);
    }

        public static void ejercicioOperadorTernario() {
        String valorIntroducido = JOptionPane.showInputDialog("Introduce un número");
        int numero = Integer.parseInt(valorIntroducido);
        String resultado = (numero > 0) ? "El número es Positivo" : (numero < 0) ? "El número es Negativo" : "El número es Cero";
        System.out.println(resultado);
    }

    
}
