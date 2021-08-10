import java.text.DecimalFormat;
import java.util.Scanner;

/*Fa�a um programa que receba o sal�rio de um funcion�rio, 
 * calcule e mostre o novo sal�rio, sabendo-se que este sofreu um aumento de 25%.*/
public class Lista_04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.00");
		
		float salario, novoSalario=0, aumento=0;
		
		System.out.println("Informe o sal�rio atual: ");
		salario=ler.nextFloat();
		
		aumento = salario * 0.25f;
		novoSalario = salario + aumento;
		
		System.out.println("O novo sal�rio com aumento de 25% �: " + df.format(novoSalario));

	}

}
