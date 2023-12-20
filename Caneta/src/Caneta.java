public class Caneta {

	String modelo;
	String cor;
	double ponta;
    int carga;
	boolean tampada;
	
	void status(){
		System.out.println("Modelo da caneta: " + this.modelo);
		System.out.println("Cor da caneta: " + this.cor);
		System.out.println("Calibre da caneta: " + this.ponta);
		System.out.println("Carga da caneta: " + this.carga);
		System.out.println("Caneta tampada/destampada?" + this.tampada);
	}
	
	void riscar(){
		if(this.tampada == true) {
			System.out.println("Error: A caneta está tampada.");
		}else {
			System.out.println("Escrevendo...");
		}
	}
	
	void tampar(){this.tampada = true;}
	void destampar(){this.tampada = false;}
}