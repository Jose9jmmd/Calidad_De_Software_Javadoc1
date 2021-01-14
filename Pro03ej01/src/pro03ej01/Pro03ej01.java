/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro03ej01;

import Sleer2.SLeer2;

/**
 * Programa en el que insertas una serie de número, y te dice cuál es el mayor y
 * cual es el menor de los numero insertados, además, también te dice que números 
 * son iguales.
 * @author Jose Manuel Martinez Deltell
 * @version 1.0.0
 * @since 14/01/2021
 */
public class Pro03ej01 {

    /**
     * Este método te dice de los tres números insertados, cual es el mayor,
     * y también si no es mayor te dice cuáles de ellos son iguales.
     * @param a este es el primer número a comparar con las siguientes variables.
     * @param b este es el segundo número.
     * @param c este es el tercer número y último.
     * @return este método obtendrá como resultado la variable text.
     */
    
    public static String Mayor(int a, int b, int c){
        String text = null;
         if (a > b && a > c){
                text="\n\t" + a + " es mayor";
            }else if(b > a && b > c){
                text="\n\t" + b + " es mayor";
            }else if(c > a && c > b){
                text="\n\t" + c + " es mayor";
            }else if(a == b && a == c && b == c){
                text="\n\tLos numero son iguales";
            }else if (a == b && a != c){
                text="\n\tHay dos " + a + " iguales";
            }else if(b != a && b == c){
                text="\n\tHay dos " + b + " iguales";
            }else if(c == a && c != b){
                text="\n\tHay dos " + c + " iguales";
            }
         return text;
    }
    
    /**
     * Este método te dice de los tres números insertados, cual es el menor,
     * y también si no es mayor te dice cuáles de ellos son iguales, este fragmento
     * de código se repite, por si hay un número mayor a los otros dos números iguales 
     * que son menores, y que a la hora de mostrar el resultado se vea bonito.     
     * @param a este es el primer número a comparar con las siguientes variables.
     * @param b este es el segundo número.
     * @param c este es el tercer número y último.
     * @return este método obtendrá como resultado la variable text.
     */
    
    public static String Menor(int a, int b, int c){
        String text = null;
         if (a < b && a < c){
                text="\n\t" + a + " es menor";
            }else if(b < a && b < c){
                text="\n\t" + b + " es menor";
            }else if(c < a && c < b){
                text="\n\t" + c + " es menor";
            }else if (a == b && a != c){
                text="\n\tHay dos " + a + " iguales";
            }else if(b != a && b == c){
                text="\n\tHay dos " + b + " iguales";
            }else if(c == a && c != b){
                text="\n\tHay dos " + c + " iguales";
            }
         return text;
    }
   
    /**
     * En el main, creamos las variables, donde más tarde introduciremos los números.
     * Además, este programa se va a ejecutar tantas veces como quieras, ya que 
     * te realiza una pregunta, de si quieres volver a repetir el programa con otros números,
     * o finalizar, tecleando un numero en específico. 
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,c;
        
        System.out.print("\nIntroduce un numero(Introduce 0 para salir): ");
        a = SLeer2.datoInt();
        
        while(a != 0){
            System.out.print("\nIntroduce un numero: ");
            b = SLeer2.datoInt();
            System.out.print("\nIntroduce un numero: ");
            c = SLeer2.datoInt();
            
            System.out.println(Mayor(a,b,c));
            System.out.println(Menor(a,b,c));
            
            System.out.print("\nIntroduce un numero(Introduce 0 para salir): ");
            a = SLeer2.datoInt();
        }
        
        System.out.println("\n\tFin del programa.");
    }
    
}
