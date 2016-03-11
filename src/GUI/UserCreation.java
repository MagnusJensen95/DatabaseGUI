package GUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Brugere.*;

import javax.swing.*;


public class UserCreation extends JPanel {

		private JLabel msg;
		private JLabel fn;
		private JLabel ln;
		private JLabel pass;
		private JTextField firstname;
		private JTextField lastname;
		private JTextField password;
		private JButton createUser;
		
		public UserCreation(){
			
			setLayout(new GridLayout(8,1));
			msg = new JLabel("Here you can create a new user. Type in your firstname, lastname and password.");
			msg.setForeground(Color.white);
			
			fn = new JLabel("Enter Your Firstname");
			ln = new JLabel("Enter Your Lastname");
			pass = new JLabel("Enter Your Password");
			fn.setForeground(Color.white);
			ln.setForeground(Color.white);
			pass.setForeground(Color.white);
			
			firstname = new JTextField(30);
			lastname  = new JTextField(30);
			password  = new JTextField(30);
			
			createUser = new JButton("Create User");
			createUser.addActionListener(new UserCreationListener());
			
			add (msg);
			add (fn);
			add (firstname);
			add (ln);
			add (lastname);
			add (pass);
			add (password);
			add (createUser);
			
			setPreferredSize(new Dimension(600, 300));
			setBackground(Color.black);
			
		}
		
		private class UserCreationListener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
			
				if (!(firstname.getText().equals(""))){
					if (!(lastname.getText().equals(""))){
						if (!(password.getText().equals(""))){
							ActorDAO.addActor(firstname.getText(), lastname.getText(), password.getText());
							GUIwindow.setContentpane(new MainMenu());
						}
					}
				}
				else {
					msg.setText("You must fill in all the textfields!");
				}
				
				}
				
			}
			
		
}
