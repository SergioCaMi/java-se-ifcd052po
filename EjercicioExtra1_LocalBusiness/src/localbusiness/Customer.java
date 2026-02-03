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
public class Customer {

    boolean isVip;
    String nombre;
    String phoneNumber;

    public void displayCustomer() {
        JOptionPane.showMessageDialog(null, "Nombre: " + this.nombre + "\nTelefono: " + this.phoneNumber + "\nEs VIP: " + this.isVip);
    }
}
