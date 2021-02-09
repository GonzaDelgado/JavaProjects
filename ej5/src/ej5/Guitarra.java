package ej5;

public class Guitarra extends Instrument{
	private String sonido;
	
	
	
	public Guitarra() {
		this.sonido = "guitarra.sonar();";
	}



	public String sonar() {
		return this.sonido;
	}
}
