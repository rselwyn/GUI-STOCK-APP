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
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblTicker = new JLabel("Ticker:");
		GridBagConstraints gbc_lblTicker = new GridBagConstraints();
		gbc_lblTicker.insets = new Insets(0, 0, 5, 5);
		gbc_lblTicker.gridx = 2;
		gbc_lblTicker.gridy = 0;
		panel.add(lblTicker, gbc_lblTicker);
		
		JLabel lblticker = new JLabel("#TICKER");
		GridBagConstraints gbc_lblticker = new GridBagConstraints();
		gbc_lblticker.insets = new Insets(0, 0, 5, 0);
		gbc_lblticker.gridx = 3;
		gbc_lblticker.gridy = 0;
		panel.add(lblticker, gbc_lblticker);
		
		JLabel lblPrice = new JLabel("Price:");
		GridBagConstraints gbc_lblPrice = new GridBagConstraints();
		gbc_lblPrice.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrice.gridx = 2;
		gbc_lblPrice.gridy = 1;
		panel.add(lblPrice, gbc_lblPrice);
		
		JLabel lblprice = new JLabel("#PRICE");
		GridBagConstraints gbc_lblprice = new GridBagConstraints();
		gbc_lblprice.insets = new Insets(0, 0, 5, 0);
		gbc_lblprice.gridx = 3;
		gbc_lblprice.gridy = 1;
		panel.add(lblprice, gbc_lblprice);
		
		JLabel lblMarketCap = new JLabel("Market Cap");
		GridBagConstraints gbc_lblMarketCap = new GridBagConstraints();
		gbc_lblMarketCap.insets = new Insets(0, 0, 0, 5);
		gbc_lblMarketCap.gridx = 2;
		gbc_lblMarketCap.gridy = 2;
		panel.add(lblMarketCap, gbc_lblMarketCap);
		
		JLabel lblmc = new JLabel("#MC");
		GridBagConstraints gbc_lblmc = new GridBagConstraints();
		gbc_lblmc.gridx = 3;
		gbc_lblmc.gridy = 2;
		panel.add(lblmc, gbc_lblmc);
		
	
		
	}

}
