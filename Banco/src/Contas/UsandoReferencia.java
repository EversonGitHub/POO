package Contas;

import Clientes.Cliente;

public class UsandoReferencia {

	public static void main(String[] args) {
		Conta conta = new Conta();
		
		Cliente cliente = new Cliente();
		
		conta.setTitular(cliente);
		cliente.setCPF("309.333.456.78");
		
		System.out.println(conta.getTitular().getCPF());
	}
}