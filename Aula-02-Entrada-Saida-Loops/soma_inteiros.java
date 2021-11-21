// Faça um programa que receba quatro números inteiros, 
// calcule e mostre a soma desses números.

import java.util.Scanner;

public class soma_inteiros {

	public static void main(String[] args) {
		int a, b, c, d, soma;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite 4 números inteiros: ");
		a = ler.nextInt();
		b = ler.nextInt();
		c = ler.nextInt();
		d = ler.nextInt();
		
		soma = a + b + c + d;
		
		System.out.println("A soma dos números é: "+soma);
	}

}
