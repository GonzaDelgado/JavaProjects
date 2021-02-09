package ej7;

public class Ordenar {

	public static void main(String[] args) {
		
		int[] A = {7,4,2,1,6,5,3};
		System.out.println("El arreglo es: ");
		System.out.print("[");
		for(int i : A) {
			System.out.print(i+", ");
		}
		System.out.println("]");
		ordenarArray(A);
		System.out.println("El arreglo pero ordenado: ");
		System.out.print("[");
		for(int i : A) {
			System.out.print(i+", ");
		}
		System.out.println("]");
	}
	
	public static void ordenarArray(int[] A) {
		for (int i = A.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (A[j] > A[j + 1])
					swap(A, j, j+1);
			}
		}
	}
	
	public static void swap(int[] arr, int a, int b) {
		int temp = arr[b];
		arr[b] = arr[a];
		arr[a] = temp;
	}
}
