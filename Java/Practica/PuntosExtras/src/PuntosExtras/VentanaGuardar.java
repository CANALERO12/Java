package PuntosExtras;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class VentanaGuardar extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	FileWriter fichero = null;
	PrintWriter pw = null;
	File archivo= null;
	FileReader fr= null;
	BufferedReader br= null;
	JLabel nombre = new JLabel("Nombre: ");
	JTextField Tnombre = new JTextField(10);
	JLabel apellido = new JLabel("Apellido: ");
	JTextField Tapellido = new JTextField(10);
	JLabel edad = new JLabel("Edad: ");
	JTextField Tedad = new JTextField(10);
	JButton guardar = new JButton("Guardar");
	JButton cargar = new JButton("Cargar");
	JTextArea JtextArea= new JTextArea();
	
	
	public VentanaGuardar() {
		super("Ventana de guardado");
		getContentPane().setLayout(null);
		getContentPane().add(nombre);
		getContentPane().add(nombre);
		nombre.setBounds(10,10,100,20);
		getContentPane().add(Tnombre);
		Tnombre.setBounds(60,10,100,20);
		
		getContentPane().add(apellido);
		apellido.setBounds(160,10,100,20);
		getContentPane().add(Tapellido);
		Tapellido.setBounds(210,10,100,20);
		
		getContentPane().add(edad);
		edad.setBounds(310,10,100,20);
		getContentPane().add(Tedad);
		Tedad.setBounds(340,10,100,20);
		
		getContentPane().add(guardar);
		guardar.setBounds(100,50,80,20);
		getContentPane().add(cargar);
		cargar.setBounds(250,50,80,20);
		getContentPane().add(JtextArea);
		JtextArea.setBounds(20, 100, 300, 100);
		
		ActionListener oyente = new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource().equals(guardar)) {
					try {
						fichero = new FileWriter("src/PuntosExtras/TexArea.txt");
						pw = new PrintWriter(fichero);
						pw.print(Tnombre.getText()+", ");
						pw.print(Tapellido.getText()+", ");
						pw.print(Tedad.getText());
						pw.close();
						fichero.close();
					} catch (Exception e2) {
						// TODO: handle exception
						e2.printStackTrace();
					}
//					}else {
//						try {
//							fichero = new FileWriter("src/PuntosExtras/TexArea.txt",true);
//							pw = new PrintWriter(fichero);
//							pw.print(Tnombre.getText()+", ");
//							pw.print(Tapellido.getText()+", ");
//							pw.print(Tedad.getText());
//							pw.close();
//							fichero.close();
//						} catch (Exception e2) {
//							// TODO: handle exception
//							e2.printStackTrace();
//					}
					finally {
					}
						try {
							if(fichero != null) {
								fichero.close();
							}
						} catch (Exception e3) {
							// TODO: handle exception
							e3.printStackTrace();
						}
					}
				if(e.getSource().equals(cargar)) {
					try {
						archivo = new File("src/PuntosExtras/TexArea.txt");
						fr = new FileReader(archivo);
						br = new BufferedReader(fr);
						String resultado ="";
						String linea = "";
						while((linea=br.readLine()) != null) {
							resultado += linea;
							
						}
						StringTokenizer st = new StringTokenizer(resultado, ",");
						String nombre1 = st.nextToken();
						String apellido1 = st.nextToken();
						String edad1 = st.nextToken();
						
						JtextArea.setText("Nombre: " + nombre1 + " Apellido: " + apellido1 + " Edad: " + edad1);
//						System.out.println(resultado);
						
					} catch (Exception e2) {
						// TODO: handle exception
						e2.printStackTrace();
					}finally {
						try {
							if(fr != null) {
								fr.close();
							}
						} catch (Exception e3) {
							// TODO: handle exception
							e3.printStackTrace();
						}
					}
				}
				//JtextArea.setText("Nombre: " + nombre + " Apellido: " + apellido + " Edad: " + edad);
			}
			
		
		};
		guardar.addActionListener(oyente);
		cargar.addActionListener(oyente);
		
		
	}
	public static void main(String[] args) {
		VentanaGuardar ventana = new VentanaGuardar();
		ventana.setVisible(true);
		ventana.setBounds(100,200,500,300);//X,Y,ancho,alto
	}
	
}
