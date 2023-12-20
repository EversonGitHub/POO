public class Jato {

	public static void main(String[] args) {
		Aviao jato = new Aviao();
		
		jato.ano = 2020;
		jato.cor = "Branco.";
		jato.envergadura = 10;
		
		System.out.println("Avião: Jato.");
		System.out.println("Ano do avião: " + jato.ano);
		System.out.println("Cor do avião: " + jato.cor);
		System.out.println("Envergadura do avião: " + jato.envergadura + " m.");
		jato.aterrizar();
		jato.desligar();
	}
}