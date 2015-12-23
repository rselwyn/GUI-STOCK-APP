package GUI;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
public class Manager extends JFrame{
	
	public Manager() {
		
		getContentPane().setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblTicker = new JLabel("Ticker:");
		GridBagConstraints gbc_lblTicker = new GridBagConstraints();
		gbc_lblTicker.insets = new Insets(0, 0, 5, 0);
		gbc_lblTicker.gridx = 2;
		gbc_lblTicker.gridy = 0;
		panel.add(lblTicker, gbc_lblTicker);
		
		JLabel lblPrice = new JLabel("Price:");
		GridBagConstraints gbc_lblPrice = new GridBagConstraints();
		gbc_lblPrice.gridx = 2;
		gbc_lblPrice.gridy = 1;
		panel.add(lblPrice, gbc_lblPrice);
		
	
		
	}

}
