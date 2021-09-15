package Exercicio_01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Funcionario func01 = new Funcionario("Pedro", "555.888.444.77", 5300.00);
		System.out.println(func01);
		
		//Gerente ger01 = new Gerente();
		Gerente ger01 = new Gerente("Joao", "333.999.555.66", 10300.00, 1234);
		System.out.println(ger01);
		System.out.println(ger01.autentica(0));
		
		//ger01.setNome(null);
		//ger01.setCpf(null);
		//ger01.setSalario(0);
	
		
	}

}
