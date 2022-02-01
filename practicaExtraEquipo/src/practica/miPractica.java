package practica;

import java.util.Scanner;

public class miPractica {
	public static void main(String[] args) {
Scanner s = new Scanner (System.in);
		
		System.out.println("User: ");
		String user = s.nextLine();
		
		System.out.println("Password: ");
		String pass = s.nextLine();
		
		String _user = "salvador";
		String _pass = "12345";
		
		System.out.println(user == _user);
		System.out.println(user.equals(_user));
		
		System.out.println(pass == _pass);
		System.out.println(pass.equals(_pass));
		
		int var1 = pass.compareTo(_pass);
		
		if(var1 == 0 && user.equals(_user)) {
		System.out.println("Bienvenido");
		} 
		else if(var1 == 0){
			System.out.println("Verifica tu usario");
		} 
		else if(user.equals(_user) && var1!=0){
			System.out.println("Verifica tu contraseña" );
		}
		else {
			System.out.println("Verifica Usuario y Contraseña");
		}

		
	}
}
