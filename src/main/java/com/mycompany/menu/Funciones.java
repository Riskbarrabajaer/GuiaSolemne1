/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.menu;
import java.util.*;
/**
 *
 * @author HP
 */
public class Funciones {
    public boolean esNumero(String numero){
    try{
        int prueba = Integer.valueOf(numero);
        return true;
        }
    catch(NumberFormatException e){
        return false;
        }
    }
    public int leernumero(){
    Scanner scanner = new Scanner(System.in);
    int condicion = 0;
    while(condicion == 0){
        System.out.print("ingrese el numero: ");
        String salida = scanner.next();
        if (esNumero(salida) == true){
            condicion = Integer.valueOf(salida);
            }
        }
        return condicion;
    }
    public int uno( int n){
        int suma = 0;
        for(int i = 1; i <= n; i++){
            suma = suma + i;
        }
        return suma;
    }
    public int doss( int n){
        int suma = 1;
        for(;1 < n; n--){
            suma = suma * n;
        }
        return suma;
    }
    public int tres(int base , int exponente){
        int resultado = 1;
        for (int i = 0; i < exponente; i++ ){
            resultado = resultado * base;
            }
        return resultado;
    }
    public int cuatro(int n){
        int casos = 0;
        for(int i = 1; i < n;i++){
            if(n % i == 0){
                casos++;
            }
        }
        return casos;
    }
    public int cinco(int ano, int aumento){
        if (aumento == 100){
            return ano % aumento;
        }
        else{
            return cinco(ano, 100);
        }
    }
    public int seis(int numero, int i, int casos){
        if (numero < i){
            return casos;
        }
        else{
            if(numero % i != 0){
                casos++;
            }
            return seis(numero, i+1, casos);
        }
    }
    public String primo(int casos){
        String eresOnoEres = (casos != 2) ? "es primo":"no es primo";
        return eresOnoEres;
    }
    public int siete(int ano){
    int aumento = 1;
    while(aumento <= 100){
        aumento = aumento * 10;
        }
    return ano % aumento;
    }
    public int ocho(int n){
    int suma = 0;
    for (int i = 0; i <= n; i = i + 2 ){
        suma = suma + i;
    }
    return suma;
}
    public int nueve(int n){
    if(n == 0){
       return 1;
        }
    else{ 
        return n % 10 * nueve(n /10);
        }
    }
    public String esbiciesto(int resto){
        String eresOnoEres = (resto % 4 == 0) ? "es biciesto":"no es biciesto";
        return eresOnoEres;
    }
    
}
