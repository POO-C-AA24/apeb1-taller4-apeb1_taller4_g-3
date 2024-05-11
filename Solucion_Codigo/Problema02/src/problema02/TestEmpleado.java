/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Scanner;

/**
 *
 * @author VEL-USER
 */
public class TestEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.println("Cuantos empleado va a ingresar?");
        int opc = tc.nextInt();
        Empleado arrayEmpleados[] = new Empleado[opc];
        while (true) {
            System.out.println("Ingrese el nombre, sueldo, edad del Empleado y porcentaje de aumento salarial");
            arrayEmpleados[opc] = new Empleado(tc.nextLine(), tc.nextDouble(), tc.nextInt(),opc,tc.nextDouble());
            opc++;
            if (opc >= arrayEmpleados.length) {
                break;
            }
        }
        System.out.println("LISTA DE EMPLEADOS");
        for (Empleado empleados :arrayEmpleados ){
            System.out.println(empleados);
        }
    }
}
