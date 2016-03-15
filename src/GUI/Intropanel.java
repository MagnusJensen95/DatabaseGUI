package GUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Intropanel extends JPanel  {
	private Image img;
	//protected JLabel welcome;
	private JButton proceed;


	public Intropanel(){
			this.setBounds(660, 400, 220, 30);
		//setLayout(new GridLayout(2, 1));
		//setBackground(Color.black);
		
		try {
			img = ImageIO.read(new File("C:\\Users\\Magnus\\OneDrive\\DTU\\Eclipse\\worker\\DatabaseGUI\\src\\nusnus.jpg"));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		welcome = new JLabel ("Jensens Dataprogram 2.0", JLabel.CENTER);
//		welcome.setForeground(Color.white);
		
		proceed = new JButton ("Proceed");
		proceed.addActionListener(new ProceedListener());
			
		
		
		//add(welcome);
		
		add(proceed);
		//proceed.setLocation(getWidth()/2, getHeight());	
		
		setPreferredSize(new Dimension(800, 500));
		
		
	}
	
	private class ProceedListener implements ActionListener{
			
		public void actionPerformed (ActionEvent e){
			
			
			GUIDAO.getGUI().setContentpane(GUIDAO.getGUI().getMain());
		}

	}
	

	
    


@Override
public void paint(Graphics g)
{
	
   
    	super.paint(g);
    	System.out.println("test");
		//BufferedImage img = ImageIO.read(new File("C:\\Users\\Magnus\\OneDrive\\DTU\\Eclipse\\worker\\DatabaseGUI\\src\\nusnus.jpg"));
    	g.drawImage(img, 0, 0, getWidth(), getHeight(),  this);
    	
	
	} 
		
}


