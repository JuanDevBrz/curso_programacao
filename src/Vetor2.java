import java.util.Locale;
import java.util.Scanner;


import Entities.ProductVetor;

public class Vetor2 {
		
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		double soma=0;
		
		ProductVetor[] vect = new ProductVetor[n];
		
		for (int i = 0; i < vect.length ; i++) {
			sc.nextLine();
			System.out.println("Entre o nome do produto: ");
			String name = sc.nextLine();
			System.out.println("Entre o preço do produto: ");
			double price = sc.nextDouble();
			vect[i] = new ProductVetor(price,name);	
			soma = soma + vect[i].getPrice();
						
			
		}
		
		double media = soma / vect.length;
		System.out.printf("Média : %.2f", media);
	}
	
}
