package controlFlujo;
import java.util.Scanner;
public class parteUno {
	public static void main(String[] args) {
		
		Scanner valor = new Scanner (System.in);
		
		System.out.println("Dime el total de la venta: ");
		int venta = valor.nextInt();
		
		if(venta >10000) {
			System.out.println("Tu comisión es de: "+venta*0.30);
		}else if(venta >= 5001 && venta <= 9999) {
			System.out.println("Tu comisión es de: "+venta*0.20);
		}else if(venta >= 1001 && venta <= 5000) {
			System.out.println("Tu comisión es de: "+venta*0.10);
		}else if(venta >= 0 && venta <= 1000) {
			System.out.println("No aplica comisión");
		}
		else {
			System.out.println("No puedes tener ventas negativas");
		}
		
	}

}

