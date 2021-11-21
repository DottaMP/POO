package Animal;

public class Main {

	public static void main(String[] args) {
		Papagaio loro = new Papagaio("Loro José");
		loro.emitirSom();
		loro.voar();
		System.out.println();
		
		Gato kiara = new Gato("Kiara", "Siamês");
		kiara.amamentar();
		kiara.emitirSom();
		kiara.brincar();
		kiara.levarPassear();
		kiara.alimentar();
		kiara.levarVeterinario();
		System.out.println();
		
		Cachorro fox = new Cachorro("Fox", "Cocker", 3);
		fox.amamentar();
		fox.emitirSom();
		fox.brincar();
		fox.levarPassear();
		fox.alimentar();
		fox.levarVeterinario();
		System.out.println();
		
		Cavalo tornado = new Cavalo("Tornado");
		tornado.amamentar();
		tornado.emitirSom();
		tornado.alimentar();
		tornado.levarVeterinario();
		System.out.println();
	}

}
