package GUI;
import Brugere.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;

public class AdminPage extends JPanel {
	
	private JLabel topmsg;
	private JButton deleteUser;
	private JButton makeAdmin;
	private JButton mainmenu;
	
	
	public AdminPage(){
		
		setLayout(new GridLayout(4, 1));
		setBackground(Color.BLACK);
		
		topmsg = new JLabel("Welcome to the Admin page. Choose an option.");
		topmsg.setForeground(Color.white);
		
		deleteUser = new JButton("Delete a User");
		deleteUser.addActionListener(new DeleteUserListener());
		makeAdmin = new JButton("Grant Admin status on a User");
		makeAdmin.addActionListener(new MakeAdminListener());
		mainmenu = new JButton("Return to Main Menu");
		mainmenu.addActionListener(new MainMenuListener());
		
		add (topmsg);
		add (deleteUser);
		add (makeAdmin);
		add (mainmenu);
		
		setPreferredSize(new Dimension(600, 300));
		
	}
	
	private class DeleteUserListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			GUIDAO.getGUI().setContentpane(new DeleteUserPanel());
			
		}
		
	}
	private class MakeAdminListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	private class MainMenuListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			GUIDAO.getGUI().setContentpane(GUIDAO.getGUI().getMain());
		}
		
	}

}
