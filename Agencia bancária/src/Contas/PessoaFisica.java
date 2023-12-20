package Contas;

public class PessoaFisica {

	public static void main(String[] args) {
		Conta cc1 = new Conta();
		cc1.cliente = "Everson Bortolotto dos Santos.";
		cc1.saldo = 10000;
		cc1.sacar(500);
		
		System.out.println("Nome do cliente: " + cc1.cliente);
		cc1.exibirSaldo();
		System.out.println("==================================");
		
		Conta cc2 = new Conta();
		cc2.cliente = "Celoni Bortolotto dos Santos.";
		cc2.saldo = 25000;
		cc2.depositar(1200);
		
		System.out.println("Nome do cliente: " + cc2.cliente);
		cc2.exibirSaldo();
		
		System.out.println("======================================");
		System.out.println("Transferência bancária:");
		System.out.println("Cliente transferente: " + cc1.cliente);
		System.out.println("Cliente receptor: " + cc2.cliente);
		cc1.transferir(cc2, 2000);
		System.out.println("");
		System.out.println("Cliente: " + cc1.cliente);
		cc1.exibirSaldo();
		System.out.println("Cliente: " + cc2.cliente);
		cc2.exibirSaldo(); 
		
		System.out.println("=======================================");
		System.out.println("Relatório gerencial: ");
		Conta gerente = new Conta();
		double relatorio = gerente.soma(cc1.saldo, cc2.saldo);
		System.out.println("Saldo total: " + relatorio);
	}
}