package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import Brugere.AdminDAO;



public class AdminLogIn extends JPanel {
	
	private JTextField email;
	private JTextField password;
	private JLabel msg;

	private JLabel passmsg;
	private JLabel emsg;
	private JButton logIn;
	private JButton prev;
	
	public AdminLogIn(){
		setLayout(new GridLayout(7, 1));
		setBackground(Color.BLACK);
		
		msg = new JLabel("Please type in your E-mail and your password");
		msg.setForeground(Color.white);
		emsg = new JLabel("E-mail");
		emsg.setForeground(Color.white);
		passmsg = new JLabel("Password");
		passmsg.setForeground(Color.white);
		email = new JTextField(30);
		password = new JTextField(30);
		logIn = new JButton("Log In as Admin");
		logIn.addActionListener(new logInListener());
		prev = new JButton("Return to Main Menu");
		prev.addActionListener(new ReturnListener());
		
		add (msg);
		add (emsg);
		add (email);
		add (passmsg);
		add (password);
		add (logIn);
		add (prev);
		
		setPreferredSize(new Dimension(600, 300));
		
	}
	
	private class logInListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if (AdminDAO.isAdmin(password.getText(), email.getText())){
			GUIDAO.getGUI().setContentpane(GUIDAO.getGUI().getAdminpage());
			}
			else{
				msg.setText("Wrong E-mail/Password");
			}
		}
		
		
	}
	private class ReturnListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			GUIDAO.getGUI().setContentpane(GUIDAO.getGUI().getMain());
			
		}
		
		
	}

}


