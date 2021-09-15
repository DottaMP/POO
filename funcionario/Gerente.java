package Exercicio_01;

public class Gerente extends Funcionario{
	private int senha;
	
	
	public boolean autentica(int pass) {
		return true;
	}
	
	public Gerente() {
		super();

	}

	public Gerente(String nome, String cpf, double salario, int senha) {
		super(nome, cpf, salario);
		this.senha = senha;

	}

	@Override
	public String toString() {
		return "Gerente [senha=" + senha + "] - " + super.toString();
	}
	
	

}
