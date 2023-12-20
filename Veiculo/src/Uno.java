
public class Uno {

	public static void main(String[] args) {
		Carro uno = new Carro(1993,"Branco");
		
		System.out.println("Ano do uno: " + uno.ano);
		System.out.println("Cor do uno: " + uno.cor);
		uno.acelerar();
		uno.desligar();
	}
}