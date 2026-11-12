/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author picd
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int tipo;
        String nombre;
        int aniosServicio;
        double sueldoInicial;
        String porcentaje;
        double incremento;
        double bonificacion;
        double nuevoSueldo;
        
        
        
        
        System.out.println("Ingrese su nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su tipo de empleado\n"+
                "1      \n" +
                "2	\n" +
                "3	\n" +
                "4	\n"+
                "5      \n");
        tipo = entrada.nextInt();
        System.out.println("Ingrese sus años de servicio");
        aniosServicio = entrada.nextInt();
        
        System.out.println("Ingrese su sueldo inicial");
        sueldoInicial = entrada.nextDouble();
        
        switch(tipo){
            case 1:
                porcentaje = "5";
                incremento = sueldoInicial*0.05;
                break;
            case 2:
                porcentaje = "7";
                incremento = sueldoInicial*0.07;
                break;
            case 3:
                porcentaje = "9";
                incremento = sueldoInicial*0.09;
                break;
            case 4:
                porcentaje = "12";
                incremento = sueldoInicial*0.12;
                break;
            default:    
                porcentaje = "15";
                incremento = sueldoInicial*0.015;
                break;
            
        }
        
        if (aniosServicio < 2){
            bonificacion = 0;
        }else {
            if(aniosServicio >=2 && aniosServicio < 5){
                bonificacion = 30;
            }else {
                if(aniosServicio>=5 && aniosServicio <10 ){
                    bonificacion = 60;
                }else {
                    bonificacion = 100;
                }
            }
        }
        
        nuevoSueldo = sueldoInicial + incremento + bonificacion;
        
        
      System.out.printf("REPORTE DE INCREMENTO SALARIAL\n" +
        "\n" +
        "Empleado: %s\n" +
        "Tipo de empleado: %d\n" +
        "Años de servicio: %d\n" +
        "\n" +
        "Sueldo inicial: $%.2f\n" +
        "Porcentaje de incremento: %s%%\n" +
        "Incremento salarial: $%.2f\n" +
        "Bonificación por antigüedad: $%.2f\n" +
        "\n" +
        "Nuevo sueldo: $%.2f",nombre, tipo,aniosServicio,sueldoInicial,
        porcentaje, incremento, bonificacion, nuevoSueldo);
      
    }
    
}
