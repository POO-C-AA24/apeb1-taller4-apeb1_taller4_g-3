/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Scanner;

/**
 *
 * @author VEL-USER
 */
public class Venta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto");
        double producto = tc.nextDouble();
        System.out.println("Ingrese la cantidad del producto");
        int precioProducto = tc.nextInt();
        Productos productoNuevo = new Productos(producto,
                precioProducto);
        productoNuevo.calcularPrecioFinal();
        productoNuevo.calcularDescuento();
        System.out.println(productoNuevo);

    }

}
