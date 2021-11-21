import java.text.DecimalFormat;
import java.util.Scanner;

/*Faça um programa que receba o salário de um funcionário e o 
 * percentual de aumento, calcule e mostre o valor do aumento e o novo salário.*/
public class salario_aumento_2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.00");
		
		float salario, perc=0, novoSalario=0, aumento=0;
		
		System.out.println("Informe o salário atual: ");
		salario=ler.nextFloat();
		
		System.out.println("Informe o percentual de aumento: ");
		perc=ler.nextFloat();
		
		aumento = salario * perc;
		novoSalario = salario + aumento;
		
		System.out.println("O funcionário recebeu aumento de R$ "+ df.format(aumento)+"\nO novo salário será: R$ " + df.format(novoSalario));

	}

}