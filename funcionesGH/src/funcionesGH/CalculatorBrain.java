package funcionesGH;

import java.util.Scanner;

public class CalculatorBrain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		double x,y;
		
		int opc;		
		do {
			//Menu
			System.out.println("1.-Sum");
			System.out.println("2.-Rest");
			System.out.println("3.-Multiplication");
			System.out.println("4.-Division");
			System.out.println("5.-Exit");
			
			opc = s.nextInt();
			
			switch(opc) {
			
			case 1:
				
				System.out.println("First Value : ");
				x = s.nextDouble();
				
				System.out.println("Second Value : ");
				y = s.nextDouble();
				
				System.out.println("Sum of " + x + " + " + y + " = " + sum(x,y));
			break;
			case 2:
				System.out.println("First Value : ");
				x = s.nextDouble();
				
				System.out.println("Second Value : ");
				y = s.nextDouble();
				System.out.println("Rest of " + x + " - " + y + " = " + rest(x,y));
			break;
			case 3:
				System.out.println("First Value : ");
				x = s.nextDouble();
				
				System.out.println("Second Value : ");
				y = s.nextDouble();
				System.out.println("Multiplication of " + x + " * " + y + " = " + multi(x,y));
			break;
			case 4:
				System.out.println("First Value : ");
				x = s.nextDouble();
				
				System.out.println("Second Value : ");
				y = s.nextDouble();
				System.out.println("Division of " + x + " / " + y + " = " + div(x,y));
			break;
			case 5:
			break;
			default:
				System.out.println("Enter a valide option");
			break;
			}
			
		}while(opc!=5);
		
	}
	
	static double sum(double a, double b) {
		return (a+b);
	}
	static double rest(double a, double b) {
		return (a-b);
	}
	static double multi(double a, double b) {
		return (a*b);
	}
	static double div(double a, double b) {
		return (a/b);
	}

}