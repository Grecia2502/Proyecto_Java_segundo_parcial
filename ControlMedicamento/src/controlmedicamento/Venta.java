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

public class Venta {
    private Compra compra;
    //lo ponemos publico para que las demas clases puedan llamarla
    public Venta(Compra compra) {
        this.compra = compra;
    }

    // Finalizar venta con método de pago
    //usando la clase compra calcula el total con el metodo calcula total
    public void realizarVenta(String metodoPago, int cantidad) {
        double total = compra.calcularTotal(cantidad);
        System.out.println("Total a pagar: $" + total);
        System.out.println("Método de pago: " + metodoPago);
        System.out.println("Venta realizada con éxito.");
    }
}

    
