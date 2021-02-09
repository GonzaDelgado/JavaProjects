package excepciones;


public class A extends RuntimeException{
	public void a() throws ArrayIndexOutOfBoundsException{
		int[] A = {2,1};
		for (int i = 0; i <= A.length; i++) {
			System.out.println(A[i]);
		}
	}
	
	public void b() {
		int[] A = {2,1};
		for (int i = 0; i <= A.length; i++) {
			System.out.println(A[i]);
		}
	}
}
