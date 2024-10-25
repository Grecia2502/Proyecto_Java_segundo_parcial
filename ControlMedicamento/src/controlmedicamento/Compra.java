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
import java.util.ArrayList;

// creamos la clase "compra" 
public class Compra {
    //declaramos las clases privadas y usaremos un "ARRAYLIST" para el control de las compras del usuario
    private ArrayList<Medicamento> carrito; 
    private Inventario inventario;
    
// El metodo compra usa el inventario para agregar en el arreglo carrito
    public Compra(Inventario inventario) {
        this.inventario = inventario;
        carrito = new ArrayList<>(); //se declara un nuevo arraylist para llevar el carrito de compras
    }

    
    //el metodo agregar al carro recibe el id y la cantidad que vas a comprar
    public void agregarAlCarrito(int id, int cantidad) {
        //utilizamos la clase de medicamento para entrar al modulo de inventario del objeto "medicamento"
        //donde lo buscaremos por el id capturado
        Medicamento medicamento = inventario.obtenerMedicamentoPorId(id);
        //validamos si el medicamento es diferente a nulo y que el getstock (obtener stock), sea mayor a la cantidad dada
        if (medicamento != null && medicamento.getStock() >= cantidad) {
            carrito.add(medicamento); //si se cumple la condicion agregamos el medicamento al arreglo carrito
            
            inventario.actualizarStock(id, medicamento.getStock() - cantidad); //usamos el metodo actualiza stock de la clase inventario
            //para que reste del stock la cantidad a comprar
            System.out.println(cantidad + " de " + medicamento.getNombre() + " agregado al carrito."); // imprime el carrito 
        } else {
            System.out.println("Stock insuficiente o medicamento no encontrado."); //Si la cantidad es mayor al stock no se podra completar la compra
        }
    }

    // Calcular total de la compra
    public double calcularTotal(int cantidad) {
        double total = 0;
        //recorre el arraylist de carrito para acumular el total a pagar  usando el objeto medicamento para obtener el precio
        for (Medicamento medicamento : carrito) {
            // "+=" funciona como acumulador 
            total += (medicamento.getPrecio() * cantidad);
        }
        return total; //regresamos el total una vez terminado el ciclo
    }

    // Mostrar carrito de compra
    public void mostrarCarrito() {
        //recorre el arraylist carrito y solo imprime el objeto "medicamento"
        for (Medicamento medicamento : carrito) {
            System.out.println(medicamento);
        }
    }
}

    

