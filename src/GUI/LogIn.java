package GUI;

import java.awt.Dimension;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LogIn extends JPanel{
	
	private JTextField firstname;
	private JTextField password;
	private JLabel msg;
	private JLabel firstmsg;
	private JLabel passmsg;
	private JButton logIn;
	
	public LogIn(){
		setLayout(new GridLayout(8, 1));
		
		msg = new JLabel("This is where you sign in. Please type in your firstname and your password");
		firstmsg = new JLabel("Type in your firstname");
		passmsg = new JLabel("Type in your password");
		firstname = new JTextField(30);
		firstname.addActionListener(new FirstnameListener());
		password = new JTextField(30);
		password.addActionListener(new PasswordListener());
		
		logIn = new JButton("Log In");
		logIn.addActionListener(new logInListener());
		
		add (msg);
		add (firstmsg);
		add (firstname);
		add (passmsg);
		add (password);
		add (logIn);
		
		setPreferredSize(new Dimension(600, 300));
		
	}
	
	private class FirstnameListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			
		}
		
		
	}
	private class PasswordListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			
		}
		
		
	}
	private class logInListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			
		}
		
		
	}

}
