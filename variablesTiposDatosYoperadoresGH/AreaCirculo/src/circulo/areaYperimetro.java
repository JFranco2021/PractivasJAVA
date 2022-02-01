package circulo;

import java.util.Scanner;

public class areaYperimetro {
	public static void main(String[] args) {
	
		
		Scanner i=  new Scanner (System.in); 
	
			
		System.out.println("Dame el radio del circulo:");
		double radio = i.nextInt();
		
		double area = (3.1416*(radio*radio));
		double perimetro = 3.1416*radio;	
       
		System.out.println("El area del circulo es: "+area+"\nEl perimetro del circulo es: "+perimetro);

	
     }
}