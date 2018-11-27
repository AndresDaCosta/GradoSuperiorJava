package interfacesGraficas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Radiobutton extends JFrame{

	
	//construnctor por defecto de la ventana
	public Radiobutton() {
		
		
		JFrame frame = new JFrame("Radio Buttons");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.add(paint());
		
	}
	
	//constructor del panel con los botones
	public JPanel paint() {
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		JLabel color = new JLabel();
		color.setText("El color es azul");
    	color.setBounds(300, 300, 100, 100);
        panel.add(color);
		
		
		JRadioButton button1 = new JRadioButton("Azul",true);
		panel.add(button1);
		JRadioButton button2 = new JRadioButton("Verde",false);
		panel.add(button2);
		JRadioButton button3 = new JRadioButton("Rojo", false);
		panel.add(button3);
		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(button1);
		grupo.add(button2);
		grupo.add(button3);
		
		button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.BLUE);
                
            	color.setText("El color es Azul");
            	                
            }
        });
		button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	color.setText("El color es Verde");
            	
                panel.setBackground(Color.GREEN);
                
            }
        });
		button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.RED);
                
            	color.setText("El color es Red");
            	
            }
        });
		
		return panel;
		
	}
	
	
	
	
}
