/*Fa�a um programa que receba tr�s notas, calcule e 
 * mostre a m�dia aritm�tica entre elas.*/

import java.util.Scanner;

public class soma_media {

	public static void main(String[] args) {
		float a, b, c, soma=0, media=0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite as 3 notas: ");
		a = ler.nextFloat();
		b = ler.nextFloat();
		c = ler.nextFloat();
		
		soma = a + b + c;
		media = soma/3;
		
		System.out.printf("%nA media dos n�meros �: %.2f %n", media);
	}

}