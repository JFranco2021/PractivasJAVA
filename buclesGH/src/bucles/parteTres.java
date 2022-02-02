package bucles;

import java.util.Scanner;

public class parteTres {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Dame tu nombre");
		String nombre = s.nextLine();
		int j = nombre.length();
		
		System.out.println("\nTu nombre es: "+nombre);
		
		System.out.println("Mide "+j+" caracteres \n");
		
		for(int i=0; i<j; i++){
			System.out.println(nombre.charAt(i));
			
		}
	}
}
