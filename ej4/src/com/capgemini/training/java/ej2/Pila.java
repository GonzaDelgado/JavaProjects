package com.capgemini.training.java.ej2;

import java.util.ArrayList;
import java.util.List;

public class Pila {

	private List<Object> arreglo = new ArrayList<Object>();
	private Object tope;
	
	public void push(Object e) {
		arreglo.add(0,e);
		this.tope = e;
	}
	
	public Object peek() {
		return (arreglo.isEmpty()) ? -1 : tope;
	}
	
	public Object pop() {
		if(arreglo.isEmpty())
		return -1;
		
		Object res = tope;
		arreglo.remove(0);
		if(arreglo.size() == 0) {
			tope = -1;
		} else {
			tope = arreglo.get(0);
		}
		return res;
	}
	
	public void reverse() {
		//guardo el valor del tamaño del arreglo
		int longitud = arreglo.size();
		//si el arreglo esta vacio entonces termino la ejecucion
		if(longitud == 0)
			return;
		//cambio el valor del tope
		tope = arreglo.get(longitud-1);
		
		// Recorro el arreglo hasta la mitad. Si es impar, se va al entero
		//anterior mas proximo.
		for (int i = 0; i < longitud / 2; i++) {
			//guardo el valor actual temporalmente
		    Object temporal = arreglo.get(i);
		    //calculo el indice de la otra mitad por el que lo voy a cambiar
		    int indiceContrario = longitud - i - 1;
		    // En el actual ahora está el del lado contrario
		    arreglo.set(i, arreglo.get(indiceContrario));
		    //Y en el otro lado, el que estaba originalmente en el actual
		    arreglo.set(indiceContrario, temporal);
		}
		
		
	}
	
	public static void main(String[] args) {
		Pila p = new Pila();
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
	}
}
