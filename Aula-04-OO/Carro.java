
public class Carro {
	//Atributos		
	String marca;
	String modelo;
	String cor;
	int ano;
	
	//M�todos
	public Carro (String marca, String modelo, String cor, int ano ) {// Este � o m�todo construtor, leva o 
		//mesmo nome da classe. Pode-se colocar os atributos dentro do (). Por�m esses mesmos atributos 
		//dever�o ser declarados dentro dos () no instanciamento do objeto.
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
	}
		
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}


}
