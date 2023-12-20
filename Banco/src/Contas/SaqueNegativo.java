package Contas;

public class SaqueNegativo {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.depositar(1200);
		conta1.sacar(10);
		System.out.println(conta1.getSaldo());
	}
}