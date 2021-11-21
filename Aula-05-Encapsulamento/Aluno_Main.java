import java.util.Scanner;

public class Aluno_Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Aluno aluno01 = new Aluno();
		Aluno aluno02 = new Aluno("Maria","1010-2", 8.0, 3.0, 7.0);
		
		System.out.println("Informe o nome do " + aluno01);
		aluno01.nome = ler.nextLine();
		System.out.println(aluno01.toString());
		System.out.println(aluno01.calcularMedia());
		
		/*System.out.println(aluno02.toString());
		System.out.println("Média = "+aluno02.calcularMedia());
		System.out.println("Média Final = " +aluno02.calcularMediaFinal());*/
		
	}

}
