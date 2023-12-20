package Contas2;

import Contas2.Conta2;

public class PessoaFisica2 {

	public static void main(String[] args) {
		Conta2 cc1 = new Conta2();
		cc1.setCliente("Everson Bortolotto dos Santos.");
		cc1.setSaldo(10000);
		cc1.sacar(500);
		
		System.out.println("Nome do cliente: " + cc1.getCliente());
		cc1.exibirSaldo();
		System.out.println("==================================");
		
		Conta2 cc2 = new Conta2();
		cc2.setCliente("Celoni Bortolotto dos Santos.");
		cc2.setSaldo(25000);
		cc2.depositar(1200);
		
		System.out.println("Nome do cliente: " + cc2.getCliente());
		cc2.exibirSaldo();
		
		System.out.println("======================================");
		System.out.println("Transferência bancária:");
		System.out.println("Cliente transferente: " + cc1.getCliente());
		System.out.println("Cliente receptor: " + cc2.getCliente());
		cc1.transferir(cc2, 2000);
		System.out.println("");
		System.out.println("Cliente: " + cc1.getCliente());
		cc1.exibirSaldo();
		System.out.println("Cliente: " + cc2.getCliente());
		cc2.exibirSaldo(); 
		
		System.out.println("=======================================");
		System.out.println("Relatório gerencial: ");
		Conta2 gerente = new Conta2();
		double relatorio = gerente.soma(cc1.getSaldo(), cc2.getSaldo());
		System.out.println("Saldo total: " + relatorio);
	}
}