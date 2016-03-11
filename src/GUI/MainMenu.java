package GUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class MainMenu extends JPanel {
	

	private JLabel options;
	private JButton createUser;
	private JButton logIn;
	private JButton quit;

	public MainMenu(){
		
		options = new JLabel("Hello there, what do you wanna do?");
		options.setForeground(Color.white);
		createUser = new JButton("Create User");
		logIn = new JButton("Log In");
		quit = new JButton("Quit");
		
		createUser.addActionListener(new CreateUser());
		logIn.addActionListener(new LogIn());
		quit.addActionListener(new Quitter());
		
		add (options);
		add (createUser);
		add (logIn);
		add (quit);
		
		setPreferredSize(new Dimension(400, 200));
		setBackground(Color.BLACK);
	}
	
	private class CreateUser implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			
		}
		
		
	}
	private class LogIn implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			
		}
		
		
	}
	private class Quitter implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
			
		}
		
		
	}

}
