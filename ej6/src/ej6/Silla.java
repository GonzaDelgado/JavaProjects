package ej6;

public class Silla extends ItemInventario{
	private int lote;
	private int nroDentroDeLote;
	private boolean conRueditas;
	
	
	
	public Silla(int lote, int nroDentroDeLote, boolean conRueditas) {
		this.lote = lote;
		this.nroDentroDeLote = nroDentroDeLote;
		this.conRueditas = conRueditas;
	}

	public int getID() {
		return this.lote*1000+this.nroDentroDeLote;
	}

	public boolean isConRueditas() {
		return conRueditas;
	}
	
	
}
