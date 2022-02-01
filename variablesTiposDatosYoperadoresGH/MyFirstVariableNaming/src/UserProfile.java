import java.util.Scanner;
public class UserProfile {
	public static void main(String[] args) {
		Scanner s=  new Scanner (System.in); 
		Scanner i=  new Scanner (System.in); 
		System.out.println("Cual es tu nombre?");
		String name = s.nextLine();
		System.out.println("Cual es tu edad?");
		int age = i.nextInt();
		System.out.println("Dime tun genero: ");
		String gender = s.nextLine();
		System.out.println("Cual es tu preferencia de trabajo?");
		String jobPref = s.nextLine();
		System.out.println("Cual es tu Nacionalidad?");
		String nat = s.nextLine();
		System.out.println("Cual es tu tipo de sangre?");
		String blood = s.nextLine();
		
		
		System.out.println("Hola, "+name+" tienes "+age+" años, eres del genero "+gender);
		System.out.println("Tu preferencia laboral es: "+jobPref+". Tu nacionalidad es: "+nat+" y tu tipo de sangre es: "+blood+"\n");
		System.out.println("Tu año de nacimiento es: "+(2022-age)+" o "+((2022-age)-1));
		
	}
 
}
