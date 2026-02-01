package ejercicios2;

import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

/**
 *
 * @author Sergio
 */
public class Ejercicios2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ej1();
        //ej2();
        //ej3();
        //ej4();
        mostrarTodasLasTablas();
        //ej5();
        //ej6();
        //ej7();
        //ej8();
        //ej9();
    }

    public static void ej1() {
        System.out.println("-----------------------------------------");
        System.out.println("Ejercicio 1");
        System.out.println("-----------------------------------------");
        /*
        Enunciado: Crea un programa que simule el control de acceso a una zona VIP.
1. Pide al usuario su edad y su nombre usando
JOptionPane.showInputDialog.
2. Si la edad es mayor o igual a 18, muestra un mensaje de bienvenida con
su nombre.
3. Si es menor, muestra un mensaje de acceso denegado.
Reto Extra:
Utiliza el operador ternario para decidir si el mensaje final será "Bienvenido"
o "Acceso denegado" en una sola línea de código antes de mostrarlo.
         */

        String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
        String inputEdad = JOptionPane.showInputDialog("Introduce tu edad");
        int edad = Integer.parseInt(inputEdad);
        String mensaje = (edad >= 18) ? "Bienvenid@ " + nombre + "!" : "Lo sentimos " + nombre + ", acceso denegado.";
        JOptionPane.showMessageDialog(null, mensaje);

    }

    public static void ej2() {
        System.out.println("-----------------------------------------");
        System.out.println("Ejercicio 2");
        System.out.println("-----------------------------------------");
        /*
Enunciado: Un sensor ha registrado las temperaturas de los últimos 7 días.
1. Crea un array de tipo double que contenga 7 valores (puedes inventarlos
o generarlos aleatoriamente entre 10.0 y 35.0).
2. Usa un bucle for para recorrer el array y calcular:
o La temperatura media de la semana.
o Cuántos días la temperatura fue superior a 25 grados.
3. Muestra ambos resultados por consola o ven una ventana emergente.
         */
        double temperaturas[] = new double[7];
        int totalTemperaturas = 0;
        float media = 0f;
        int mas25 = 0;
        String temperaturaSemanal = "";
        for (int t = 0; t < temperaturas.length; t++) {
            temperaturas[t] = ThreadLocalRandom.current().nextInt(-20, 40 + 1);
            if (temperaturas[t] > 25) {
                mas25++;
            }
            totalTemperaturas += temperaturas[t];
            temperaturaSemanal += " / " + temperaturas[t] + "ºC";
        }
        media = totalTemperaturas / 7;
        JOptionPane.showMessageDialog(null, "La media de temperaturas de los ultimos 7 días es de " + media + ". " + mas25 + " días hemos sobrepasado los 25ºC. => " + temperaturaSemanal);

    }

    public static void ej3() {
        System.out.println("-----------------------------------------");
        System.out.println("Ejercicio 3");
        System.out.println("-----------------------------------------");
        /*
Enunciado: Imagina que recibes un array de números que representan códigos
de acceso:
int[] codigos = {120, 45, 1024, 9, 550, 88};.
1. Recorre el array con un bucle.
2. Si el número es par y mayor que 100, imprime: "Código [valor]
ACEPTADO".
3. En cualquier otro caso, imprime: "Código [valor] RECHAZADO".
Pista: Recuerda usar el operador módulo % para saber si un número es par.        
         */
        int codigos[] = new int[6];
        String mensaje = "";
        for (int c = 0; c < codigos.length; c++) {
            codigos[c] = ThreadLocalRandom.current().nextInt(1, 501);
        }
        for (int codigo : codigos) {
            mensaje = ((codigo % 2 == 0) && (codigo > 100)) ? "Codigo " + codigo + " ACEPTADO" : "Codigo " + codigo + " RECHAZADO";
            JOptionPane.showMessageDialog(null, mensaje);

        }

    }

    public static void ej4() {
        System.out.println("-----------------------------------------");
        System.out.println("Ejercicio 4");
        System.out.println("-----------------------------------------");
        /*
 Enunciado:
1. Pide al usuario un número entero entre 1 y 10.
2. Muestra mediante un bucle for la tabla de multiplicar de ese número en la
consola (ejemplo: "5 x 1 = 5", "5 x 2 = 10"...).
3. Extra: En lugar de imprimir 10 líneas separadas, intenta construir un único
String que contenga toda la tabla (usando saltos de línea \n) y muéstralo
en un sólo JOptionPane.showMessageDialog.
Reto Extra:
Muestra las tablas de multiplicar del 1 al 10 en formato tabular utilizando printf       
         */
        String numeroUsuario = JOptionPane.showInputDialog("Introduce un número entre 1 y 10");
        int numero = Integer.parseInt(numeroUsuario);
        JOptionPane.showMessageDialog(null, mostrarTabla(numero));

        String todasLasTablas = "";
        for (int i = 1; i <= 10; i++) {
            todasLasTablas += mostrarTabla(i) + "\n";
        }
        JOptionPane.showMessageDialog(null, todasLasTablas);
    }

    public static String mostrarTabla(int numero) {
        String tabla = "";
        for (int num = 1; num <= 10; num++) {
            tabla += String.format("%d x %d = %d\n", numero, num, (numero * num));
        }
        return tabla;
    }

