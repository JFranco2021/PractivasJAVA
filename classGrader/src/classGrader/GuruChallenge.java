package classGrader;
import java.util.Scanner;

public class GuruChallenge {
public static void main(String[] args) {
    Scanner s = new Scanner (System.in);
    
    System.out.println("Calcularemos tu IMC ");
	System.out.println("Dame tu estatura metros: ");
	double estatura = s.nextFloat();
	
	System.out.println("Dame tu peso kg: ");
	double peso = s.nextFloat();

	double IMC = peso/(estatura*estatura);
	System.out.println("Tu indice de masa corporal es: "+IMC);
	
	if(IMC<18.5) {
		System.out.println("Peso insuficiente");
	}else if(IMC>18.5 && IMC<25){
		System.out.println("Peso normal");
	}else if(IMC>=25 && IMC<30){
		System.out.println("Estas preobeso");
	}else if(IMC>=30 && IMC<40){
		System.out.println("Eres obeso");
	}else {
		System.out.println("Eres obeso morbido");
	}
}
}
