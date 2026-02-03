
package test;

public class InicializacionesDeVariables {
    
    public static int numeroEnteroNivelClase; //asume un valor por defecto automáticamente
    //las variables que asumen valor por defecto son las que declaramos en el ambito de clase
    //ya sean variables estáticas o de instancia
    public static void main(String[] args) {
        //public int numeroEnteroNivelLocalMetodo; //Necesita forzosamente inicializarse
        System.out.println(numeroEnteroNivelClase);
    }
    
}
