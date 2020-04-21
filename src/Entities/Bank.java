package Entities;

public class Bank {
	
	private String nome;
	private double saldo;
	private int conta;

	
	public Bank (String nome, int conta) {
		this.nome = nome; 
		this.conta = conta;
	}
	
	public Bank (String nome, int conta, double depInicial) {
		this.nome = nome;
		this.conta = conta;
		deposito(depInicial);
	}

		
	public void deposito(double valor) {
		saldo += valor;
	}
	
	public void saque (double valor) {
		saldo -= valor + 5;   
	}
	
	
	public String getName() {
		return nome;
	}

	public void setName(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}
	
	public String toString() {
		return "Conta: "+ conta + ", Nome: " + nome + ", Saldo: "+saldo ;		
	}

}
