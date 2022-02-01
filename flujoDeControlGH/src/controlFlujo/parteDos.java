package controlFlujo;

import java.util.Scanner;

public class parteDos {
public static void main(String[] args) {
		
		Scanner valor= new Scanner (System.in);
		
		System.out.println("Cuantos años tienes? ");
		int edad = valor.nextInt();
		
		if(edad>=0 && edad<5) {
			System.out.println("Tienes descuento del 60%, el costo sera: "+7*0.40);
		}else if(edad>60) {
			System.out.println("Tienes descuento del 55%, el costo sera: "+7*0.45);
		}else if(edad>= 5 && edad <=60){
			System.out.println("No tienes descuento");
			System.out.println("Dime cuantos boletos quieres?");
			int numeroBoletos = valor.nextInt();
			   if(numeroBoletos >=2) {
				   System.out.println("Tienes descuento del 20%, el costo sera: "+numeroBoletos*7*0.80);
			   }else if(numeroBoletos == 1) {
				   System.out.println("No tienes descuento");
			   }else {
				   System.out.println("Numero de boletos invalido");
			   }
		}else {
			System.out.println("Edad invalida");
		}
	
	}

}
