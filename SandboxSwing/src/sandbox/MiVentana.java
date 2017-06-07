package sandbox;

import java.awt.*;


import javax.swing.*;


public class MiVentana extends JFrame {	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MiVentana(){
		
		this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		this.setTitle("Mi ventana de Juguete");
		this.setSize(200,200);
		this.setLocation(50,50);
		
		//FlowLayout layout =new FlowLayout(FlowLayout.LEFT);
		GridLayout layout =new GridLayout(3,2);
		this.getContentPane().setLayout(layout);
		
		/*for (int i=0; i<9;i++){
			JButton boton =new JButton();
		boton.setText(Integer.toString(i));
		this.add(boton);
		
		}*/
		
		for (int i=0; i<9;i++){
		JLabel label =new JLabel();
	label.setText(Integer.toString(i));
	this.add(label);
	JTextField txt =new JTextField();
	this.add(txt);
	
	}
		
		
		
		/*JLabel label =new JLabel();
		label.setText("milabel");
		this.add(label);*/
		
		
	}
	
	// hace que la ventana sea visible, y tenga main
	public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
        	// hace que corra en otro "hilo" de procesador para que no se cuelgue la ventana
            public void run() {
                new MiVentana().setVisible(true);
            }
        });
    }

}
