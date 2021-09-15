package Exercicio_02;

public class Caminhao extends Veiculo{
	
	private int eixos;

	public int getEixos() {
		return eixos;
	}

	public void setEixos(int eixos) {
		this.eixos = eixos;
	}

	public Caminhao() {
		super();

	}

	public Caminhao(String placa, int ano, int eixos) {
		super(placa, ano);
		this.eixos = eixos;

	}

	@Override
	public String toString() {
		return "Informações do Caminhao: \nEixos: " + eixos + "\n" + super.toString();
	}
	
	
	
}
