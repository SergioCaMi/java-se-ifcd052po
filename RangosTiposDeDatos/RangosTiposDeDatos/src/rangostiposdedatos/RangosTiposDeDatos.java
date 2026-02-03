package rangostiposdedatos;

/**
 * @author Sergio
 */
public class RangosTiposDeDatos {

    public static void main(String[] args) {

        // %d -> números enteros (byte, short, int, long)
        // %f -> números decimales (float, double)
        // %n -> salto de línea (newline)
        // %-10s: 
        // Reserva 10 espacios para un String (s). 
        // El signo menos (-) alinea el texto a la izquierda.
        // %-25d: 
        // Reserva 25 espacios para un número entero (d).
        // %-25e: 
        // Reserva 25 espacios para un número en notación científica (e). 
        // Esto es vital para Float y Double, ya que sus valores son tan grandes 
        // que de otra forma romperían la tabla.
        // %n: Es un salto de línea.
        System.out.println("-------------------------------------------------------------------------");
        System.out.printf("%-10s | %-25s | %-25s%n", "TIPO", "MINIMO", "MAXIMO");
        System.out.println("-------------------------------------------------------------------------");
        System.out.printf("%-10s | %-25d | %-25d%n", "Byte", Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("%-10s | %-25d | %-25d%n", "Short", Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("%-10s | %-25d | %-25d%n", "Integer", Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("%-10s | %-25d | %-25d%n", "Long", Long.MIN_VALUE, Long.MAX_VALUE);
        System.out.printf("%-10s | %-25e | %-25e%n", "Float", Float.MIN_VALUE, Float.MAX_VALUE);
        System.out.printf("%-10s | %-25e | %-25e%n", "Double", Double.MIN_VALUE, Double.MAX_VALUE);
        System.out.println("-------------------------------------------------------------------------");

    }
}
