package com.generation;

import java.util.Scanner; //SE IMPORTÓ SCANNER 

public class Codigo6 {
	
	/*
	 * 1. Se creo un array de 20 numeros aleatorios 
	 * 2. Dentro del bucle se especifico un rango de [20,400] para los valores de n[i]
	 * 3. Se solicita al ususario que eliga entre multiplos de 5 o 7 
	 * 4. Se re-imprime  el array con los valores entre [] si es multiplo del valor ingresado*/
	
    public static void main(String[] args) {


	int[] n = new int[20]; //Para iniciar un Array se ulitiza new  
	
	Scanner scn = new Scanner(System.in); //Se crea el scanner para la entrada en consola

    for (int i = 0; i < 20; i++) { // Se agrego ++ en el de iterar 
      n[i] = (int)(Math.random() * 381) + 20;
      System.out.println(n[i] + " "); // Error de escritura en sysout 
    }
    
    System.out.println("\n¿Qué números quiere resaltar? ");
    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
    int opcion = Integer.parseInt(scn.nextLine()); //Esta forma de consulta no es valida en Eclipse(System.console().readLine();

    int multiplo = (opcion == 1) ? 5 : 7;

    for (int e : n) {  // cambio por for 
      if (e % multiplo == 0) {
        System.out.println("[" + e + "] ");
      }else { // Faltaba { cerrar el if
        System.out.println(e + " "); // mal sysout
      }
    }
    scn.close();

    }
}

