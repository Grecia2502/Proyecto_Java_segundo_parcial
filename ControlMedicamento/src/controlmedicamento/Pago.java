/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// --------------------------------------------- // 
// ------------------ EQUIPO ------------------- //
// ----- DANIELA ALESSANDRA AGUIRRE GARCIA ----- //
// -------- LEITHIAN NATHAN ALEJO MEJIA -------- //
// -------- GRECIA JAZMIN RAMOS GONZALEZ ------- //
// LEONARDO TEOTIHUACAN MARTIN DEL CAMPO VAZQUEZ //
// --------------------------------------------- //

package controlmedicamento;


public class Pago {
    public static void procesarPago(double cantidad, String metodo) {
        if (metodo.equalsIgnoreCase("efectivo")) {
            System.out.println("Pago en efectivo procesado por $" + cantidad);
        } else if (metodo.equalsIgnoreCase("tarjeta")) {
            System.out.println("Pago con tarjeta procesado por $" + cantidad);
        } else {
            System.out.println("Método de pago no reconocido.");
        }
    }
}
    

