// Fa�a um programa que receba quatro n�meros inteiros, 
// calcule e mostre a soma desses n�meros.

import java.util.Scanner;

public class soma_inteiros {

	public static void main(String[] args) {
		int a, b, c, d, soma;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite 4 n�meros inteiros: ");
		a = ler.nextInt();
		b = ler.nextInt();
		c = ler.nextInt();
		d = ler.nextInt();
		
		soma = a + b + c + d;
		
		System.out.println("A soma dos n�meros �: "+soma);
	}

}
