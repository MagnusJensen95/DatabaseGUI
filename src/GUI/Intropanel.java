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
			
		
		
		
		try {
			img = ImageIO.read(new File("C:\\Users\\Magnus\\OneDrive\\DTU\\Eclipse\\worker\\DatabaseGUI\\src\\nusnus.jpg"));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		welcome = new JLabel ("Jensens Dataprogram 2.0", JLabel.CENTER);
//	welcome.setForeground(Color.white);
//	welcome.show(true);
		
		proceed = new JButton ("Welcome to the tech shop. Press here to proceed");
		proceed.addActionListener(new ProceedListener());
		proceed.setBackground(Color.yellow);
		proceed.setForeground(Color.BLACK);
		proceed.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
			
		
		
		//add(welcome);
		
		this.add(proceed);
	
		
		setPreferredSize(new Dimension(800, 600));
		
		
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


