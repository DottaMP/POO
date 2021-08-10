import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {
		// variaveis
		// <tipo> <nome>
		String nome;
		float altura;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe seu nome: ");
		nome = ler.nextLine();
		
		System.out.print("Informe sua altura: ");
		altura = ler.nextFloat();
		
		System.out.println("Nome: "+nome);
		//System.out.println("Altura: "+altura);
		//System.out.printf("%s%3.1f", "Altura: ",altura);
		System.out.printf("Altura: "+String.format("%.2f",altura));
		
		//System.out.printf("%s%s", "Nome: ", nome);
		
        /*System.out.print("Entre com o nome: ");
        nome = meuScanner.nextLine();          // Lê os dados digitados
        
        System.out.print("Entre com a idade: ");
        idade = meuScanner.nextInt();          // Lê os dados digitados

        // Entrar com Altura
        System.out.print("Entre com a altura: ");
        altura = meuScanner.nextDouble();           // Lê os dados digitados    
        
        // Entrar com Peso
        System.out.print("Entre com o peso: ");
        peso = meuScanner.nextFloat();        // Lê os dados digitados   
        
        System.out.println("Nome.: "+ nome);
        System.out.println("Idade: "+ idade);
        System.out.println("Altura: "+ altura);
        System.out.println("Peso: "+ peso);*/

		
	}

}
