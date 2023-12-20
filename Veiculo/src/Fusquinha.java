public class Fusquinha {

	public static void main(String[] args) {
		Carro fusquinha = new Carro();
		
		fusquinha.ano = 1972;
		fusquinha.cor = "Preto.";
		
		System.out.println("Ano do fusquinha: " + fusquinha.ano);
		System.out.println("Cor do fusquinha: " + fusquinha.cor);
		fusquinha.acelerar();
		fusquinha.desligar();
	}
}