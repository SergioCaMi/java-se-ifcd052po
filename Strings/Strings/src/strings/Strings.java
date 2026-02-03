
package strings;

/**
 *
 * @author Sergio
 */
public class Strings {


    public static void main(String[] args) {
       String s1 = "Hola Mundo!";
       String s2 = "Hola Mundo!";
       
       //Maña practica!!!!!!
       String s3 = new String("Hola Mundo!");//llamada al contructor de la clase String
       
       //Los Strings son valores constantes, y crea un objeto por cada valor. Cuando se cambia
       //de valor, se referencia a otro nuevo objeto y los que se quedan sin referenciar, se 
       //convierten en basura y JAVA lo limpiará. Hay que ser responsable con los Strings.
       
        if (s1.equals(s2)) {
            System.out.println("Los Strings SI coinciden por valor");
        } else 
        {
            System.out.println("Los Strings NO coinciden por valor");
        }

        if (s1==s2) {
            System.out.println("Los Strings SI referencian el mismo objeto");
        } else 
        {
            System.out.println("Los Strings NO referencian el mismo objeto");
        }
        
        
       
       
    }
    
}
