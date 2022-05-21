
public class Mex {

	public static void main(String[] args) {
	
		
		float a = Float.NaN;
		@SuppressWarnings("removal")
		float b = new  Float(1f/0f);
		
		System.out.println("Valor de a: " + a);
		System.out.println("Valor de Float." + Float.floatToIntBits(a));
		System.out.println(Float.isNaN(b));
		
		double c= Double.MAX_EXPONENT;
		double f= Double.MAX_VALUE;
		
		System.out.println("Maximo exponente de un double: " + c);
		System.out.println("Maximo valor de un double: " + f);
	}
}
