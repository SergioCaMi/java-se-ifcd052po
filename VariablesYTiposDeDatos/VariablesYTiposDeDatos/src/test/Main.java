package test;

public class Main {

    public static void main(String[] args) {
        testPrimitivosEnteros();
        System.out.println("--------------");
        testPrimitivosFlotantes();
        System.out.println("--------------");
        testPrimitivosChar();
        System.out.println("--------------");
        testPrimitivosBoolean();
    }

    public static void testPrimitivosEnteros() {
        System.out.println("Ejecutando Primitivos Enteros");
//        byte b1 = 127;
//        byte b2 = 1;
        //Byte
        byte b1 = 127, b2 = 3;
        byte totalb = (byte) (b1 + b2);

        //INT
        int i1 = 2147483647, i2 = 7483647;
        int totali = (i1 + i2);

        //LONG
        long l1 = 10, l2 = 20;
        long totall = (l1 + l2);

        long valorLargo = 128l;

        System.out.println("Variables byte: " + b1 + " + " + b2 + " = " + totalb);
        System.out.println("Variables integer: " + i1 + " + " + i2 + " = " + totali);
        System.out.println("Variables long: " + l1 + " + " + l2 + " = " + totall);

    }

    public static void testPrimitivosFlotantes() {
        System.out.println("Ejecutando Primitivos Flotantes");
        float f1 = 123.456f, f2 = 3.5f;
        float totalf = f1 + f2;

        System.out.println("Variables float: " + f1 + " + " + f2 + " = " + totalf);

    }

    public static void testPrimitivosChar() {
        System.out.println("Ejecutando Primitivos Char");
        char letra1 = 'A';
        char letraAscii = 65;
        char letraUnicode = '\u0041';
        char salto = '\n';

        System.out.println("Variables char: " + letra1);
        System.out.println("Variables char por Ascii: " + letraAscii);
        System.out.println("Variables char por Unicode: " + letraUnicode);
        System.out.println("Hola" + salto + "Esto va en otra línea");

    }

    public static void testPrimitivosBoolean() {
        System.out.println("Ejecutando Primitivos Boolean");
        boolean valorTrue = true;
        System.out.println("Verdadero: " + valorTrue);
        boolean valorFalse = false;
        System.out.println("Falso: " + valorFalse);

    }

}
