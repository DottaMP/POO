
	public class Aluno {
	//Atributos
	String nome;
	String matricula;
	private double nota1;
	private double nota2;
	private double notaReavaliacao;
	private boolean aprovado;
	
	//Construtor sem parâmetros
	Aluno(){
		
	}
	
	//Construtor com parâmetros
	Aluno(String nome, String matricula, Double nota1, 
			Double nota2, Double notaReavaliacao){
		this.nome = nome;
		this.matricula = matricula;
		setNota1(nota1);
		setNota2(nota2);
		setNotaReavaliacao(notaReavaliacao);
		aprovado = (calcularMediaFinal() >= 6);
		
	}

	@Override
	public String toString() {
		return "Aluno [nome= " + nome + ", matricula= " + matricula + ", nota1= " + nota1 + ", nota2= " + nota2
				+ ", notaReavaliacao= " + notaReavaliacao + ", Média= " + calcularMedia() + "]";
	}	
	
	public double calcularMedia() {
		return (nota1 + nota2) / 2;
	}
	
	public double calcularMediaFinal() {
		if(calcularMedia() >= 6) {
			return calcularMedia();
		} else {
			return (calcularMedia() + notaReavaliacao) /2;
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		if (nota1>=0 && nota1<=10) {
			nota1 = nota1;
			aprovado = (calcularMediaFinal() >= 6);
		} else {
			System.out.println("Nota 1="+nota1+ " - Valor Inválido!");
		}
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		if (nota2>=0 && nota2<=10) {
			nota2 = nota2;
			aprovado = (calcularMediaFinal() >= 6);
		} else {
			System.out.println("Nota 2="+nota2+ " - Valor Inválido!");
		};
	}

	public double getNotaReavaliacao() {
		return notaReavaliacao;
	}

	public void setNotaReavaliacao(double notaReavaliacao) {
		this.notaReavaliacao = notaReavaliacao;
	}

	public boolean getAprovado() {
		return aprovado;
	}

	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}


}
