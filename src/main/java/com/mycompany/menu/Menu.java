/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.menu;


/**
 *
 * @author HP
 */
public class Menu {

    public static void main(String[] args) {
        bucle();
    }

    public static void menu(){
    Funciones Fun = new Funciones();
    int opcion = Fun.leernumero();
    System.out.println("==========================");

    switch (opcion){
        case 1:
            System.out.println("1. suma de los numero anteriores a  un numero");            
            int r = Fun.leernumero();
            System.out.println(Fun.uno(r));
            break;
        case 2:
            System.out.println("2. factorial de un numero");
            int r2 = Fun.leernumero();
            System.out.println(Fun.doss(r2));
            break;
        case 3:
            System.out.println("3. la potencia de un numero");
            System.out.println("nesecitamos una base");
            int r3 = Fun.leernumero();
            System.out.println("nesecitamos un exponente");
            int r3b = Fun.leernumero();
            System.out.print("RESPUESTA: ");
            System.out.println(Fun.tres(r3,r3b));
            break;
        case 4:
            int r4 = Fun.leernumero();
            System.out.print("RESPUESTA: ");
            System.out.println(Fun.cuatro(r4));
            break;
        case 5:
            System.out.println("5. verificar si un ano es biciesto");
            int r5 = Fun.leernumero();
            System.out.print("RESPUESTA: ");
            System.out.println(Fun.cinco(r5, 1));
            break;

        case 6:
            System.out.println("6. verificar si un numero es primo(recursivo)");
            int r6= Fun.leernumero();
            System.out.print("RESPUESTA: ");
            System.out.println(Fun.primo(Fun.seis(r6, 1, 0)));
            break;
        case 7:
            System.out.println("7. verificar si un ano es biciesto(recursivo)");
            int r7 = Fun.leernumero();
            System.out.print("RESPUESTA: ");
            System.out.println(Fun.esbiciesto(Fun.nueve(r7)));
            break;
        case 8:
            System.out.println("8. suma de los numeros pares hasta un numero");
            int r8 = Fun.leernumero();
            System.out.print("RESPUESTA: ");
            System.out.println(Fun.ocho(r8));
            break;
        case 9:
            System.out.println("9. suma de los digitos de un numero");
            int r9 = Fun.leernumero();
            System.out.print("RESPUESTA: ");
            System.out.println(Fun.nueve(r9));
            break;
        default:
            System.out.println("intente de nuevo");

        }
    }
    public static void bucle(){
    Funciones Fun = new Funciones();
    int estar = 0;
    while(estar != 1){
        System.out.println("===============================================");
        System.out.println("1. suma de los numero anteriores a  un numero");
        System.out.println("2. factorial de un numero");
        System.out.println("3. la potencia de un numero");
        System.out.println("4. verificar si un numero es primo");
        System.out.println("5. verificar si un ano es biciesto");
        System.out.println("6. verificar si un numero es primo(recursivo)");
        System.out.println("7. verificar si un ano es biciesto(recursivo)");
        System.out.println("8. suma de los numeros pares hasta un numero");
        System.out.println("9. suma de los digitos de un numero");
        menu();
        System.out.println("=========================");
        System.out.println("aprete 1 para salir");
        estar = Fun.leernumero();
        }
    }
}
            
        
        
    

