import javax.swing.JOptionPane;

public class AppALoja {

	public static void main(String[] args) {
		
		Produtos produto1 = new Produtos();
		Produtos produto2 = new Produtos();
		
		produto1.setCodigo(1);
		produto1.setDescricao("Notebook Asus.");
		produto1.setPrecoCusto(3.000);
		produto1.setPrecoVenda(4.500);
		produto1.setSaldoEstoque(5);
		
		produto2.setCodigo(2);
		produto2.setDescricao("Smartphone Apple.");
		produto2.setPrecoCusto(2.500);
		produto2.setPrecoVenda(6.000);
		produto2.setSaldoEstoque(8);
		
		produto1.vender(2);
		produto1.alterarPrecoCusto(3.800);
		
		JOptionPane.showMessageDialog(null, "Existem " + produto1.getSaldoEstoque() + " " + produto1.getDescricao() + " em estoque.");
		JOptionPane.showMessageDialog(null, "Existem " + produto2.getSaldoEstoque() + " " + produto2.getDescricao() + " em estoque.");
	}
}