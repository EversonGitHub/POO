import java.util.Random;

public class Carro {
	int ano;
	String cor;
	
	public Carro(){
		Random gerador = new Random();
		int chassi = gerador.nextInt(1000);
		System.out.println("Chassi: " + chassi + ".");
	}
	
	public Carro(int a, String c){
		Random gerador = new Random();
		int chassi = gerador.nextInt(500);
		this.ano = a;
		this.cor = c;
		System.out.println("Chassi: " + chassi);
	}
	
	void ligar() {
		System.out.println("Ligando o carro...");
	}
	
	void desligar() {
		System.out.println("Desligando o carro...");
	}
	
	void acelerar(){
		System.out.println("Acelerando...");
	}
}