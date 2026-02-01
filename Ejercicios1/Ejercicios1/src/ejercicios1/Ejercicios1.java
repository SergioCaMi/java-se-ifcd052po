package ejercicios1;

/**
 *
 * @author Sergio
 */
public class Ejercicios1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
        ejercicio6(); 
        ejercicio7();
    }

    public static void ejercicio1() {
        /*
            Imagina que tienes una variable de tipo double llamada precioExacto con el
            valor 19.99. Tu tarea es intentar almacenar ese valor en una nueva variable
            de tipo int llamada precioSinDecimales.
                1. Escribe el código e identifica por qué el compilador de Java
                muestra un error.
                - no se pueden almacenar decimales en un int.
                2. Investiga cómo forzar la asignación (casting) y observa qué
                ocurre con los decimales tras la operación. ¿El resultado es 20
                o 19? Explica por qué. 19 => unicamente desestima los decimales, no redondea.

         */

        double precioExacto = 19.99;
        int precioSinDecimales = (int) (precioExacto);
        System.out.println("Ejercicio 1");
        System.out.println(precioSinDecimales);
        System.out.println("Únicamente desestima los decimales, no redondea");

    }

    public static void ejercicio2() {
        /*
        Enunciado:
Un estudio de videojuegos te ha pedido definir las variables para las
estadísticas de un personaje. Debes elegir el tipo de dato primitivo que ocupe
el menor espacio posible en memoria para cada uno de los siguientes
datos:
nivel: El nivel máximo es 100.
puntosVida: Puede llegar hasta 30,000.
oro: Un jugador puede acumular hasta 2,000 millones de
monedas.
letraRango: Una única letra (A, B, C o D) que define el rango
del jugador.
estaVivo: Un valor que indique si el personaje sigue en la
partida o no.
Escribe la declaración e inicialización (con un valor de ejemplo) para
cada variable.
        
         */

        byte nivel = 100;
        short puntosVida = 30000;
        int oro = 2000000;
        char letraRango = 'A';
        boolean estaVivo = true;
        System.out.println("\nEjercicio 2");
        System.out.printf("El personaje tiene un nivel %d con %d puntos de vida. Tiene %d de oro, en un rango de %c. Está vivo? %b%n",
                nivel, puntosVida, oro, letraRango, estaVivo);
    }

    public static void ejercicio3() {

        /*
        Enunciado:
Java tiene reglas estrictas sobre el tamaño de sus 'cajas' de memoria.
Realiza las siguientes pruebas en tu editor:
1. Declara una variable long llamada poblacionMundial y
asígnale el valor 8000000000 (ocho mil millones). Verás que
Java marca un error aunque el long soporte ese tamaño.
Investiga cómo resolver el error
2. Haz lo mismo con un float y el número 3.5. 
         */
        System.out.println("\nEjercicio 3");
        long poblacionMundial = 8000000000L;//En Java, todos los números enteros literales son tratados como int por defecto.
        float numero = 3.5f;
        System.out.println("En Java, todos los números enteros literales son tratados como int por defecto.");
    }

    public static void ejercicio4() {

        /*
        Enunciado:
Tenemos dos variables que han intercambiado sus valores por error:
o int temperaturaFrio = 40;
o int temperaturaCalor = 5;
Tu misión es arreglarlas para que temperaturaFrio valga 5 y
temperaturaCalor valga 40.
Restricción:
No puedes escribir los números directamente (ej. no vale hacer
temperaturaFrio = 5). Debes usar únicamente asignaciones entre variables. 
        
         */
        System.out.println("\nEjercicio 4");
        int temperaturaFrio = 40;
        int temperaturaCalor = 5;
        int aux = 0;
        aux = temperaturaFrio;
        temperaturaFrio = temperaturaCalor;
        temperaturaCalor = aux;
        System.out.println("La temperatura mínima será de " + temperaturaFrio);
        System.out.println("La temperatura maxima será de " + temperaturaCalor);
    }

    public static void ejercicio5() {

        /*
        Enunciado:
1. Declara una variable char inicial = 'A';.
2. Ahora, declara otra variable int codigoLetra = inicial;.
3. Imprime ambas variables. ¿Qué número representa a la letra 'A'
en la memoria del ordenador?
4. Prueba a cambiar la letra por un símbolo como '@' o '#' y
descubre su código numérico."
         */
        System.out.println("\nEjercicio 5");
        char inicial = 'A';
        int codigoLetra = inicial;
        System.out.println(inicial);
        System.out.println(codigoLetra);
        char letra = '@';
        codigoLetra = letra;
        System.out.println(letra);
        System.out.println(codigoLetra);

    }

    public static void ejercicio6() {
        System.out.println("\nEjercicio 6");

        String nombre1 = "Sergio", nombre2 = "Pepe";
        byte nivel1 = 100, nivel2 = 50;
        short puntosVida1 = 30000, puntosVida2 = 15000;
        int oro1 = 2000000, oro2 = 1000000;
        char letraRango1 = 'A', letraRango2 = 'B';
        boolean estaVivo1 = true, estaVivo2 = false;
        System.out.println("---------------------------------------------------------------------------");
        System.out.printf("%-10s | %-10s | %-15s | %-15s | %-5s | %-5s%n", "Nombre", "Nivel", "Puntos de vida", "Oro", "Rango", "Vivo");
        System.out.println("---------------------------------------------------------------------------");
        imprimirJugador(nombre1, nivel1, puntosVida1, oro1, letraRango1, estaVivo1);
        imprimirJugador(nombre2, nivel2, puntosVida2, oro2, letraRango2, estaVivo2);

    }

    public static void imprimirJugador(String nombre, byte nivel, short puntosVida, int oro, char letraRango, boolean estaVivo) {
        System.out.printf("%-10s | %-10s | %-15s | %-15s | %-5s | %-5s%n", nombre, nivel, puntosVida, oro, letraRango, estaVivo);

    }

