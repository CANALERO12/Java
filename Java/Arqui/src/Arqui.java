
public class Arqui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int b=45;
		double d= 0d;
		float a=45f;
		System.out.println(a);
		System.out.println("----------------------------");
		
		Float a1= Float.intBitsToFloat(b);
		System.out.println(a1);
		
		String a2= Integer.toBinaryString(b);
		System.out.println(a2);
		
		Integer.parseInt(a2);
		System.out.println(a2);
		
		Long a4= Double.doubleToLongBits(d);
		System.out.println(a4);
		
		
		
		String a3= Long.toBinaryString(a4);
		System.out.println("Numero en IEE: 0"+a3);
		
//        Integer a3= Integer.parseInt(a2);
//        System.out.println(a3);
		
	}
}
