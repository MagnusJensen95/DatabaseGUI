package GUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class Intropanel extends JPanel {
	
	private JLabel welcome;
	private JButton proceed;


	public Intropanel(){
		
		welcome = new JLabel ("Welcome to the show.");
		welcome.setForeground(Color.white);
		proceed = new JButton ("Proceed");
		proceed.addActionListener(new ProceedListener());
		
		add (welcome);
		add (proceed);
		
		
		setPreferredSize(new Dimension(400, 200));
		setBackground(Color.BLACK);
		
	}
	
	private class ProceedListener implements ActionListener{
	
		public void actionPerformed (ActionEvent e){
			GUIwindow.setContentpane(new MainMenu());
		}

	}
	

}
