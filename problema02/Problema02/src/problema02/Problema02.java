/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String nombre;
        int tipo;
        String tipoV;
        double avaluo;
        double peaje = 0;
        double cargo;
        double total;
        
        System.out.println("Ingrese su nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su tipo de vehículo\n "+
                "1       Vehículo liviano particular\n" +
                "2	Vehículo grande particular\n" +
                "3	Taxi\n" +
                "4	Bus urbano\n ");
        tipo = entrada.nextInt();
        
        System.out.println("Ingrese el avaluo comercial de su auto");
        avaluo = entrada.nextDouble();
        
        switch (tipo){
            case 1: 
                if (avaluo>30000){
                    cargo = 1.5;
                    peaje = 2;
                    tipoV ="Vehículo liviano particular";
                    break;
                }else{
                     peaje = 2;
                cargo = avaluo * 0.01;
                tipoV ="Vehículo liviano particular";
                break;
                
                }
               
            case 2:
                if (avaluo>30000){
                    cargo =1.5;
                    peaje= 2.5;
                    tipoV="Vehículo grande particular";
                    break;
                }else{
                    peaje= 2.5;
                    cargo = avaluo*0.02;
                    tipoV="Vehículo grande particular";
                }
                break;
                
                
            case 3:
                peaje=1.5;
                cargo =  avaluo*0.04;
                tipoV ="Taxi";
                break;
            case 4:
                peaje = 2.2;
                cargo = avaluo * 0.05;
                tipoV ="Bus urbano";
                break;
            default:
                peaje = 0;
                cargo = 0;
                tipoV ="Vehiculo no valido";
                break;
                
        }
        total = peaje + avaluo;
        
        System.out.printf("Peaje \"Buena Vía\"\n" +
            "Propietario: %s\n" +
            "Tipo: %s\n" +
            "    Avalúo: $%.2f\n" +
            "    Valor base del peaje: $%.2f\n" +
            "    Recargo: $%.2f\n" +
            "\n" +
            "    Total a cancelar: $%.2f",nombre, tipoV,avaluo,
            peaje,
            cargo,
            total);
        
        
    }
    
}
