	package com.generation;
	
	import java.util.Scanner; //Se agrego el scanner
	
	public class revision4 {
		public static void main(String[] args) { //agregamos public static void
			Scanner s = new Scanner(System.in);
			System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
			String j1 = s.nextLine(); //se agrego punto y coma 
			System.out.println("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
			//se elimino scanner duplicado
			String j2 = s.nextLine();{ //Se agrego el ;
				if (j1 == j2) { //Se elimino un ) extra
					System.out.println("Empate");
				} else {
					int g = 2;
					switch(j1) {
					case "piedra":
						if (j2 == "tijeras") {
							g = 1;
						}
						break; //se agrego el break
					case "papel":
						if (j2 == "piedra") {
							g = 1; }
					case "tijera":
						if (j2.equals("papel")) {
							g = 1;
						}
						break;
					default:
					}
					System.out.println("Gana el jugador " + g);
				}
			}
			s.close(); //Cerrar el scanner 
				
		}
	}


