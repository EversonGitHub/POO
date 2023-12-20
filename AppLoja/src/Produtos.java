
public class Produtos {
	private int codigo;
	private String descricao;
	private double precoVenda;
	private double precoCusto;
	private int saldoEstoque;
	
	public void vender(int quantidadeVendas){
		saldoEstoque = saldoEstoque - quantidadeVendas;
	}
	
	public void alterarPrecoCusto(double novoPrecoCusto){
		precoCusto = novoPrecoCusto;
		precoVenda = precoCusto * 1.50;
	}
	
	public void setCodigo(int codigo){
		this.codigo = codigo;
	}
	
	public void setDescricao(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao(){
		return this.descricao;
	} 
	
	public void setPrecoVenda(double precoVenda){
		this.precoVenda = precoVenda;
	}
	
	public void setPrecoCusto(double precoCusto){
		this.precoCusto = precoCusto;
	}
	
	public void setSaldoEstoque(Integer saldoEstoque){
		this.saldoEstoque = saldoEstoque;
	}
	
	public double getSaldoEstoque() {
		return saldoEstoque;
	}
}