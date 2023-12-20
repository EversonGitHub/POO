package carro;

public class AtributosCarro {
	
	String nome;
	String marca;
	short ano;
	short velocidade;
	
	void acelerar(int aceleracao){
	//Parâmetros, são variáveis que vão participar dos métodos.
		velocidade += aceleracao;
	}

	void freiar(int reduzir) {
		velocidade -= reduzir;
	}
	
	void buzinar() {
		System.out.println("bipi bipi bipi.");
	}
}