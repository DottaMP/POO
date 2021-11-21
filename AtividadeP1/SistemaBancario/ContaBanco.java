package SistemaBancario;

import java.util.Scanner;

public class ContaBanco { 
	Scanner ler = new Scanner(System.in);	
	//Atributos
	public String numAgencia;
	public String numConta;
	private String banco;
	protected int tipo; //1=corrente, 2=poupança; 3=conjunta, 4=conta encerrada
	private String cliente;
	private String clienteConjunta;
	private float saldo;
	private boolean status; //Conta ativo ou inativa
	
	
	//Construtor	
	public ContaBanco() {
		this.EntradaDados();
	}
	
	public ContaBanco(String numAgencia, String numConta, String banco, int tipo, String cliente, String clienteConjunta,float saldo,
			boolean status) {
		this.numAgencia = numAgencia;
		this.numConta = numConta;
		this.banco = banco;
		this.tipo = tipo;
		this.cliente = cliente;
		this.clienteConjunta = clienteConjunta;
		this.saldo = saldo;
		this.status = status;
	}
	
	//Métodos Pesonalizados
	public void consultar(){ //Consultar Saldo e info sobre a conta
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Suas informações:");
		System.out.println("Conta: "+this.getNumAgencia());
		System.out.println("Conta: "+this.getNumConta());
		System.out.println("Banco: "+this.getBanco());
		System.out.println("Tipo: "+this.getTipo());
		System.out.println("Cliente: "+this.getCliente());
		if (this.getTipo()==3){
			System.out.println("Cliente CJ: "+this.getClienteConjunta());
		}
		System.out.println("Saldo: "+this.getSaldo());
		System.out.println("Status: "+this.getStatus());
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
	}
	
	public void abrirConta(int abrir){
		this.setTipo(abrir);
		this.setStatus(true);
		if (abrir==1){ //Conta Corrente
			this.setSaldo(0);
		}else if (abrir==2){ //Poupança
			this.setSaldo(0);
		}else if (abrir==3){ //Conjunta
			this.setSaldo(0);
		}else if (abrir==4){ //Encerrar Conta
			this.setStatus(false);
		}
	}
	
		public void reabrirConta(){
		    if(this.getStatus()==true){
		        System.out.println("Conta "+this.getNumConta()+" já está ativa!\n");
		    } else{
		        this.setStatus(true);
		        System.out.println("Conta "+this.getNumConta()+" reaberta com sucesso!\n");
		    }

	}
	
	public void fecharConta(){
	    if(this.getStatus()==false){
	        System.out.println("Conta "+this.getNumConta()+" já está fechada!\n");
	    }else{
	        if (this.getSaldo() < 0){
    			System.out.println("Conta não pode ser fechado, pois há débitos!\nEntre em contato com a gente para mais informações!\n");
    		}else if (this.getSaldo() > 0){
    			System.out.println("Saque total no valor de R$ "+this.getSaldo()+" realizado, pois cliente "+this.getCliente()+" solicitou encerramento de sua conta.");
    			this.setSaldo(this.getSaldo() - saldo);
    			this.setStatus(false);
    			System.out.println("\nOh, sentimos muito por você estar nos deixando, esperamos que volte logo :) \nConta de " +this.getCliente()+" fechada com sucesso!\n");
    			System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
    		}else {
    			this.setStatus(false);
    			System.out.println("\nOh, sentimos muito por você estar nos deixando, esperamos que volte logo :) \nConta de " +this.getCliente()+" fechada com sucesso!\n");
    			System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
    		}
	    }
	}
	
	public void depositar(float valor){ //creditar
		if (this.getStatus()){
			this.setSaldo(this.getSaldo() + valor);
			System.out.println("Deposito no valor de R$ "+valor+" realizado com sucesso na conta de "+this.getCliente());
			System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");

		}else {
			System.out.println("Impossível depositar em uma conta fechada");
			System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
		}
	}
	
	public void sacar(float valor){ //debitar
		if (this.getStatus()){
			if (this.getSaldo() >= valor){
				this.setSaldo(this.getSaldo() - valor);
				System.out.println("Saque no valor de R$ "+valor+" realizado na conta de "+this.getCliente());
				System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");

			}else {
				System.out.println("Saldo insuficiente para saque de "+this.getCliente());
				System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
			}
		}else {
			System.out.println("Impossível sacar de uma conta fechada");
			System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");

		}
	}
	
	public void EntradaDados(){ //Entrada de Dados

		System.out.print("Entre com a sua agencia: ");
		this.setNumAgencia(ler.nextLine());
		
		System.out.print("Entre com a sua conta: ");
		this.setNumConta(ler.nextLine());
		
		System.out.print("Entre com o seu banco: ");
		this.setBanco(ler.nextLine());
		
		System.out.print("Entre com o seu nome: ");
		this.setCliente(ler.nextLine());
		
		System.out.print("Informe o Tipo da sua conta: \n[1] Conta Corrente\n[2] Conta Poupança\n[3] Conta Conjunta\n");
		this.abrirConta(ler.nextInt());
		if(this.getTipo()==3) {		
			System.out.print("Entre com o nome da outra pessoa que fará parte da sua conta conjunta: ");
			this.setClienteConjunta(ler.next());
		}
		System.out.println("Conta "+this.getNumConta()+" do tipo "+this.getTipo()+" aberta com sucesso!");
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
	
		int opcao;
		do
		{
			System.out.println("Escolha o que deseja fazer: ");
			System.out.println("[1] - Para depósito: ");
			System.out.println("[2] - Para saque: ");
			System.out.println("[3] - Consultar dados e saldo: ");
			System.out.println("[4] - Para Fechar sua conta: ");
			System.out.println("[5] - Para Reabrir sua conta: ");
			System.out.println("[0] - Para Sair: ");
			System.out.println("Digite a opção desejada: ");	
			opcao = ler.nextInt();	
			
			switch (opcao){		
			case 1:
				System.out.println("Entre com o valor para depósito: ");
				this.depositar(ler.nextInt());
				break;
				
			case 2:
				System.out.println("Entre com o valor para o saque: ");
				this.sacar(ler.nextInt());
				break;
				
			case 3:
				System.out.println("\n");
				this.consultar();
				break;
				
			case 4:
				System.out.println("\n");
				this.fecharConta();		
				break;
			
			case 5:
				System.out.println("\n");
				this.reabrirConta();		
				break;
			}
		}while(opcao!=0);
		
		System.out.println("\nVocê saiu! Dados finais");
		this.consultar();
	}

	public String getNumAgencia() {
		return numAgencia;
	}

	public void setNumAgencia(String numAgencia) {
		this.numAgencia = numAgencia;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getClienteConjunta() {
		return clienteConjunta;
	}

	public void setClienteConjunta(String clienteConjunta) {
		this.clienteConjunta = clienteConjunta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ContaBanco [numAgencia=" + numAgencia + ", numConta=" + numConta + ", banco=" + banco + ", tipo=" + tipo
				+ ", cliente=" + cliente + ", clienteConjunta=" + clienteConjunta + ", saldo=" + saldo + ", status="
				+ status + "]";
	}

}
