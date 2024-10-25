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
//la clase base de medicamentos donde tenemos los atributos principales (ID, precio, nombre y stock)
public class Medicamento {
    private int id;
    private String nombre;
    private double precio;
    private int stock;
    //el constructor medicamento es publico para que las demas clases puedan leer sus atributos 
    public Medicamento(int id, String nombre, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Getters y Setters
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }
    //la instruccion "OVERRIDE" sirve para que cada invocacion sobreescriba la peticion anterior sin crear basura para el sistema
    @Override
    //"TOSTRING" regresa los valores de formato string
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Precio: $" + precio + ", Stock: " + stock;
    }
}

    

