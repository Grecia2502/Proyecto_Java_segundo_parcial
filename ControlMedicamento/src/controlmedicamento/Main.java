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

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //se agregan los objetos de cada clase y poder utilizarlas
        Inventario inventario = new Inventario();
        Compra compra = new Compra(inventario);
        Venta venta = new Venta(compra);
        Pago pago = new Pago();
        Scanner scanner = new Scanner(System.in);
        int cantidad = 0;

        // Agrega un inventario de medicamentos fijo
        inventario.agregarMedicamento(new Medicamento(1, "Paracetamol", 10.50, 100));
        inventario.agregarMedicamento(new Medicamento(2, "Ibuprofeno", 12.30, 50));
        inventario.agregarMedicamento(new Medicamento(3, "Amoxicilina", 10.50, 80));
        inventario.agregarMedicamento(new Medicamento(4, "Omeprazol", 35.50, 150));
        inventario.agregarMedicamento(new Medicamento(5, "Aspirina", 15.50, 60));
        inventario.agregarMedicamento(new Medicamento(6, "Loratadina", 20.80, 90));
        
        // Menú básico
        while (true) {
            System.out.println("\n1. Ver Inventario\n2. Comprar Medicamentos\n3. Realizar Venta\n4. Eliminar medicamento\n5. Salir");
             System.out.println("\nSeleccione la opcion deseada");
            int opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    inventario.listarMedicamentos();
                    break;
                case 2:
                    System.out.println("Ingrese el ID del medicamento a comprar:");
                    int id = scanner.nextInt();
                    System.out.println("Ingrese la cantidad:");
                    cantidad = scanner.nextInt();
                    compra.agregarAlCarrito(id, cantidad);
                    break;
                case 3:
                    compra.mostrarCarrito();
                    System.out.println("Ingrese el método de pago (efectivo/tarjeta):");
                    String metodoPago = scanner.next();
                    venta.realizarVenta(metodoPago,cantidad);
                    
                    break;
                case 4:
                    System.out.println("Ingrese el ID del medicamento que desee eliminar");
                     int idE = scanner.nextInt();
                    inventario.eliminarMedicamento(idE);
                    break;
                case 5:
                    System.out.println("Gracias por usar el sistema.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}

