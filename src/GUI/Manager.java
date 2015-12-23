package GUI;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
public class Manager extends JFrame{
	private JTextField textField;
	private JPanel contentPane;
	public Manager() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JLabel lblStockMarketTracker = new JLabel("Stock Market Tracker App");
		GridBagConstraints gbc_lblStockMarketTracker = new GridBagConstraints();
		gbc_lblStockMarketTracker.insets = new Insets(0, 0, 5, 0);
		gbc_lblStockMarketTracker.gridx = 6;
		gbc_lblStockMarketTracker.gridy = 0;
		contentPane.add(lblStockMarketTracker, gbc_lblStockMarketTracker);
		
		JLabel lblTickerSymbol = new JLabel("Ticker Symbol:");
		GridBagConstraints gbc_lblTickerSymbol = new GridBagConstraints();
		gbc_lblTickerSymbol.insets = new Insets(0, 0, 0, 5);
		gbc_lblTickerSymbol.gridx = 2;
		gbc_lblTickerSymbol.gridy = 2;
		contentPane.add(lblTickerSymbol, gbc_lblTickerSymbol);
		
		JLabel lblticker = new JLabel("#TICKER");
		GridBagConstraints gbc_lblticker = new GridBagConstraints();
		gbc_lblticker.insets = new Insets(0, 0, 0, 5);
		gbc_lblticker.gridx = 3;
		gbc_lblticker.gridy = 2;
		contentPane.add(lblticker, gbc_lblticker);
		
	}

}
