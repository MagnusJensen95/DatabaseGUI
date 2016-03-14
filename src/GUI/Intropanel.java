package GUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Intropanel extends JComponent  {
	private JLabel img;
	private JLabel welcome;
	private JButton proceed;


	public Intropanel(){
		
		setLayout(new BorderLayout());
		img = new JLabel(new ImageIcon("nusnus.jpg"));
		img.setLayout(new FlowLayout());
		welcome = new JLabel ("Jensens Dataprogram 2.0", JLabel.CENTER);
		welcome.setForeground(Color.white);
		
		proceed = new JButton ("Proceed");
		proceed.addActionListener(new ProceedListener());
		
		add(img);
		img.add(welcome);
		img.add(proceed);
		
		
		setPreferredSize(new Dimension(600, 200));
		setVisible(true);
		//setBackground(Color.black);
	}
	
	private class ProceedListener implements ActionListener{
	
		public void actionPerformed (ActionEvent e){
			GUIDAO.getGUI().setContentpane(GUIDAO.getGUI().getMain());
		}

	}
	

	

}
