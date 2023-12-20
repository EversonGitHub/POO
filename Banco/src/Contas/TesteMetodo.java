package Contas;

public class TesteMetodo {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		
		conta1.setSaldo(130.80);
		conta1.depositar(70);
		System.out.println("O saldo atual da conta é " + conta1.getSaldo() + " reais.");
		
		System.out.println("===================================");
		conta1.sacar(25);
		System.out.println("Saldo atual pós saque: " + conta1.getSaldo());
		
		Conta conta2 = new Conta();
		conta2.setSaldo(1500);
		System.out.println("Saldo da conta 2 é de " + conta2.getSaldo());
		System.out.println("=================================================");
		
		conta2.transferir(400, conta1);
		System.out.println("Saldo atual da conta 1 é de " + conta1.getSaldo() + " reais.");
		System.out.println("Saldo atual da conta 2 é de " + conta2.getSaldo() + " reais.");
	}
}