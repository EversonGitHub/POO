public class ClasseAluno {
	/*Ao usar o parâmetro private, eu defino que somente essa classe, a ClasseAluno, possa manipular
	 os atributos correspondes a ela. Pra fazer com que outras classes possam obter, acessar essa classe
	 com os atributos private, é preciso criar um método para tal, o chamando assim em outras classes. 
	 */
	
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