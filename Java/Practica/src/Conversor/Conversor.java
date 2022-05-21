package Conversor;

import java.io.IOException;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class Conversor {

	public static void main(String[] args) {
	//  kilos a libras
//		kilos a gramos
//		libras a kilos
//		libras a gramos
//		gramos a kilos
//		falta de gramos a libras
		
		while(true) {
			
			try {
				String valor= JOptionPane.showInputDialog("Intruduce el valor a convertir");
				StringTokenizer st= new StringTokenizer(valor,",");
				double medirTr= Double.parseDouble(st.nextToken());
				String valo= st.nextToken();
				String operador= st.nextToken();
			
			if((valo.equals("kilos")) && (operador.equals("libras"))) {
				int pasarLibras= (int)((medirTr *1000)/500);
				JOptionPane.showMessageDialog(null,"Son : " + pasarLibras + " Libras");
			}else
			if((valo.equals("libras")) && (operador.equals("kilos"))) {
				int pasarKilos= (int)((medirTr*1000/2)/1000);
				JOptionPane.showMessageDialog(null,"Son: " + pasarKilos + " kilos");
			}else
			if((valo.equals("kilos"))&&(operador.equals("gramos"))) {
				int pasarGramos= (int)(medirTr*1000);
				JOptionPane.showMessageDialog(null, "Son : " + pasarGramos + " Gramos");
			}else
			if((valo.equals("gramos"))&&(operador.equals("kilos"))) {
				double pasarKilos2 = (medirTr*0.001);
				JOptionPane.showMessageDialog(null, "Son : " + pasarKilos2 + " kilos");
			}else
			if((valo.equals("libras"))&&(operador.equals("gramos"))) {
				int pasarGramos = (int)(medirTr*500);
				JOptionPane.showMessageDialog(null, "Son : " + pasarGramos + " gramos");
			}else
			if((valo.equals("gramos"))&&(operador.equals("libras"))) {
				double pasarlibras2 = (medirTr*0.00220462);
				JOptionPane.showMessageDialog(null, "Son : " + pasarlibras2 + " libras");
			}else
			if((valo.equals("cm")) && (operador.equals("m"))) {
				double pasarMetros = (medirTr*0.01);
				JOptionPane.showMessageDialog(null, "Son: " + pasarMetros + " m");
			}else
			if((valo.equals("m")) && (operador.equals("cm"))) {
				int pasarCentimetros = (int)(medirTr*100);
				JOptionPane.showMessageDialog(null, "Son: " + pasarCentimetros + " cm");
				
			}else JOptionPane.showMessageDialog(null, "Valor no permitido");
			
			if(st.nextToken().equals("salir")) { 
				break;
			}
				
			}catch(NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Termina la ejecución");
			break;
			}
			
		}
	}
}	
	

