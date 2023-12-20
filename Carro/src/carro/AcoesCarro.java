package carro;

public class AcoesCarro {

	public static void main(String[] args) {
		AtributosCarro Carro = new AtributosCarro();

		Carro.nome = "Vectra";
		Carro.ano = 2015;
		Carro.marca = "Ford";
		Carro.velocidade = 60;
		
		Carro.acelerar(20);
		System.out.println("O carro está a " + Carro.velocidade + " KM/h.");
		
		Carro.freiar(10);
		System.out.println("O carro reduziu a velocidade para " + Carro.velocidade + " KM/h.");
	}
}