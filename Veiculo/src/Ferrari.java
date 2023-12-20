public class Ferrari {

	public static void main(String[] args) {
		Carro ferrari = new Carro();
		
		ferrari.ano = 2000;
		ferrari.cor = "Vermelho.";
		
		System.out.println("Ano da ferrari: " + ferrari.ano);
		System.out.println("Cor da ferrari: " + ferrari.cor);
		ferrari.ligar();
		ferrari.acelerar();
	}
}