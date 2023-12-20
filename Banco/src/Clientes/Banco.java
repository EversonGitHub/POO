package Clientes;

import Contas.Conta;

public class Banco {

	public static void main(String[] args) {
		Cliente everson = new Cliente();
		everson.setNome("Everson Bortolotto dos Santos.");
		everson.setCPF("309.881.748-80.");
		everson.setProfissao("Cyber Security.");
		
		Conta contaEverson = new Conta();
		contaEverson.depositar(2000);
		
		contaEverson.titular = everson; //Informando que o cliente Everson é o titular dessa conta(contaEverson).
		
		System.out.println(contaEverson.titular.getNome());
	}
}