package com.generation;

import java.util.HashMap;
import java.util.Scanner;

public class Codigo7 { //Rename code witout ASCII

	public static void main(String[] args) { // se agrega el metodo

    Scanner s = new Scanner(System.in); //iMPORT Scanner and add System.in

    HashMap<String, String> capitales = new HashMap<>(); //Import HashMap (Los valores que se quieren ocupar son de tipo String)

    capitales.put("Canadá", "Otawwa");
    capitales.put("Estados Unidos", "Washington DC");
    capitales.put("México", "México DF");
    capitales.put("Belice", "Belmopán");
    capitales.put("Costa rica", "San José");
    capitales.put("El Salvador", "San Salvador"); // Capital value missing 
    capitales.put("Guatemala", "Ciudad de Guatemala");
    capitales.put("Honduras", "Tegucigalpa");
    capitales.put("Nicaragua", "Managua");
    capitales.put("Panamá", "Panamá");
   
    String c = ""; //Mal escrito String
    do {
      System.out.println("Escribe el nombre de un país y te diré su capital: "); //sysout incorrecto 
      c = s.nextLine().trim(); //.nextDoble es para numeros y queremos leer texto
      
      if (!c.equals("salir")) { //Change for equals 
        if (capitales.containsKey(c)) { //No es valua es Key , asignamos cambios a la variable que se renombro
          System.out.println("La capital de " + c); //sysout 
          System.out.println(" es " + capitales.get(c)); // .put es metodo para agregar un valor, se usa. get 
        } else {
          System.out.print("No conozco la respuesta ");
          System.out.print("¿cuál es la capital de " + c + "?: ");
          String ca = s.nextLine();
          capitales.put(c, ca);
          System.out.println("Gracias por enseñarme nuevas capitales");
        }
      }
    } while (!c.equals("salir")); // mal escrito , missing )
    s.close();  //Se cierra el scanner

  }

}