/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplosswaitchcase;

/**
 *
 * @author Sergio
 */
public class EjemplosSwaitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        testSwitchCaseTradicionalBrake();
//        testSwitchCaseTradicionalSinBrake();
//        testExpresionesSwitch();
//        System.out.println(returnTypeOfDay(3));
        testGuardConditions();
    }

    public static void testSwitchCaseTradicionalBrake() {
        int dayNum = 6;
        String dayName;

        switch (dayNum) {
            case 1:
                dayName = "Lunes";
                break;
            case 2:
                dayName = "Martes";
                break;
            case 3:
                dayName = "Miércoles";
                break;
            case 4:
                dayName = "Jueves";
                break;
            case 5:
                dayName = "Viernes";
                break;
            case 6:
                dayName = "Sábado";
                break;
            case 7:
                dayName = "Domingo";
                break;
            default:
                dayName = "Día no válido";
                // El break en el default es opcional pero se suele poner por orden
                break;
        }

        // Es vital imprimir o usar la variable después del switch
        System.out.println("El día seleccionado es: " + dayName);
    }

    public static void testSwitchCaseTradicionalSinBrake() {
        int dayNum = 6;
        String dayName;

        switch (dayNum) {
            case 1:

            case 2:

            case 3:

            case 4:

            case 5:
                dayName = "Día Laborable";
                break;
            case 6:

            case 7:
                dayName = "Fin de semana";
                break;
            default:
                dayName = "Día no válido";
                // El break en el default es opcional pero se suele poner por orden
                break;

        }
        System.out.println(dayName);
    }

    public static void testExpresionesSwitch() {
        int dayNum = 3;
        String typeOfDay = switch (dayNum) {
            case 6, 7 ->
                "Weekend";
            case 1, 2, 3, 4, 5 ->
                "Weekday";
            default ->
                "Invalid day";
        };
    }

    public static String returnTypeOfDay(int dayNum) {
// We can return the result directly
// from the switch expression
        return switch (dayNum) {
            case 1, 7 ->
                "Weekend";
            case 2, 3, 4, 5, 6 ->
                "Weekday";
            default ->
                "Invalid day number";
        };
    }

public static void testGuardConditions() {
    
        Integer dayNum = 2; // Martes
        boolean isHoliday = true;
        
        String result = switch (dayNum) {
            
            // Guarded pattern:
            // checks the number AND the boolean condition
            case Integer n when isHoliday -> "vacaciones (dia laborable)";
            case Integer n when !isHoliday -> "vacaciones (fin de semana)";
            
            // We still covering standard cases
            case 6, 7 ->  "dia laborable";
            case 1, 2, 3, 4, 5 ->  "fin de semana";
                
            // cualquier otro caso    
            default -> "dia invalido";
        };
    }


    public static void testPatternMatching() {

        Object obj = new String("Hola");

        switch (obj) {
            case String s -> // implicit casting
                System.out.println("The length of the String is " + s.length());
            case Integer i -> // implicit casting
                System.out.println("The square of the Integer value is " + (i * i));
            case null -> // avoid NullPointerException
                System.out.println("null value!");
            default -> // cover all other cases 
                System.out.println("Unknown type: " + obj.getClass().getName());
        }

    }
    
    public static void testYield(String[] args) {
    int dia = 3;

        String nombreDia = switch (dia) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> {
                System.out.println("Mitad de la semana");            
                yield "Miércoles"; // esta instruccion sera el valor realmente asignado
            }
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6, 7 -> "Fin de semana";
            default -> throw new IllegalArgumentException("Día inválido");
        };
        
    }
    
    
    
    
    
    
}
