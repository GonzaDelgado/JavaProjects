package ej2;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		//Imprimo Hello World
		//System.out.println("Hello World");
		
		//Imprimo las tablas de multiplicar
		/* 
		for (int i = 1; i <= 10; i++) {
			for(int j = 1; j <=10; j++) {
				System.out.println(i + " x "+j+" = "+i*j);
			}
			System.out.println("");
		}*/
		
		//Pido la nota del alumno
		System.out.println("Introduzca la nota del alumno: ");
		Scanner sc = new Scanner(System.in);
		int nota = sc.nextInt();
		String calif = "";
		if(nota >= 0 && nota <= 50) {
			calif = "Suspenso";
		}else if(nota >= 51 && nota <= 75) {
			calif = "Recuperar";
		}else if(nota >= 76 && nota <= 90) {
			calif = "Aprobado";
		}else if(nota >= 91 && nota <= 100) {
			calif = "Aprobado con Mérito";
		}else {
			calif = "Puntuación Invalida";
		}
		
		System.out.println("Calificacion: "+calif);
		
	}

}
