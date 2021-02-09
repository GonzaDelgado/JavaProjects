package excepciones;


public class C {

	public static void main(String[] args) {
		try {
			A metodoA = new A();
			metodoA.a();
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Bloque catch generado automáticamente
			System.err.println("Te pasaste");
		}
		A metodoB = new A();
		metodoB.b();
	}

}
