package Animal;

import java.util.Random;

public class Papagaio extends Ave{

	public Papagaio() {
	}

	public Papagaio(String nome) {
		super(nome);
	}
	
	@Override
	public void voar() {
		System.out.println("Sou um papagaio, mas me chamam de louro");
	}
	
	@Override
	public void emitirSom() {
		Random rnd = new Random();
		String[] falas = {"Al�", "Quem �?", "Olha a campainha"};
		System.out.println("Sou um papagio, eu falo muito");
		System.out.println("Meu nome � "+this.getName());
		System.out.println(falas[rnd.nextInt(falas.length)]);
	}
	
}
