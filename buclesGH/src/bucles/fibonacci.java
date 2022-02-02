package bucles;

import java.util.Scanner;

public class fibonacci {
	public static void main(String[] args){
		 
        Scanner sc = new Scanner(System.in);
        int numero,fibo1,fibo2,i;
  
        do{
            System.out.print("Introduce numero mayor que 1: ");
            numero = sc.nextInt();
        }while(numero<=1);               

        fibo1=0;
        fibo2=1;

        System.out.print(fibo1 + "\n");
        for(i=2;i<=numero;i++){
            System.out.print(fibo2+"\n");
            fibo2 = fibo1 + fibo2;
            fibo1 = fibo2 - fibo1;
        }
        
    }
}