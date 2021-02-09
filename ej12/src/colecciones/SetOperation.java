package colecciones;

import java.util.Set;

public class SetOperation {
	
	public static <T> Set<T> union(Set<T> setA, Set<T> setB){
		Set<T> res = setA;
		res.addAll(setB);
		return res;
	}

	public static <T> Set<T> interseccion(Set<T> setA, Set<T> setB){
		Set<T> res = setA;
		res.retainAll(setB);
		return res;
	}

	public static <T> Set<T> diferencia(Set<T> setA, Set<T> setB){
		Set<T> tmp = interseccion(setA,setB);
		Set<T> res = setA;
		res.removeAll(tmp);
		return res;
	}

	public static <T> Set<T> difSimetrica(Set<T> setA, Set<T> setB){
		Set<T> res1 = diferencia(setA,setB);
		Set<T> res2 = diferencia(setB,setA);
		return union(res1,res2);
	}
}
