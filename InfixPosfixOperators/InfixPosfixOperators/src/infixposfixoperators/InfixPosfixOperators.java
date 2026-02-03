/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package infixposfixoperators;

/**
 *
 * @author Sergio
 */
public class InfixPosfixOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 10;
        int resultado = 10;
        //resultado = resultado + numero++; //post incremento => sucede después de la asignación.
        resultado = resultado + ++numero; //pre incremento => sucede antes de la asignación.
        
        System.out.println("Numero: "+numero);
        System.out.println("Resultado: "+resultado);
        
        
    }
    
}
