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
		
		setLayout(new GridLayout(2,1));
		welcome = new JLabel ("Jensens Dataprogram 2.0", JLabel.CENTER);
		welcome.setForeground(Color.white);
		
		proceed = new JButton ("Proceed");
		proceed.addActionListener(new ProceedListener());
		
		
		add (welcome);
		add (proceed);
		
		
		setPreferredSize(new Dimension(600, 200));
		setBackground(Color.BLACK);
		
	}
	
	private class ProceedListener implements ActionListener{
	
		public void actionPerformed (ActionEvent e){
			GUIDAO.getGUI().setContentpane(GUIDAO.getGUI().getMain());
		}

	}
	

}
