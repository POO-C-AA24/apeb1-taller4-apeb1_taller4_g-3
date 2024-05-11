/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author VEL-USER
 */
public class TestEmpleado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Empleado> empleados = new ArrayList<>();

        System.out.println("Deme el nombre, salario y edad del Empleado :");
        for (int i = 0; i < 3; i++) {
            System.out.print("Empleado " + (i + 1) + ": ");
            String nombre = scanner.next();
            double salario = scanner.nextDouble();
            int edad = scanner.nextInt();
            Empleado empleado = new Empleado(nombre, salario, edad);
            empleados.add(empleado);
        }

        System.out.println("\nInformación de los empleados:");
        for (Empleado empleado : empleados) {
            empleado.mostrarInformacion();
            System.out.println();
        }
        System.out.print("Ingrese el porcentaje de aumento salarial: ");
        double porcentajeAumento = scanner.nextDouble();
        double salarioTotal = 0;
        for (Empleado empleado : empleados) {
            salarioTotal += empleado.getSalario();
        }
        double salarioPromedio = salarioTotal / empleados.size();

        System.out.println("\nNuevos salarios después del aumento:");
        for (Empleado empleado : empleados) {
            if (empleado.getSalario() < salarioPromedio) {
                empleado.aumentarSalario(porcentajeAumento);
                empleado.mostrarInformacion();
                System.out.println();
            }
        }
    }
}
