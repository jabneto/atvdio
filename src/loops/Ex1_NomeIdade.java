package loops;

import java.util.Scanner;

public class Ex1_NomeIdade {

	public static void main(String[] args) {
/* Faça um programa que leia conjuntos de dois valores, o primeiro representando o nome do aluno e o segundo rep a sua idade e pare quando nome 0 */
		
		Scanner sc = new Scanner(System.in);
		
		String nome;
		int idade = 0;
		
		while(true) {
			System.out.print("Nome: ");
			nome = sc.next();
			if (nome.equals("0")) break;
			System.out.print("Idade: ");
			idade = sc.nextInt();
		}
		System.out.println(idade + " Fim ");
		
		sc.close();
	}

}
