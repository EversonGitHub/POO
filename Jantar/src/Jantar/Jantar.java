package Jantar;

public class Jantar {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		pessoa1.nome = "Everson.";
		pessoa1.peso = 70.5;
		
		Comida comida1 = new Comida();
		comida1.peso = 3;
		
		pessoa1.comer(comida1);
		
		System.out.println(pessoa1.peso);
	}
}