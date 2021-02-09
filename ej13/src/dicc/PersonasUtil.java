package dicc;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonasUtil {
	
	public static Map<Integer,Persona> getPersonas(List<Persona> lp){
		Map<Integer,Persona> personas = new HashMap<Integer,Persona>();
		for(int i = 0 ; i < lp.size(); i++) {
			Integer legajo = Integer.valueOf(lp.get(i).getLegajo());
			personas.put(legajo,lp.get(i));
		}
		
		return personas;
	}
	public static List<Persona> ordenarPersonas(List<Persona> lp){
		Collections.sort(lp);
		return lp;
	}
}
