/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema01;

/**
 *
 * @author VEL-USER
 */
public class Productos {

    public double precioProducto;
    public int cantidadProductos;
    public double precioFinal;

    public Productos(double precioProducto, int cantidadProductos) {
        this.precioProducto = precioProducto;
        this.cantidadProductos = cantidadProductos;

    }

    public void calcularPrecioFinal() {
        this.precioFinal = this.cantidadProductos * this.precioProducto;
    }

    public void calcularDescuento() {
        if ((precioProducto >= 1000) && (cantidadProductos >= 10)) {
            precioFinal *= 0.9;
        } else if (precioProducto < 1000) {
            precioFinal *= 0.95;
        }
    }

    @Override
    public String toString() {
        return "FACTURA:\n" + "Precio del Producto = " + precioProducto + ",\nCantidad de Productos = " + cantidadProductos + ",\nPrecio Final = " + precioFinal;
    }

  
   
}