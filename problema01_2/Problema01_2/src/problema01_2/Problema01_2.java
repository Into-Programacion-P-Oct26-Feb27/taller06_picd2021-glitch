/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01_2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class Problema01_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int opcion;
        double num1 = 0;
        double num2 = 0;
        double respuesta = 0;
        String operacion;
        operacion = "ninguna";
        System.out.println("Ingrese la opción de operación.\n"
                + "1 suma\n"
                + "2 resta\n"
                + "3 mutiplicación\n"
                + "3 division\n"
                + "4 módulo(residuo de division\n"
                + "6 potencia\n");
        opcion = entrada.nextInt(); // 4
        
        System.out.println("Ingrese el primer numero(mayor primero)");
        num1 = entrada.nextDouble();
        System.out.println("Ingrese el segundo numero");
        num2 = entrada.nextDouble();
        
        switch (opcion){
            case 1:
                respuesta = num1 + num2;
                operacion ="Suma";
                break;
            case 2:
                respuesta = num1 - num2;
                operacion = "Resta";
                break;
            case 3:
                respuesta = num1 * num2;
                operacion = "multiplicación";
                break;
            case 4:
                if(opcion==4 && num2>0){
                                respuesta =num1 / num2;
                                operacion = "division;";
                break;
                }else {
                    System.out.println("No se puede dividir para 0");
                    break;
                }
            case 5:
                if(opcion == 5 && num2>0){
                                    respuesta = num1 % num2;
                                    operacion ="modulo (residuo de division)";
                break;
                }else {
                    System.out.println("No se puede dividir para 0");
                    break;
                }
            case 6:
                respuesta = Math.pow(num1,num2);
                operacion ="potencia";
                
            default:
                System.out.println("operación no válida");
                break;       
        }
        System.out.printf("OPERACIONES ARITMÉTICAS\n" +
                            "\n" +
                            "Primer número: %f\n" +
                            "Segundo número: %f\n" +
                            "Operación seleccionada: %s\n" +
                            "\n" +
                            "Resultado: %f", num1, num2,operacion,respuesta);
        
    }
    
}
