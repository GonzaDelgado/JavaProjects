package ej6;

public class Prueba {

	public static void main(String[] args) {
		ItemInventario pc = new Pc(35875,true);
		ItemInventario silla = new Silla(73,210,true);
		System.out.println("El id de la pc es: "+pc.getID());
		System.out.println("El id de la silla es: "+silla.getID());
	}

}
