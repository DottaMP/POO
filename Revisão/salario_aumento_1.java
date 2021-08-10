import java.text.DecimalFormat;
import java.util.Scanner;

/*Faça um programa que receba o salário de um funcionário, 
 * calcule e mostre o novo salário, sabendo-se que este sofreu um aumento de 25%.*/
public class Lista_04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.00");
		
		float salario, novoSalario=0, aumento=0;
		
		System.out.println("Informe o salário atual: ");
		salario=ler.nextFloat();
		
		aumento = salario * 0.25f;
		novoSalario = salario + aumento;
		
		System.out.println("O novo salário com aumento de 25% é: " + df.format(novoSalario));

	}

}
