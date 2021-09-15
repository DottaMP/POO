package Exercicio_02;

public class Onibus extends Veiculo{
	private int assentos;
	
	public int getAssentos(int assentos) {
		return assentos;
	}

	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}

	public Onibus() {
		super();
		
	}

	public Onibus(String placa, int ano, int assentos) {
		super(placa, ano);
		this.assentos = assentos;
		
	}

	@Override
	public String toString() {
		return "Informações do Onibus: \nAssentos: " + assentos + "\n" + super.toString();
	}
	
	
	
}
