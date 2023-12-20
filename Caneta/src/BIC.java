public class BIC {

	public static void main(String[] args) {
		Caneta bic = new Caneta();
		
		bic.modelo = "Bic";
		bic.carga = 90;
		bic.cor = "Preta.";
		bic.ponta = 1.0;
		
		bic.tampar();
		bic.status();
		bic.riscar();
		
	}
}