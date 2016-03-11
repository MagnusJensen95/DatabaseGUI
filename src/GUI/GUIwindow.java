package GUI;

import java.awt.*;
import javax.swing.*;

public class GUIwindow {

	public static JFrame guiFrame = new JFrame("Data Manipulator 2.0");
	

	public GUIwindow() {
		guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}

	public static void setContentpane(JPanel panel) {
		guiFrame.getContentPane().removeAll();
		guiFrame.getContentPane().add(panel);
		guiFrame.pack();
		guiFrame.setVisible(true);
	}
	
	public static void initializeGUI(){
		guiFrame.getContentPane().add(new Intropanel());
		guiFrame.pack();
		guiFrame.setVisible(true);
	}

}
