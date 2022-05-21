
public class Local {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int a= 45;
	double b = 45d;
	
	
	String a2= Integer.toBinaryString(a);
	System.out.println("Conversion a Binario: " + a2);
	
//	System.out.println(Integer.parseInt(a2));
	int c= Float.floatToIntBits(a);          //Retorna un entero con la representación bits.
	String f= Integer.toBinaryString(c);     // se debe aplicar esta funcion para obtener un
	System.out.println("******************");//string en representacion que se pueda 
	if(a>=0) {                               //imprimir en la pantalla en IEE 754.
		System.out.println("Conversion de bits a IEEE 0"+f);
	}if(a<0) {
		System.out.println("Conversion de bits a IEEE 1"+f);
	}
	
	System.out.println("*******************************");
	Float g= Float.intBitsToFloat(c);
	System.out.println("Transformacion de bits a float : "+ g);
	
	System.out.println("\n---------------------------------------\n");
	
	System.out.println(Double.doubleToLongBits(b));
	
//	long r= Double.doubleToLongBits(b);
//	Double s= Double.longBitsToDouble(r);
//	String l= Long.toBinaryString(r);
//	System.out.println(s);
	
	
	}

}
