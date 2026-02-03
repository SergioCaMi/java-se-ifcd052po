/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package localbusiness;

import javax.swing.JOptionPane;

/**
 *
 * @author Sergio
 */
public class Service {
    String nombre;
    String description;
    double price;
    int durationMinutes;
    
    public void displayService(){
        JOptionPane.showMessageDialog(null, this.nombre + ": " + this.description + " a un precio de "+ this.price + "€.");
    }
    
}
