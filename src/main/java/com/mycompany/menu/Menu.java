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
        System.out.println("Hello World!");
        menu();
    }
    
    public void bucle(){
    Funciones Fun = new Funciones();
    int estar = 1;
    while(estar != 1){
        System.out.println("aprete 1 para salir");
        estar = Fun.leernumero();
        }
    }
    
    public static void menu(){
    Funciones Fun = new Funciones();
    switch (Fun.leernumero()){
        case 1:
            int r = Fun.leernumero();
            System.out.println(Fun.uno(r));
            break;
        case 2:
            int r2 = Fun.leernumero();
            System.out.println(Fun.doss(r2));
            break;
        case 3:
            int r3 = Fun.leernumero();
            int r3b = Fun.leernumero();
            System.out.println(Fun.tres(r3,r3b));
            break;
        case 4:
            int r4 = Fun.leernumero();
            System.out.println(Fun.cuatro(r4));
            break;
        case 5:
            int r5 = Fun.leernumero();
            System.out.println(Fun.cinco(r5, 1));
        case 6:
            int r6= Fun.leernumero();
            System.out.println(Fun.primo(Fun.seis(r6, 1, 0)));
        case 7:
            int r7 = Fun.leernumero();
            System.out.println(Fun.siete(r7));
        case 8:
            int r8 = Fun.leernumero();
            System.out.println(Fun.ocho(r8));
        case 9:
            int r9 = Fun.leernumero();
            System.out.println(Fun.ocho(r9));
    }
        
        
        
    }

}