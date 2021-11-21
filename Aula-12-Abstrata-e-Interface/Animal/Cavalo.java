package Animal;

import java.util.Random;

public class Cavalo extends Mamifero implements AnimalDomesticado{

	public Cavalo(){
		
	}

	public Cavalo(String nome){
		super(nome);
	}
	
	@Override
	public void amamentar() {
		System.out.println("Sou um mam�fero!");
	}
	
	@Override
	public void emitirSom() {
		Random rnd = new Random();
		String[] falas = {"iiirrrr�", "rilinchin"};
		System.out.println("Meu nome � "+this.getName());
		System.out.println(falas[rnd.nextInt(falas.length)]);
	}
	
	@Override
	public void levarVeterinario() {
		System.out.println("Estou doente...");
	}

	@Override
	public void alimentar() {
		System.out.println("Hora da merenda!");
	}
}
