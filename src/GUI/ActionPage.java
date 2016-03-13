package GUI;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import Brugere.AdminDAO;

public class ActionPage extends JPanel{
	
	private JLabel welcome;
	private JButton content;
	private JButton prev;
	
	public ActionPage(){
		
		setLayout(new GridLayout(3, 1));
		setBackground(Color.BLACK);
		this.welcome = new JLabel("Welcome to the main User page. What do you need?", JLabel.CENTER);
		welcome.setForeground(Color.white);
		
		content = new JButton("Show main content");
		prev = new JButton("Return to Main Menu");
		content.addActionListener(new ContentListener());
		prev.addActionListener(new PrevListener());
		
		add (welcome);
		add (content);
		add (prev);

		setPreferredSize(new Dimension(600, 300));
	}
	
	private class ContentListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	private class PrevListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			GUIDAO.getGUI().setContentpane(GUIDAO.getGUI().getMain());
			
		}
		
	}

}
