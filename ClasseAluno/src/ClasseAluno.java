public class ClasseAluno {
	
	private String nome;
	private int idade;
	
	public void setNome(String nome){
		this.nome = nome;
	}

	public String getNome(){
		return nome;
	}
	
	public void setIdade(int idade){
		if(idade > 0 && idade <120){
			this.idade = idade;
			System.out.println("Idade cadastrada com sucesso.");
		}else {
			System.out.println("Idade inválida. Informe novamente.");
		}
	}
}