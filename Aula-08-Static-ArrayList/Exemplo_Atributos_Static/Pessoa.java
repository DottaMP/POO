package Exemplo_Atributos_Static;

public class Pessoa {
//só é possível colocar como static atributos e/ou métodos, classe não.
	
	private static int totalPessoas; //colocando o atributo como static
		//o atributo passa a pertencer a classe e não as ocorrências, que são os objetos.
	private int id;
	private String nome;

	Pessoa() {
		totalPessoas++;
	}

	Pessoa(int id, String nome) {
		totalPessoas++;
		this.id = id;
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static int getTotalPessoas() {
		return totalPessoas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + "]";
	}
}