public static void mostrarTodasLasTablas() {
        String tabla = "";
            int i = 1;
        for (int num = 1; num <= 10; num++) {
                tabla += String.format("%-4d x %-4d = %-4d %-4d x %-4d = %-4d %-4d x %-4d = %-4d\n",
                        i, num, (i * num),
                        i + 1, num, ((i+1) * num),
                        i + 2, num, ((i+2) * num),
                        i + 3, num, ((i+3) * num),
                        i + 4, num, ((i+4) * num),
                        i + 5, num, ((i+5) * num),
                        i + 6, num, ((i+6) * num),
                        i + 7, num, ((i+7) * num),
                        i + 8, num, ((i+8) * num),
                        i + 9, num, ((i+9) * num),
                        i + 10, num, ((i+10) * num)
                        
                );
            }
        
        JOptionPane.showMessageDialog(null, tabla);
    }  
    

    public static void ej5() {
        System.out.println("-----------------------------------------");
        System.out.println("Ejercicio 5");
        System.out.println("-----------------------------------------");
        /*
  Enunciado:
Una universidad otorga becas según el promedio y la edad.
1. Pide al usuario su promedio (0.0 a 10.0) y su edad por JOptionPane.
2. Las reglas son:
o Beca de Excelencia: Promedio >= 9.0 y edad <= 25.
o Beca de Apoyo: Promedio entre 7.5 y 8.9 (inclusive) o edad >=
25 con promedio >= 8.0.
o Sin Beca: Cualquier otro caso.
3. Usa estructuras if / else if / else para determinar qué beca le
corresponde y muéstralo en un mensaje.      
         */
        String inputEdad = JOptionPane.showInputDialog("Introduce tu promedio");
        int edad = Integer.parseInt(inputEdad);

    }

    public static void ej6() {
        System.out.println("-----------------------------------------");
        System.out.println("Ejercicio 6");
        System.out.println("-----------------------------------------");
        /*
Enunciado:
Crea un array con los nombres de 5 objetos del inventario de un guerrero:
String[] inventario = {"Espada", "Escudo", "Poción", "Capa", "Anillo"};
1. Pide al usuario mediante showInputDialog el nombre de un objeto para
buscar.
2. Recorre el array con un bucle for para verificar si el objeto existe.
3. Si lo encuentra, muestra: "Objeto [nombre] encontrado en el hueco
[índice]".
4. Si termina el bucle y no lo encontró, muestra: "El objeto no está en el
inventario".
Pista:
Necesitarás una variable boolean encontrada que cambie a true si hay
coincidencia.        
         */
    }

    public static void ej7() {
        System.out.println("-----------------------------------------");
        System.out.println("Ejercicio 7");
        System.out.println("-----------------------------------------");
        /*
 Enunciado:
Un héroe y un monstruo se enfrentan. Ambos empiezan con 100 puntos de
vida.
1. En cada turno del bucle while (mientras ambos tengan vida $> 0$):
o El héroe quita al monstruo un número aleatorio entre 5 y 15.
o El monstruo quita al héroe un número aleatorio entre 7 y 12.
2. El programa debe imprimir en cada turno la vida restante de ambos.
3. Al final, usa un if para anunciar quién ganó o si hubo un empate
técnico (ambos mueren a la vez).       
         */
    }

    public static void ej8() {
        System.out.println("-----------------------------------------");
        System.out.println("Ejercicio 8");
        System.out.println("-----------------------------------------");
        /*
Enunciado:
Crea un programa que permita a un usuario introducir 5 precios de productos
uno por uno.
1. Almacena los precios en un array de double.
2. Si el usuario introduce un número negativo, el programa debe mostrar
un error y volver a pedir ese mismo precio (usa un bucle while para
validar la entrada antes de pasar al siguiente índice).
3. Al finalizar, calcula el total de la compra y aplícale un descuento del
10% si el total supera los 100€.        
         */
    }

    public static void ej9() {
        System.out.println("-----------------------------------------");
        System.out.println("Ejercicio 8");
        System.out.println("-----------------------------------------");
        /*
Enunciado:
Genera un array de 10 números aleatorios que representen el daño de 10
ataques (rango de 1 a 100).
1. Un ataque se considera "Crítico" si el daño es mayor de 85.
2. Recorre el array y:
o Muestra todos los daños generados.
o Cuenta cuántos críticos hubo en total.
o Suma sólo el daño de los ataques que no fueron críticos.
3. Muestra el resumen final al usuario.
         */
    }

}
