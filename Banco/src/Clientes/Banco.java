package Clientes;

import Contas.Conta;

public class Banco {

	public static void main(String[] args) {
		Cliente everson = new Cliente();
		everson.setNome("Everson B. Santos.");
		everson.setCPF("999.999.999-99.");
		everson.setProfissao("Cyber Security.");
		
		Conta contaEverson = new Conta();
		contaEverson.depositar(2000);
		
		contaEverson.titular = everson;
		
		System.out.println(contaEverson.titular.getNome());
	}
}