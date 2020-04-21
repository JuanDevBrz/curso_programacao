package Entities;

import java.util.Locale;
import java.util.Scanner;

public class Pensionato {
	  public static void main(String[] args) {
		
	  Locale.setDefault(Locale.US);
	  Scanner sc = new Scanner(System.in);
	  
	  Quartos[] vect = new Quartos[9];
	 
	  System.out.println("Quantos quartos serão alugados? ");
	  int n = sc.nextInt();
		
	  for (int i=0; i<n; i++) {
		  System.out.println("Informe o numero do quarto que deseja alugar: ");
		  int numero = sc.nextInt();
		  sc.nextLine();
		  System.out.println("Informe o Nome: ");
		  String nome = sc.nextLine();
		  System.out.println("Informe o email: ");
		  String email = sc.nextLine();
		  vect[i] = new Quartos(nome, email, numero);
 
	  }

	  System.out.println("Busy rooms: ");
	  
	  for (int i = 0; i<n; i++) {
		  System.out.println(vect[i].getNumero()+": "+vect[i].getNome()+", "+vect[i].getEmail());
				  
	  }
	  
	  
	  
	}
}
