package interfacesGraficas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.DefaultButtonModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ButtonNumeros {

	private static JButton lastClicked = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		create();
		
	}
	
	
	public static void create() {
		
		//s
		JFrame frame = new JFrame("Radio Buttons");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.add(paint(),BorderLayout.CENTER);
		
	}
	public static  JPanel paint() {
		
		int numero;
		JPanel panel = new JPanel();
		JButton boton1, boton2, boton3,boton4, boton5, boton6,boton7, boton8, boton9;
		
		
		JLabel numlab = new JLabel();
		numlab.setAlignmentX(500);
		numlab.setAlignmentY(500);
		numlab.setText("hola mundo");
		panel.add(numlab);
		
		boton1 = new JButton("1");
		panel.add(boton1);
		boton2 = new JButton("2");
		panel.add(boton2);
		boton3 = new JButton("3");
		panel.add(boton3);
		boton4 = new JButton("4");
		panel.add(boton4);
		boton5 = new JButton("5");
		panel.add(boton5);
		boton6 = new JButton("6");
		panel.add(boton6);
		boton7 = new JButton("7");
		panel.add(boton7);
		boton8 = new JButton("8");
		panel.add(boton8);
		boton9 = new JButton("9");
		panel.add(boton9);

		boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            	deactiveButton(boton1);
            	numlab.setText("1");
            	                
            }
        });
		boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            	deactiveButton(boton2);
            	numlab.setText("2");
            	                
            }
        });
		boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            	deactiveButton(boton3);
            	numlab.setText("3");
            	                
            }
        });
		
		boton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            	deactiveButton(boton4);
            	numlab.setText("4");
            	                
            }
        });
		boton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            	deactiveButton(boton5);
            	numlab.setText("5");
            	                
            }
        });
		boton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            	deactiveButton(boton6);
            	numlab.setText("6");
            	                
            }
        });
		boton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            	deactiveButton(boton7);
            	numlab.setText("7");
            	                
            }
        });
		boton8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            	deactiveButton(boton8);
            	numlab.setText("8");
            	                
            }
        });
		boton9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            	deactiveButton(boton9);
            	numlab.setText("9");
            	                
            }
        });
		
		
		

		    
		    
		return panel;
	}
	
	 public static void deactiveButton(JButton button) {
	        if (lastClicked != null) {
	            lastClicked.setEnabled(false);
	        }
	        lastClicked = button;
	    }
}
