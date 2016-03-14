package GUI;

import javax.swing.*;

import Brugere.ActorDAO;
import Brugere.AdminDAO;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MakeAdminPanel  extends JPanel{
	
	private JLabel msg;
	private JLabel uid;
	private JLabel tab;
	
	private JTextField userID;
	private JTextField table;
	private JButton grant;
	private JButton prev;
	
	
	public MakeAdminPanel(){
		
		setLayout(new GridLayout(7,1));
		setBackground(Color.BLACK);
		
		msg = new JLabel("Type in the table and the ID of the user, on which you wish to grant Admin status.");
		msg.setForeground(Color.white);
		uid = new JLabel("User ID");
		uid.setForeground(Color.white);
		tab = new JLabel("Table");
		tab.setForeground(Color.white);
		userID = new JTextField(30);
		table = new JTextField(30);
		
		grant = new JButton("Grant Admin Status");
		grant.addActionListener(new GrantListener());
		
		prev = new JButton("Return to to admin page");
		prev.addActionListener(new PrevListener());
		
		add(msg);
		add(uid);
		add(userID);
		add(tab);
		add(table);
		add(grant);
		add(prev);
		
		setPreferredSize(new Dimension(600,300));
	}
	
	private class GrantListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if (!(userID.getText().equals(""))){
				if (!(table.getText().equals(""))){
			
			AdminDAO.addAdmin(Integer.parseInt(userID.getText()), table.getText());
			
		}
			}
			}
	}
	
	private class PrevListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			GUIDAO.getGUI().setContentpane(new AdminPage());
		}
		
		
	}

}
