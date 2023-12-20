package Usuarios;

public class UsersMain {

	public static void main(String[] args) {
		Usuarios[] usuarios = new Usuarios[4];
		
		for(int c = 1; c < usuarios.length; c++){
			Usuarios usuarioAtual = new Usuarios();
			
			usuarioAtual.setNome("Nome: " + c);
			usuarioAtual.setSobrenome("Sobrenome:" + c);
			usuarios[c] = usuarioAtual;
		}
		
		for(int c = 1; c < usuarios.length; c++){
		System.out.println(usuarios[c].getNome());
		System.out.println(usuarios[c].getNome());
		}
	}
}