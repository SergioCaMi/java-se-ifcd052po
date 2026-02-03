
package localbusiness;

/**
 *
 * Un negocio local, Peluquería "Style & Cut", gestiona sus citas en papel.
 * Necesitan una estructura orientada a objetos que permita registrar Clientes,
 * los Servicios que ofrecen y las Citas programadas.
 *
 * @author Sergio
 */
public class LocalBusiness {


    public static void main(String[] args) {
        //Servicio
        Service s1 = new Service();
        s1.description = "Corte de Pelo";
        s1.price = 20.0;
        s1.durationMinutes = 30;

        Service s2 = new Service();
        s2.description = "Tinte";
        s2.price = 40.0;
        s2.durationMinutes = 60;

        //Cliente
        Customer vipClient = new Customer();
        vipClient.nombre = "Sergio";
        vipClient.phoneNumber = "600112233";
        vipClient.isVip = true;

        //Cita 1 - Corte de Pelo
        Appointment cita1 = new Appointment();
        cita1.id = 1;
        cita1.date = "2024-05-20";
        cita1.client = vipClient;
        cita1.bookedService = s1;
        cita1.printTicket();

        //Cita 2 - Tinte
        Appointment cita2 = new Appointment();
        cita2.id = 2;
        cita2.date = "2024-05-21";
        cita2.client = vipClient;
        cita2.bookedService = s2;
        cita2.printTicket();

        System.out.println("Confirmación enviada al teléfono: " + cita1.client.phoneNumber);
    }
}
