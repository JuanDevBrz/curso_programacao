import java.util.Locale;
import java.util.Scanner;

public class Vetor1 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double soma=0;
		double[] vect = new double[n];
		
		
		for (int i = 0; i < n; i++) {
			System.out.println("Digita a altura");
			vect[i] = sc.nextDouble();
			soma = soma + vect[i];
		}
		
		double media = soma / n;
		
		System.out.println	("Média: " + media);
		
			
	}
}
