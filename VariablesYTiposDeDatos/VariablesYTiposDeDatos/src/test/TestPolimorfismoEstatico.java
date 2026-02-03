package test;

/**
 * @author Sergio
 */
public class TestPolimorfismoEstatico {

    public static void main(String[] args) {
        char character = 'a';
        test(character);
        //Invocando al metodo que recibe byte (PRIMITIVO)
        //Si no existiera el método byte, se ejecutaría el short
        //Si no existiera el método short tampoco, se ejecutaría el int
        //Si no existiera el método int tampoco, se ejecutaría el long
        //Si no existiera el método long tampoco, se ejecutaría el float
        //Si no existiera el método float tampoco, se ejecutaría el double
        
        
        //Con char: char=>int=>long=>Character=>Object
    }

    /*
    PRIMITIVOS
     */
    public static void test(byte p) {
        System.out.println("Invocando al metodo que recibe byte (PRIMITIVO)");
    }

    public static void test(short p) {
        System.out.println("Invocando al metodo que recibe short (PRIMITIVO)");
    }
    public static void test(int p) {
        System.out.println("Invocando al metodo que recibe int (PRIMITIVO)");
    }

    public static void test(long p) {
        System.out.println("Invocando al metodo que recibe long (PRIMITIVO)");
    }
    public static void test(float p) {
        System.out.println("Invocando al metodo que recibe float (PRIMITIVO)");
    }

    public static void test(double p) {
        System.out.println("Invocando al metodo que recibe double (PRIMITIVO)");
    }

    public static void test(char p) {
        System.out.println("Invocando al metodo que recibe char (PRIMITIVO)");
    }

    /*
    WRAPPER
     */
    public static void test(Byte p) {
        System.out.println("Invocando al metodo que recibe Byte (WRAPPER)");
    }

    public static void test(Short p) {
        System.out.println("Invocando al metodo que recibe Short (WRAPPER)");
    }

    public static void test(Integer p) {
        System.out.println("Invocando al metodo que recibe Integer (WRAPPER)");
    }

    public static void test(Long p) {
        System.out.println("Invocando al metodo que recibe Long (WRAPPER)");
    }

    public static void test(Float p) {
        System.out.println("Invocando al metodo que recibe Float (WRAPPER)");
    }

    public static void test(Double p) {
        System.out.println("Invocando al metodo que recibe Double (WRAPPER)");
    }

    public static void test(Character p) {
        System.out.println("Invocando al metodo que recibe Character (WRAPPER)");
    }

    /*
    SUPERTIPOS
     */
    public static void test(Number p) {
        System.out.println("Invocando al metodo que recibe Character (SUPERTIPO DE NUMEROS)");
    }

    public static void test(Object p) {
        System.out.println("Invocando al metodo que recibe Character (SUPERTIPO DE TODOS LOS TIPOS EN JAVA)");
    }

}
