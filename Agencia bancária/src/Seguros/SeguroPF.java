package Seguros;

import Contas.Conta;

public class SeguroPF extends Conta{

	public static void main(String[] args) {
		SeguroPF cc3 = new SeguroPF();
		cc3.cliente = "Everson B. Santos.";
		cc3.saldo = 10000;
		
		System.out.println("Nome do cliente: " + cc3.cliente);
		cc3.exibirSaldo();
	}
}