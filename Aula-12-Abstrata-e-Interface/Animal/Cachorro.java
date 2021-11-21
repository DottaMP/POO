package Animal;

import java.util.Random;

public class Cachorro extends Mamifero implements AnimalEstimacao, AnimalDomesticado {
	private float tamanho;
	private String raca;
	
	public Cachorro(){
		
	}

	public Cachorro(String nome, String raca, float tamanho){
		super(nome);
		this.raca = raca;
		this.tamanho = tamanho;
	}
	
	@Override
	public void amamentar() {
		System.out.println("Sou um mamífero!");
	}
	
	@Override
	public void emitirSom() {
		Random rnd = new Random();
		String[] falas = {"Au Au Au", "Comi todo o seu tênis e mesmo assim você me ama!", "Vou destruir sua casa toda", "Quero ração!"};
		System.out.println("Meu nome é "+this.getName());
		System.out.println(falas[rnd.nextInt(falas.length)]);
	}
	
	@Override
	public void brincar() {
		Random rnd = new Random();
		String[] brincadeiras = {"Pegando a bolinha...","Brincando de correr...","Brincando na piscina..."};
		System.out.println(brincadeiras[rnd.nextInt(brincadeiras.length)]);		
	}
	
	@Override
	public void levarPassear() {
		System.out.println("Dando um role...");
	}
	
	@Override
	public void levarVeterinario() {
		System.out.println("Indo tomar vacina...");
	}

	@Override
	public void alimentar() {
		System.out.println("Hora do rango!");
	}
	
	public float getTamanho() {
		return tamanho;
	}

	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}


	
	
}
