package Entities;

public class Quartos {
	
	private String nome;
	private String email;
	private int numero;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public Quartos(String nome, String email, int numero) {
		this.nome = nome;
		this.email = email;
		this.numero = numero;
	}
}
