package genericsYEnum;

public class Prueba {

	public static void main(String[] args) {
		Pila<Integer> p = new Pila<Integer>();
		p.push(1);
		p.push(2);
		p.push(3);
		p.push(4);
		p.push(5);
		p.push(6);
		System.out.println("El tope de la pila es: "+p.pop());
		System.out.println("El tope de la pila es: "+p.pop());
		System.out.println("El tope de la pila es: "+p.pop());
		System.out.println("El tope de la pila es: "+p.pop());
		System.out.println("El tope de la pila es: "+p.pop());
		System.out.println("El tope de la pila es: "+p.pop());
		p.push(1);
		p.push(2);
		p.push(3);
		p.push(4);
		p.push(5);
		p.push(6);
		p.reverse();
		System.out.println("El tope de la pila inversa es: "+p.pop());
		System.out.println("El tope de la pila inversa es: "+p.pop());
		System.out.println("El tope de la pila inversa es: "+p.pop());
		System.out.println("El tope de la pila inversa es: "+p.pop());
		System.out.println("El tope de la pila inversa es: "+p.pop());
		System.out.println("El tope de la pila inversa es: "+p.pop());
		
		//enumerado planeta
		
		Planeta tierra = Planeta.TIERRA;
		System.out.println("La masa del planeta tierra es de: "+tierra.getmasa());
		System.out.println("El radio del planeta tierra es de: "+tierra.getradio());
	}

}
