package loops;

import java.util.Scanner;

public class Ex2_Nota {

	public static void main(String[] args) {
/* Fa�a um programa que pe�a uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inv�lido e continue pedindo at� informar um v�lido */
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("Informe uma nota de 0 a 10: ");
		n = sc.nextInt();
		
		while (n < 0 || n > 10) {
			System.out.print("Nota inv�lida! Digite novamente:  ");
			n = sc.nextInt();
		}
		System.out.println("O nota informada foi: " + n);
		
		sc.close();

	}

}
