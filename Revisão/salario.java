import java.text.DecimalFormat;
import java.util.Scanner;

/*Faça um programa que receba o salário base de um funcionário, calcule e mostre o 
 * salário a receber, sabendo-se que o funcionário tem gratificação de 5% sobre o 
 * salário base e paga imposto de 7% sobre este salário.*/
public class Lista_06 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.00");
		
		float salario, salarioBase=0, gratif=0, imposto=0, salarioFinal=0;
		
		System.out.println("Informe o salário base: ");
		salarioBase=ler.nextFloat();
		
		gratif = salarioBase * 0.05f;
		salario = salarioBase + gratif;		
		imposto = salario * 0.07f; 
		salarioFinal = salario-imposto; 
				
		System.out.println("\nSalario Base: R$ "+ df.format(salarioBase)+"\nValor da gratificação: R$ " + df.format(gratif)+
				"\nValor do imposto: R$ " + df.format(imposto) +"\nSalário Final: R$ " + df.format(salarioFinal));

	}

}
