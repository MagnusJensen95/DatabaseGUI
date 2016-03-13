package GUI;

import java.awt.*;
import javax.swing.*;

public class GUIwindow {
	
	private MainMenu main;
	private Intropanel intro;
	private AdminPage adminpage;
	private ActionPage actionpage;
	
	public static JFrame guiFrame = new JFrame("Data Manipulator 2.0");
	

	public GUIwindow() {
		this.actionpage = new ActionPage();
		this.main = new MainMenu();
		this.intro = new Intropanel();
		this.adminpage = new AdminPage();
		
		
		guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}

	public void setContentpane(JPanel panel) {
		guiFrame.getContentPane().removeAll();
		guiFrame.getContentPane().add(panel);
		guiFrame.pack();
		guiFrame.setVisible(true);
	}
	
	public void initializeGUI(){
	
		guiFrame.getContentPane().add(GUIDAO.getGUI().intro);
		guiFrame.pack();
		guiFrame.setVisible(true);
	}
	public MainMenu getMain() {
		return main;
	}


	public AdminPage getAdminpage() {
		return adminpage;
	}
	
	public ActionPage getActionpage() {
		return actionpage;
	}
	


}
