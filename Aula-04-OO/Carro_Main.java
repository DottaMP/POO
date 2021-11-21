/*- Criar objetos de carros, por exemplo, carro1, carro2, etc.
- Alterar os valores dos atributos
- Imprimir os atributos de sua escolha dos objetos criados */

public class Carro_Main {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro("Land Rover", "RANGE ROVER SPORT", "Branco", 2021);
		Carro carro2 = new Carro("BMW", "BMW X6", "Preto", 2018);
		Carro carro3 = new Carro("Porsche", "911 Carrera", "Vermelho", 2020);
		Carro carro4 = new Carro("Jaguar", "Jaguar XE", "Cinza", 2015);
		
		System.out.println("Carro "+carro1.getMarca());
		System.out.println("Modelo "+carro1.getModelo());
		System.out.println("Cor "+carro1.getCor());
		System.out.println("Ano "+carro1.getAno());
		
		System.out.print("\n");
		
		System.out.println("Carro "+carro2.getMarca());
		System.out.println("Modelo "+carro2.getModelo());
		System.out.println("Cor "+carro2.getCor());
		System.out.println("Ano "+carro2.getAno());
		
		System.out.print("\n");
		
		System.out.println("Carro "+carro3.getMarca());
		System.out.println("Modelo "+carro3.getModelo());
		System.out.println("Cor "+carro3.getCor());
		System.out.println("Ano "+carro3.getAno());
		
		System.out.print("\n");
		
		System.out.println("Carro "+carro4.getMarca());
		System.out.println("Modelo "+carro4.getModelo());
		System.out.println("Cor "+carro4.getCor());
		System.out.println("Ano "+carro1.getAno());

	}
}

