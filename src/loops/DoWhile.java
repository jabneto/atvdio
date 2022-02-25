package loops;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
				
		int numero;
		int maior = 0;
		int soma = 0;
		int count = 0;
		
		do {
			System.out.print("Numero: ");
			numero = sc.nextInt();
			
			soma = soma + numero;
			
			if (numero > maior) maior = numero;
			count = count + 1;
			
		}while(count < 5);
		int media;
		media = soma / count;
		
		System.out.println("Maior: " + maior);
		System.out.println("A média é: " + media);
				
		sc.close();
				

	}

}
