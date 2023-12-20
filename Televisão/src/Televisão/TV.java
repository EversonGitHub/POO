package Televisão;

public class TV {
	String fabricante = "Sony";
	int polegadas = 40;
	int volume = 0;
	int canal = 1;
	boolean ligado = false;
	
	public void aumentarVolume(){
		if(volume >= 100){
			return;
		}
		volume++;
	}
	
	public void diminuirVolume(){
		if(volume <= 0){
			return;
		}
		volume--;
	}
	
	public void ligar(){
		ligado = true;
	}
	
	public void desligar(){
		ligado = false;
	}
}