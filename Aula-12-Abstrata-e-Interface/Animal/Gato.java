package Animal;

import java.util.Random;

public class Gato extends Mamifero implements AnimalEstimacao, AnimalDomesticado{
	private String raca;
	
	public Gato(){
		
	}

	public Gato(String nome, String raca){
		super(nome);
		this.raca = raca;
	}
	
	@Override
	public void amamentar() {
		System.out.println("Sou um mamífero!");
	}
	
	@Override
	public void emitirSom() {
		Random rnd = new Random();
		String[] falas = {"Miau Miau", "Humano cadê minha comida?", "Limpa minha caixa de areia!", "Quero água!"};
		System.out.println("Meu nome é "+this.getName());
		System.out.println(falas[rnd.nextInt(falas.length)]);
	}
	
	@Override
	public void brincar() {
		Random rnd = new Random();
		String[] brincadeiras = {"Brincando com a bolinha...","Brincando com um ponto de luz...","Brincando no sofá..."};
		System.out.println(brincadeiras[rnd.nextInt(brincadeiras.length)]);
	}

	@Override
	public void levarPassear() {
		System.out.println("Estou dando uma voltinha...");
	}
	
	@Override
	public void levarVeterinario() {
		System.out.println("Visita ao médico...");
	}

	@Override
	public void alimentar() {
		System.out.println("Hora de comer!");
	}


	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	
}
