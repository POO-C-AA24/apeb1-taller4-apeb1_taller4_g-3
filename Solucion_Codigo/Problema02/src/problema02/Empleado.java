/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema02;

/**
 *
 * @author VEL-USER
 */
public class Empleado {
    public String nombreEmpleado;
    public double sueldoEmpleado;
    public int edadEmpleado;
    public int opc;
    public double aumento;
    public double sueldoFinal;
    public double promedioSueldo;

    public Empleado(String nombreEmpleado, double sueldoEmpleado, int edadEmpleado,int opc,double aumento) {
        this.nombreEmpleado = nombreEmpleado;
        this.sueldoEmpleado = sueldoEmpleado;
        this.edadEmpleado = edadEmpleado;
        this.opc = opc;
        this.aumento = aumento;
    }
    public void PromedioSueldos(){
        promedioSueldo += sueldoEmpleado/opc;
    }
    public void AumentoSalario(){
        if (sueldoEmpleado < promedioSueldo){
            sueldoFinal = sueldoEmpleado + (aumento/100);
        }else{
            sueldoFinal = sueldoEmpleado;
        }
    }

    @Override
    public String toString() {
        return "Empleado" + "/nNombre del Empleado= " + nombreEmpleado + ",\nSueldo del Empleado= " + sueldoEmpleado + ",\nEdad del Empleado=" + edadEmpleado + "\nSueldo Final del Empleado" + sueldoFinal;
    }
    
}

