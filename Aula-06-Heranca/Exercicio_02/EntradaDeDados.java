package Exercicio_02;

import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		/*Veiculo v01 = new Veiculo();
		
		Scanner ler = new Scanner(System.in);
		System.out.print("Entre com a placa: ");
		v01.setPlaca(ler.nextLine());
		System.out.print("Entre com o ano: ");
		v01.setAno(ler.nextInt());	
		System.out.println(v01);*/
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de veículos: ");
		int n = ler.nextInt();
		Veiculo[] veiculos = new Veiculo[n];
		
		
		for (int i = 0 ; i < n; i++) {
			ler.nextLine();
			veiculos[i] = new Veiculo();
			System.out.print("Entre com a placa: ");
			veiculos[i].setPlaca(ler.nextLine());
			System.out.print("Entre com o ano: ");
			veiculos[i].setAno(ler.nextInt());
		}
		System.out.println("\n");
		for(int i=0; i < veiculos.length; i++) {
			System.out.println(veiculos[i]);
		}

	}

}
