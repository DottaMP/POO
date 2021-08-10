import java.text.DecimalFormat;
import java.util.Scanner;

/*Fa�a um programa que receba o sal�rio base de um funcion�rio, calcule e mostre o 
 * sal�rio a receber, sabendo-se que o funcion�rio tem gratifica��o de 5% sobre o 
 * sal�rio base e paga imposto de 7% sobre este sal�rio.*/
public class Lista_06 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.00");
		
		float salario, salarioBase=0, gratif=0, imposto=0, salarioFinal=0;
		
		System.out.println("Informe o sal�rio base: ");
		salarioBase=ler.nextFloat();
		
		gratif = salarioBase * 0.05f;
		salario = salarioBase + gratif;		
		imposto = salario * 0.07f; 
		salarioFinal = salario-imposto; 
				
		System.out.println("\nSalario Base: R$ "+ df.format(salarioBase)+"\nValor da gratifica��o: R$ " + df.format(gratif)+
				"\nValor do imposto: R$ " + df.format(imposto) +"\nSal�rio Final: R$ " + df.format(salarioFinal));

	}

}
