package Contas;

public class CriarConta {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.setSaldo(1000);
		System.out.println("O saldo da primeira conta é " + conta1.getSaldo() + " reais.");
		System.out.println("=====================================================");
		
		conta1.setSaldo(100);
		System.out.println("O saldo atual é " + conta1.getSaldo() + " reais.");
		
		Conta conta2 = new Conta();
		conta2.setSaldo(300);
		System.out.println("O saldo da conta 2 é " + conta2.getSaldo() + " reais.");
	}
}