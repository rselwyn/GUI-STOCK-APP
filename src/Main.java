import java.awt.Container;

import javax.swing.*;

import GUI.Manager;

public class Main extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame main = new JFrame("JAVA STOCK");
		main.setSize(500, 300);
		Manager m = new Manager();
		JPanel c = (JPanel) m.getCPane();
		main.add(c);
		main.setVisible(true);
	}

}
