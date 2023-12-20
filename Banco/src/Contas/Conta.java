package Contas;

import Clientes.Cliente;

public class Conta {
	private double saldo;
	int agencia;
	int numero;
	public Cliente titular;
	
	public void depositar(double s){
		this.saldo = this.saldo + s;
	}
	
	public boolean sacar(double valor){
		if(this.saldo >= valor){
			this.saldo = this.saldo - valor;
			System.out.println("Saque efetuado com sucesso.");
			return true;
		}else{
			System.out.println("Saque não permitido. Verifique o seu saldo.");
			return false;
		}
	}
	
	public boolean transferir(double valor, Conta destino){
		if(this.saldo >= valor){
			this.saldo -= valor;
			destino.depositar(valor);
			System.out.println("Transferência realizada com sucesso.");
			return true;
		}else{
			System.out.println("Não foi possível realizar a transferência.");
			return false;
		}
	}
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public void setSaldo(double s){
		this.saldo = s;
	}
	
	public int getNumero(){
		return numero;
	} 
	
	public void setNumero(int n){
		this.numero = n;
	}
	
	public int getAgencia(){
		return agencia;
	}
	
	public void setAgencia(int a){
		this.agencia = a;
	}
	
	public Cliente getTitular(){
		return titular;
	} 
	
	public void setTitular(Cliente t){
		this.titular = t;
	}
}