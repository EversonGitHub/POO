
public class Camaro {

	public static void main(String[] args) {
		Carro camaro = new Carro();
		
		camaro.ano = 2005;
		camaro.cor = "Amarelo.";
		
		System.out.println("Ano do camaro: " + camaro.ano);
		System.out.println("Cor do camaro: " + camaro.cor);
		camaro.ligar();
		camaro.acelerar();
	}

}
