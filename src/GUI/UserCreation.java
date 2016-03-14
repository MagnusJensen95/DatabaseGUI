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
	private JLabel email;
	private JTextField firstname;
	private JTextField lastname;
	private JTextField password;
	private JTextField emailaddress;
	private JButton createUser;
	private JButton prev;

	public UserCreation() {

		setLayout(new GridLayout(11, 1));
		msg = new JLabel("Here you can create a new user. Type in your firstname, lastname, password and E-mail address.");
		msg.setForeground(Color.white);

		fn = new JLabel("Firstname");
		ln = new JLabel("Lastname");
		pass = new JLabel("Password");
		email = new JLabel("E-mail");
		fn.setForeground(Color.white);
		ln.setForeground(Color.white);
		pass.setForeground(Color.white);
		email.setForeground(Color.white);

		firstname = new JTextField(30);
		lastname = new JTextField(30);
		password = new JTextField(30);
		emailaddress = new JTextField(30);

		createUser = new JButton("Create User");
		createUser.addActionListener(new UserCreationListener());
		prev = new JButton("Return to Main Menu");
		prev.addActionListener(new ReturnListener());

		add(msg);
		add(fn);
		add(firstname);
		add(ln);
		add(lastname);
		add(pass);
		add(password);
		add(email);
		add(emailaddress);
		add(createUser);
		add (prev);

		setPreferredSize(new Dimension(600, 300));
		setBackground(Color.black);

	}

	private class UserCreationListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			if (!(firstname.getText().equals(""))) {
				if (!(lastname.getText().equals(""))) {
					if (!(password.getText().equals(""))) {
						if ((!(emailaddress.getText().equals("")))) {
							if (emailaddress.getText().contains("@")) {
								if (!(ActorDAO.emailUsed(emailaddress.getText()))){

								ActorDAO.addActor(firstname.getText(), lastname.getText(), password.getText(),
										emailaddress.getText(), "users");
								GUIDAO.getGUI()
								.setContentpane(GUIDAO.getGUI().getMain());
								}
								else msg.setText("This Email is already in use");
							}
							else {
								msg.setText("your e-mail must contain @");
							}
						}
					}
				}
			} 
			else {
				msg.setText("You must fill in all the textfields");
				msg.setForeground(Color.red);
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
