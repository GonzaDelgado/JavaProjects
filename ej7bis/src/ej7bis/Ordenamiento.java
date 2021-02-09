package ej7bis;

public class Ordenamiento {

	public static void main(String[] args) {
		int[] A = {0,4,2,2,1,0,5,3};
		System.out.println("El arreglo es: ");
		System.out.print("[");
		for(int i = 0; i<A.length-1;i++) {
			System.out.print(A[i]+", ");
		}
		System.out.println(A[A.length-1]+"]");
		ordeno(A,A.length,5);
		System.out.println("El arreglo pero ordenado: ");
		System.out.print("[");
		for(int i = 0; i<A.length-1;i++) {
			System.out.print(A[i]+", ");
		}
		System.out.println(A[A.length-1]+"]");
	}
	
	public static void ordeno(int[] A, int n, int k) {
		//Creo una tabla de k elementos
		int[] tabla = new int[k+1];
		//inicializo la tabla con ceros
		for(int x : tabla)
			x=0;
		//la tabla me va a decir la cantidad del iesimo elemento que esta en el arreglo A
		for(int i= 0; i<n;i++) {
			tabla[A[i]]++;
		}
		//uso temp para ir agregando los elementos ordenados al arreglo A
		int temp = 0;
		//recorro la tabla y voy agregando la cantidad de elementos que tenia en orden
		for(int j = 0; j <= k ; j++) {
			while(tabla[j]>0) {
				A[temp] = j;
				temp++;
				tabla[j]--;
			}
		}
	}
}
