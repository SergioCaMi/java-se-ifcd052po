/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author Sergio
 */
public class Ejercicio3 {

    public static void main(String[] args) {

        System.out.println(ej1("SOLEADO"));
        System.out.println(ej2(33));
        // String
        System.out.println(ej3("Hola Mundo"));

        // Integer
        System.out.println(ej3(25));

        // null
        System.out.println(ej3(null));

        // Object()
        Object algoRaro = new Object();
        System.out.println(ej3(algoRaro));
        System.out.println(ej4("sdfgsdfgkjhgg"));
   
    }

    public static String ej1(String clima) {
        System.out.println("-----------------------------------------");
        System.out.println("Ejercicio 1");
        System.out.println("-----------------------------------------");
        /*
 Enunciado:
Crea un método getClimaRecomendacion(String clima) que use switch
expression para retornar directamente un consejo:
• "SOLEADO" -> "No olvides las gafas de sol".
• "LLUVIOSO" -> "Coge el paraguas".
• "FRIO" -> "Ponte el abrigo".
• Cualquier otro -> "Disfruta del dia".
Restricción: El método debe tener una sola línea de código dentro.      
        
         */

        return switch (clima.toLowerCase()) {
            case "soleado" ->
                "No olvides las gafas de sol";
            case "lluvioso" ->
                "Coge el paraguas";
            case "frio" ->
                "Ponte el abrigo";
            default ->
                "Disfruta del dia";
        };

    }

    public static String ej2(Integer edad) {
        System.out.println("-----------------------------------------");
        System.out.println("Ejercicio 2");
        System.out.println("-----------------------------------------");
        /*
        Enunciado:
        Crea un método clasificarPersona(int edad) que retorne:
        • 0 a 12 -> "Niño".
        • 13 a 17 -> "Adolescente".
        • 18 a 64 -> "Adulto".
        • 65 en adelante -> "Senior".    
        
         */
        return switch (edad) {
            case Integer n when (edad > 0 && edad <= 12) ->
                "Es un niñ@";
            case Integer n when (edad >= 13 && edad <= 17) ->
                "Es un/a adolescente";
            case Integer n when (edad >= 18 && edad <= 64) ->
                "Es un/a adult@";
            case Integer n when (edad >= 65) ->
                "Es un Senior";
            case 0 ->
                "El valor es nulo";
            default ->
                "Día inválido o tipo de dato no soportado";
        };

    }

    public static String ej3(Object dato) {
        System.out.println("-----------------------------------------");
        System.out.println("Ejercicio 3");
        System.out.println("-----------------------------------------");
        /*
        Enunciado:
        Crea un método procesarDato(Object dato) que evalúe lo siguiente:
        • Si es un String:
        Imprimir "Texto en mayúsculas: " + (el texto convertido)
        • Si es un Integer:
        Imprimir "El número multiplicado por 2 es: " + (el número * 2)
        • Si es null: Imprimir "Error: Dato nulo".
        • Default: Imprimir "Tipo no reconocido"
        
         */

        return switch (dato) {
            case String s ->
                "Texto en mayúsculas: " + s.toUpperCase();

            case Integer n ->
                "El número multiplicado por 2 es: " + (n * 2);

            case null ->
                "Error: Dato nulo";

            default ->
                "Tipo no reconocido: " + dato.getClass().getSimpleName();
        };
    }

    public static String ej4(Object pwd) {
        System.out.println("-----------------------------------------");
        System.out.println("Ejercicio 4");
        System.out.println("-----------------------------------------");
        /*
        Enunciado: Crea un método validarPassword(Object pwd) que reciba un
        objeto:
        • Si es un String y su longitud es menor a 8 imprimirá:
        "Password demasiado corta".
        • Si es un String y tiene 8 o más caracteres imprimirá:
        "Password segura".
        • Si no es un String imprimirá:
        "Formato de password no válido"
        
         */
        return switch (pwd) {
            case String s when s.length() < 8 ->
            "Password demasiado corta";
             case String s when s.length() >= 8 ->
            "Password segura";
        case null -> "El valor es nulo";
        default -> "Formato de password no válido";
    };
    }

}
