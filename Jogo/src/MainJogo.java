
public class MainJogo extends ClasseJogo{

	String personagens;
	String historia;
	public static void main(String[] args) {

		MainJogo aov = new MainJogo();
		
		aov.empresa = "Tencent.";
		aov.genero = "MOBA";
		aov.nome = "Arena of Valor";
		aov.historia = "Mobile.";
		aov.personagens = "Hayate, Slimz e Ellandor.";
		
		System.out.println("Empresa: " + aov.empresa);
		System.out.println("Gênero: " + aov.genero);
		System.out.println("Nome: " + aov.nome);
		System.out.println("História: " + aov.historia);
		System.out.println("Personagens: " + aov.personagens);
		System.out.println("--------------------------------");
		
		aov.jogar();
	}

}
