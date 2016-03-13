package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainMenu extends JPanel {

	private JLabel options;
	private JButton createUser;
	private JButton logIn;
	private JButton adminLogIn;
	private JButton quit;

	public MainMenu() {

		setLayout(new GridLayout(5, 1));

		options = new JLabel("Hello there, what do you wanna do?", JLabel.CENTER);
		options.setForeground(Color.white);

		createUser = new JButton("Create User");
		logIn = new JButton("Log In");
		adminLogIn = new JButton("Log In as Administrator");
		quit = new JButton("Quit");

		createUser.addActionListener(new CreateUser());
		logIn.addActionListener(new LogInButton());
		adminLogIn.addActionListener(new AdminLogInButton());
		quit.addActionListener(new Quitter());

		add(options);
		add(createUser);
		add(logIn);
		add(adminLogIn);
		add(quit);

		setPreferredSize(new Dimension(600, 200));
		setBackground(Color.BLACK);
	}

	private class CreateUser implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			GUIDAO.getGUI().setContentpane(new UserCreation());

		}

	}

	private class LogInButton implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			GUIDAO.getGUI().setContentpane(new LogIn());
			

		}

	}

	private class AdminLogInButton implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			GUIDAO.getGUI().setContentpane(new AdminLogIn()
					);
			

		}
	}

	private class Quitter implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);

		}

	
	}
}
