package ej6;

public class Pc extends ItemInventario{
	private int nroSerie;
	private boolean esNotebook;
	public Pc(int nroSerie, boolean esNotebook) {
		this.nroSerie = nroSerie;
		this.esNotebook = esNotebook;
	}
	
	
	
	public boolean isNotebook() {
		return esNotebook;
	}



	public int getID() {
		return this.nroSerie;
	}
}
