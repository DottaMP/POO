package Exercicio_02;

public class Veiculo {
	private String placa;
	private int ano;
	
	public Veiculo() {
		
	}
	
	public Veiculo(String placa, int ano) {
		super();
		this.placa = placa;
		this.ano = ano;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	
	@Override
	public String toString() {
		return "Placa: " + placa + "\nAno: " + ano + "\n";
	}
	
	

	
	
}

