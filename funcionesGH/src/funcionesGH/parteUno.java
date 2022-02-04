package funcionesGH;

import java.util.Scanner;

public class parteUno {
	
	public static void main(String[] args) {
		
		
		Scanner console = new Scanner(System.in);
		System.out.println("Cual es tu nombre? ");
		String name = console.nextLine();
		System.out.println("Cual es tu apellido? ");
		String firstname = console.nextLine();
		printNameLength(name, firstname);
		printNameCharacters(name, firstname);
		
	    }
		private static void printNameLength( String name,String firstname)
	    {
			System.out.println("\nTu nombre es: "+name+" "+firstname);
	    }

	    private static void printNameCharacters( String name,String firstname )
	    {
	    	int j = name.length();
	    	System.out.println("\nEstos son los caracteres: ");
	    	for(int i=0; i<j; i++){
				System.out.println(name.charAt(i));
				
	    	}
				
			int k = firstname.length();
		    System.out.println("\n");
		    for(int l=0; l<k; l++){
				System.out.println(firstname.charAt(l));	
	    
		
	       }
      }
}
	


