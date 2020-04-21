import java.util.Scanner;

import Entities.Bank;

public class ProgramBank {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Bank bank;
		
		System.out.print("Entre com o numero da conta: ");
		int conta = sc.nextInt();
		System.out.println("Entre com o nome do correntista: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Entrar com depósito inicial? (y/n)");
		char response = sc.next().charAt(0);
		
		if (response == 'y') {
			System.out.print("Valor: ");
			double depInicial = sc.nextDouble();
			bank = new Bank(nome, conta, depInicial);
		} else {
			bank = new Bank(nome, conta);
			
		}
		
		System.out.println();
		System.out.println("Dados da Conta");
		System.out.println(bank);
		
		System.out.println();
		System.out.print("Valor para depósito: ");
		double valDep = sc.nextDouble();
		bank.deposito(valDep);
		
		System.out.println();
		System.out.println("Dados da Conta");
		System.out.println(bank);
		
		System.out.print("Valor para saque: ");
		double valSaque = sc.nextDouble();
		bank.saque(valSaque);

		System.out.println();
		System.out.println("Dados da Conta");
		System.out.println(bank);
		
		sc.close();
	}
}
