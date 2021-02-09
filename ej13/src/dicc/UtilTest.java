package dicc;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

class UtilTest {

	@Test
	void test() {
		List<Persona> lp = new ArrayList<Persona>();
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		Persona p3 = new Persona();
		p1.setNombre("Ramon");
		p1.setEdad(45);
		p1.setLegajo(1233);
		p2.setNombre("Jose");
		p2.setEdad(32);
		p2.setLegajo(1236);
		p3.setNombre("Raul");
		p3.setEdad(48);
		p3.setLegajo(134);
		lp.add(p1);
		lp.add(p2);
		lp.add(p3);
		
		//TEST getPersonas
		
		Map<Integer,Persona> result = PersonasUtil.getPersonas(lp);
		//pruebo si con la clave 1233 obtengo a la persona Ramon
		Persona expected1 = p1;
		Persona actual1 = result.get(1233);
		assertEquals(expected1, actual1);
		Persona expected2 = p2;
		Persona actual2 = result.get(1236);
		assertEquals(expected2, actual2);
		Persona expected3 = p3;
		Persona actual3 = result.get(134);
		assertEquals(expected3, actual3);
		
		//TEST ordenarPersonas
		List<Persona> ordenada = PersonasUtil.ordenarPersonas(lp);
		//pruebo si las personas estan realmente ordenadas por edad
		Persona expected4 = p1;
		Persona actual4 = ordenada.get(1);
		assertEquals(expected4, actual4);
		Persona expected5 = p2;
		Persona actual5 = ordenada.get(0);
		assertEquals(expected5, actual5);
		Persona expected6 = p3;
		Persona actual6 = ordenada.get(2);
		assertEquals(expected6, actual6);
	}
	
}
