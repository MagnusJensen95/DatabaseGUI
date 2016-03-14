package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Brugere.*;

import javax.swing.*;

import javafx.scene.control.TextField;

public class DeleteUserPanel extends JPanel {
	
	private JLabel msg;
	private JLabel uid;
	private JLabel tablemsg;
	private JTextField userID;
	private JTextField table;
	private JButton delete;
	private JButton prev;
	
	public DeleteUserPanel(){
		
		setLayout(new GridLayout(7, 1));
		setBackground(Color.BLACK);
		
		msg = new JLabel("Type in the ID and the table from which you wish to delete a User");
		msg.setForeground(Color.white);
		uid = new JLabel("User ID");
		uid.setForeground(Color.white);
		tablemsg = new JLabel("Enter the table from which you wish to delete the user");
		tablemsg.setForeground(Color.white);
		
		
		userID = new JTextField(10);
		table = new JTextField(30);
		
		delete = new JButton("Delete User");
		delete.addActionListener(new DeleteUserListener());
		prev = new JButton("Return to the administratorpage");
		prev.addActionListener(new PreviousPageListener());
		
		add (msg);
		add (uid);
		add (userID);
		add (tablemsg);
		add (table);
		add (delete);
		add (prev);
		
		setPreferredSize(new Dimension(800, 300));
		
		
	}
	private class PreviousPageListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			GUIDAO.getGUI().setContentpane(GUIDAO.getGUI().getAdminpage());
			
		}
		
	}
	private class DeleteUserListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if (!(userID.getText().equals(""))){
				if (ActorDAO.deleteUser(Integer.parseInt(userID.getText()), table.getText())){
				GUIDAO.getGUI().setContentpane(GUIDAO.getGUI().getAdminpage());
			}
			else {
				msg.setText("This user doesnt exist in this table");
				msg.setForeground(Color.red);
			}
			}
		}
		
	}
	
}
