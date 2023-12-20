package Contas;

public class Conta{
	protected String cliente;
	protected double saldo;
	
	public Conta(){
		System.out.println("Agência 0110.");
	}
	
	protected void exibirSaldo(){
		System.out.println("Saldo atual R$: " + saldo);
	}
	
	void sacar(double valor){
		saldo -= valor;
		System.out.println("Débito R$: " + valor);
	}
	
	void depositar(double valor){
		saldo += valor;
		System.out.println("Crédito R$: " + valor);
	}
	
	void transferir(Conta destino, double valor){
		this.sacar(valor);
		destino.depositar(valor);
		System.out.println("Transferência R$: " + valor);
	}
	
	double soma(double cc1, double cc2){
		double total = cc1+cc2;
		return total;
	}
}