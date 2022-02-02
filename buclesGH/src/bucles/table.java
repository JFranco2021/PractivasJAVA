package bucles;

import java.util.Scanner;

public class table {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
        int num;
        
        System.out.print("Enter any positive integer: ");
        num = console.nextInt();
                
        System.out.println("Multiplication Table of " + num);
        
        int i = 1;
        while(i<=10) {
        	
        	System.out.println(i+" x "+num+" = "+i*num);
        	i++;
        }
    }

}