public static void ejercicio7() {
    String str = "  Esta es una FRASE para hacer PRUEBAS con Strings  ";
    System.out.println("Original: '" + str + "'");

    // --- 1. TRANSFORMACIÓN ---
    System.out.println("\n--- Transformación ---");
    System.out.println("Mayúsculas: " + str.toUpperCase());
    System.out.println("Minúsculas: " + str.toLowerCase());
    System.out.println("Sin espacios extremos (trim): '" + str.trim() + "'");
    System.out.println("Reemplazo de palabras: " + str.replace("FRASE", "SERIE DE PALABRAS"));
    System.out.println("Reemplazo de caracteres: " + str.replace('a', '@'));

    // --- 2. EXTRACCIÓN ---
    System.out.println("\n--- Extracción ---");
    // Cortar desde el índice 5 hasta el final
    System.out.println("Substring (desde 5): " + str.substring(5)); 
    // Cortar entre índices (ej. del 2 al 6)
    System.out.println("Substring (2 a 6): " + str.substring(2, 6));
    System.out.println("Carácter en posición 10: " + str.charAt(10));

    // --- 3. BÚSQUEDA E INFORMACIÓN ---
    System.out.println("\n--- Búsqueda ---");
    System.out.println("Longitud total: " + str.length());
    System.out.println("¿Contiene 'PRUEBAS'?: " + str.contains("PRUEBAS"));
    System.out.println("¿Empieza con '  Esta'?: " + str.startsWith("  Esta"));
    System.out.println("¿Termina con 'Strings  '?: " + str.endsWith("Strings  "));
    System.out.println("Posición de la primera 'a': " + str.indexOf("a"));
    System.out.println("Posición de la última 'a': " + str.lastIndexOf("a"));

    // --- 4. COMPARACIÓN Y ESTADO ---
    System.out.println("\n--- Comparación ---");
    String str2 = "esta es una frase para hacer pruebas con strings";
    System.out.println("¿Es igual a str2 (case sensitive)?: " + str.trim().equals(str2));
    System.out.println("¿Es igual a str2 (ignorando mayúsculas)?: " + str.trim().equalsIgnoreCase(str2));
    System.out.println("¿Está vacío?: " + "".isEmpty());
    System.out.println("¿Es solo espacios en blanco?: " + "   ".isBlank()); // Java 11+

    // --- 5. DIVISIÓN (SPLIT) ---
    System.out.println("\n--- División ---");
    String[] palabras = str.trim().split(" ");
    System.out.println("Número de palabras: " + palabras.length);
}    
}
