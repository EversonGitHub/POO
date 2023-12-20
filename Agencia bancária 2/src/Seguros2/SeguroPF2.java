package Seguros2;

import Contas2.Conta2;

public class SeguroPF2 extends Conta2{

	public static void main(String[] args) {
		SeguroPF2 cc3 = new SeguroPF2();
		cc3.setCliente("Everson B. Santos.");
		cc3.setSaldo(10000);
		
		System.out.println("Nome do cliente: " + cc3.getCliente());
		cc3.exibirSaldo();
	}
}