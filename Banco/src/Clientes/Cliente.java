package Clientes;

public class Cliente {
	private String CPF;
	private String profissao;
	private String nome;
	
	public String getCPF(){
		return CPF;
	}
	
	public void setCPF(String cpf){
		this.CPF = cpf;
	}
	
	public String getProfissao(){
		return profissao;
	}
	
	public void setProfissao(String p){
		this.profissao = p;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String n) {
		this.nome = n;
	}
}