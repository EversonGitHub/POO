package Circulo;

public class AppCirculo {

	public static void main(String[] args) {
		Circulo circulo = new Circulo();
		
		circulo.x = 5;
		circulo.y = 9;
		circulo.raio = 10;
		
		System.out.println("Circulo: (Centro X: " + circulo.x + "Centro Y: " + circulo.y + ".)");
		System.out.println("Área do raio: " + circulo.area());
	}
}