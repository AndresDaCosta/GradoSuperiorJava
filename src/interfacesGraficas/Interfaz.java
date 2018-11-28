package interfacesGraficas;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Interfaz extends JFrame {
	private JTextField textfield1,textfield2;
    private JButton boton1;
    private JLabel fecha_la, n1, n2, n3, n4, n5, n6, n7, n8, complemento; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interfaz frame = new Interfaz();
		
		
		frame.setBounds(0,0,500,500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public Interfaz() {
			
			
			setBackground(Color.GREEN);
			setTitle("administracion de loterias");
			fecha_la = new JLabel();
			fecha_la.setBounds(20, 10, 20, 5);
			add(fecha_la);
	        
	}
}
