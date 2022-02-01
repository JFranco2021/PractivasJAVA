package classGrader;
import java.util.Scanner;

public class calificacion {
public static void main(String[] args) {
	Scanner s = new Scanner (System.in);
	
	System.out.println("Dame tu calificacion: ");
	double cal = s.nextFloat();
	
	if(cal>0 && cal<3) {
		System.out.println("Failed");
	}else if(cal>3 && cal<=5){
		System.out.println("Insufficient");
	}else if(cal>5 && cal<=9){
		System.out.println("Good");
	}else if(cal==10){
		System.out.println("Excellent");
	}else {
		System.out.println("fuera de rango");
	}
	
}
}
