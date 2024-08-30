package com.generation;

import java.util.Scanner;

public class Codigo5 {

	public static void main(String[] args) { //Se añadio el método main
		
	Scanner s = new Scanner(System.in); //Se importo el scanner, se agrego system.in
    System.out.print("Introduzca un número: "); // Se eligio double templates
    String ni = s.nextLine();
    
    // Falta convertir el valor String a un numero entero 
    int niInt = Integer.parseInt(ni);
    int c = niInt;
    
    int afo = 0;
    int noAfo = 0;  //Se agrego el { para el bucle 
    	
    
    while (niInt > 0) { // corregimos a como llamanos a al valor 'int'. 
	  int digito = (int)(niInt % 10);
      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
		afo++;
      } else {
		noAfo++;
      }
	  niInt /= 10;
    } 

    if (afo > noAfo) {
      System.out.println("El " + c + " es un número afortunado."); // Se agregó la t en el print
    } else {
      System.out.println("El " + c + " no es un número afortunado.");
    }

    s.close(); // Cerrar el scanner
	}
}//

