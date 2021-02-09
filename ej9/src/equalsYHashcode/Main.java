package equalsYHashcode;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Employee gonzalo = new Employee();
		Employee gonzaloDelgado = new Employee();
		Date ingreso = new Date();

		// Cargo datos de gonzalo
		gonzalo.setEdad(23);
		gonzalo.setNombre("Gonzalo");
		gonzalo.setFechaIngreso(ingreso);
		gonzalo.setSalario(35000);

		// Cargo datos de gonzalo Delgado
		gonzaloDelgado.setEdad(23);
		gonzaloDelgado.setNombre("Gonzalo");
		gonzaloDelgado.setFechaIngreso(ingreso);
		gonzaloDelgado.setSalario(35000);
		
		//comparo si son iguales
		boolean iguales = gonzalo.equals(gonzaloDelgado);
		System.out.println(iguales);
		//comparo si tienen igual hashcode
		int hashGonzalo = gonzalo.hashCode();
		int hashGonzaloDelgado = gonzaloDelgado.hashCode();
		if(hashGonzalo == hashGonzaloDelgado) {
			System.out.println("Tienen mismo hashCode");
		} else {
			System.out.println("tienen distinto hashCode");
		}
	}

}
