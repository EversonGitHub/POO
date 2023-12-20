
public class MainAluno {

	public static void main(String[] args) {
		
		ClasseAluno aluno = new ClasseAluno();
		
		aluno.setNome("Everson.");
		
		System.out.println("O nome é " + aluno.getNome());
		
		aluno.setIdade(29);
	}
}