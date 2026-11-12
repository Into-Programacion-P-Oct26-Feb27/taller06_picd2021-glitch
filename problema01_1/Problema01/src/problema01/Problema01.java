/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class Problema01 {

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
        
        if (opcion< 1 || opcion > 6){
        System.out.println("operación no valida");
        }else {
            if (num2 > num1){
            System.out.println("No es posible realizar la opración solicitada");
            }else{
                if (opcion == 1) {
                    respuesta = num1 + num2;
                    operacion = "Suma";
                }else {
                    if (opcion==2){
                        respuesta = num1 - num2;
                        operacion = "Resta";
                    }else{
                        if(opcion==3){
                            respuesta = num1 * num2;
                            operacion = "multiplicación";
                        }else{
                            if(opcion==4 && num2>0){
                                respuesta =num1 / num2;
                                operacion = "division;";
                            }else {
                                if(opcion == 5 && num2>0){
                                    respuesta = num1 % num2;
                                    operacion ="modulo (residuo de division)";
                                }else {
                                    if (opcion ==6){
                                        respuesta = Math.pow(num1,num2);
                                        operacion ="potencia";
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        
        
        System.out.printf("OPERACIONES ARITMÉTICAS\n" +
                            "\n" +
                            "Primer número: %f\n" +
                            "Segundo número: %f\n" +
                            "Operación seleccionada: %s\n" +
                            "\n" +
                            "Resultado: %f", num1, num2,operacion,respuesta);
        
        
            
        }
        
        
// 20
    }
    

