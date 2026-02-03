/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package localbusiness;

/**
 *
 * @author Sergio
 */
public class Appointment {
   
    public int id;
    public String date;
    
    public Customer client; 
    public Service bookedService;

    public double calculateFinalPrice() {
        double price = bookedService.price; 
             
        if (client.isVip) {
            return price * 0.90; 
        }
        return price;
    }
    
    public void printTicket() {
        System.out.println("======= TICKET DE CITA =======");
        System.out.println("ID Cita: " + id);
        System.out.println("Fecha: " + date);
        System.out.println("Cliente: " + client.nombre); 
        System.out.println("Servicio: " + bookedService.description);
        System.out.println("Precio final: " + calculateFinalPrice() + "€");
        System.out.println("==============================");
    }
}