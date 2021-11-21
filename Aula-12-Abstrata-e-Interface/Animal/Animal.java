package Animal;

public abstract class Animal {
	private String name;

	public Animal() {

	}
	
	public Animal(String name) {
		super();
		this.name = name;
	}
	
	public abstract void emitirSom();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
