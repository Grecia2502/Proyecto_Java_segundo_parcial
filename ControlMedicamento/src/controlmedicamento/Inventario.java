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

public class Inventario {
    private ArrayList<Medicamento> medicamentos; //agregamos un arraylist para guardar los medicamentos
    //el metodo inventario es publico para que las demas clases puedan entrar a la lista de medicamentos
    public Inventario() {
        medicamentos = new ArrayList<>();
    }

    // Altas (Agregar medicamento)
    //usamos el metodo agregar medicamentos que usa la clase medicamento para llenar los atributos
    //esto es un inventario ya predeterminado que se carga de la clase main asi que no le pide agregar al usuario
    public void agregarMedicamento(Medicamento medicamento) {
        medicamentos.add(medicamento);
        System.out.println("Medicamento agregado: " + medicamento);
    }

    // Bajas (Eliminar medicamento)
    //lo mismo que altas solo que esta vez elimina el medicamento
    public void eliminarMedicamento(int id) {
        //remueve del arraylist de medicamentos de acuerdo al id
        medicamentos.removeIf(med -> med.getId() == id);
        System.out.println("Medicamento eliminado.");
    }

    // Cambios (Actualizar stock)
    //esta funcion se utliza cuando usamos una compra resta lo que compramos al stock
    public void actualizarStock(int id, int nuevoStock) {
        for (Medicamento med : medicamentos) {
            if (med.getId() == id) {
                med.setStock(nuevoStock);
                System.out.println("Stock actualizado para: " + med.getNombre());
                return;
            }
        }
        System.out.println("Medicamento no encontrado.");
    }

    // Consultas (Ver todos los medicamentos)
    //imprime los medicamentos
    public void listarMedicamentos() {
        for (Medicamento med : medicamentos) {
            System.out.println(med);
        }
    }

    // Obtener medicamento por ID
    public Medicamento obtenerMedicamentoPorId(int id) {
        for (Medicamento med : medicamentos) {
            if (med.getId() == id) {
                return med;
            }
        }
        return null;
    }
}

    
