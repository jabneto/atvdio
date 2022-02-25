package loops;

import java.util.Scanner;

public class Ex2_Nota {

	public static void main(String[] args) {
/* Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue pedindo até informar um válido */
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("Informe uma nota de 0 a 10: ");
		n = sc.nextInt();
		
		while (n < 0 || n > 10) {
			System.out.print("Nota inválida! Digite novamente:  ");
			n = sc.nextInt();
		}
		System.out.println("O nota informada foi: " + n);
		
		sc.close();

	}

}
