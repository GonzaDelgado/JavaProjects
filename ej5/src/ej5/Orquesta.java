package ej5;

import java.util.ArrayList;

public class Orquesta {

	private ArrayList<Instrument> instrumentos = new ArrayList();
	
	
	
	public Orquesta() {
		Guitarra guitarra1 = new Guitarra();
		Guitarra guitarra2 = new Guitarra();
		Piano piano = new Piano();
		this.instrumentos.add(guitarra1);
		this.instrumentos.add(guitarra2);
		this.instrumentos.add(piano);
	}

	public String concierto() {
		
		String concierto = "";
		for(Instrument i : this.instrumentos) {
			concierto += i.sonar()+"\n";
		}
		return concierto;
	}


	public static void main(String[] args) {
		Orquesta o = new Orquesta();
		System.out.println(o.concierto());

	}

}
