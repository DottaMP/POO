package Heranca;

public class Main {
	public static void main(String[] args) {
		Data d01 = new Data(1, 5, 2010);
		Data d02 = new Data(15, 12, 2015);
		System.out.println(d01);
		System.out.println(d02);

		Pessoa p01 = new Pessoa("Ana", "121212-09", d01);
		Pessoa p02 = new Pessoa("Manuel", "98765431-77", new Data(22, 7, 2000));

		System.out.println(p01);
		System.out.println(p02);
		System.out.println("Nome:"+p01.getNome()+", Data Nascimento: "+p01.getDtNascimento());
		
		Professor prof01 = new Professor("1212121", "Beatriz", "09876541-09",new Data(10, 9, 1999));
		System.out.println(prof01);

		Aluno aluno01 = new Aluno ("098712", 10, "Cristina", "09876543-11", new Data(1, 1, 2001));
		System.out.println(aluno01);

		Funcionario func01 = new Funcionario ("Cristina", "032122", new Data(1, 1, 1990), new Data(5, 7, 2015), 5932.76f );
		System.out.println(func01);
		
		Gerente ger01 = new Gerente ("Claudia", "77779-05", new Data(18, 10, 1982)
									, new Data(13, 9, 2015), 15932.76f, "TI", new Data(13, 9, 2018)  );
		System.out.println(ger01);
	}
}