package Televisão;

public class Televisao {

	public static void main(String[] args) {
		TV televisao = new TV();
		
		televisao.ligar();
		televisao.aumentarVolume();
		televisao.aumentarVolume();
		televisao.aumentarVolume();
		televisao.aumentarVolume();
		televisao.aumentarVolume();
		
		System.out.println("Essa televisão é da marca " + televisao.fabricante);
		System.out.println("A televisão está " + (televisao.ligado == true?"ligada.":"desligada.\n"));
		System.out.println("A televisão está no volume " + televisao.volume);
	}
}