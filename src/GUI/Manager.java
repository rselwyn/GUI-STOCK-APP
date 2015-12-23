package GUI;

import java.awt.GridLayout;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
public class Manager extends JFrame{
	private Container mPanel;
	public Manager() {
		
		getContentPane().setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JButton btnBack = new JButton("Back");
		GridBagConstraints gbc_btnBack = new GridBagConstraints();
		gbc_btnBack.insets = new Insets(0, 0, 0, 5);
		gbc_btnBack.gridx = 1;
		gbc_btnBack.gridy = 0;
		panel_1.add(btnBack, gbc_btnBack);
		
		JLabel lblfullName = new JLabel("#FULL NAME");
		GridBagConstraints gbc_lblfullName = new GridBagConstraints();
		gbc_lblfullName.insets = new Insets(0, 0, 0, 5);
		gbc_lblfullName.gridx = 4;
		gbc_lblfullName.gridy = 0;
		panel_1.add(lblfullName, gbc_lblfullName);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblTicker = new JLabel("Ticker:");
		GridBagConstraints gbc_lblTicker = new GridBagConstraints();
		gbc_lblTicker.insets = new Insets(0, 0, 5, 5);
		gbc_lblTicker.gridx = 2;
		gbc_lblTicker.gridy = 0;
		panel.add(lblTicker, gbc_lblTicker);
		
		JLabel lblticker = new JLabel("#TICKER");
		GridBagConstraints gbc_lblticker = new GridBagConstraints();
		gbc_lblticker.insets = new Insets(0, 0, 5, 5);
		gbc_lblticker.gridx = 3;
		gbc_lblticker.gridy = 0;
		panel.add(lblticker, gbc_lblticker);
		
		JLabel lblToday = new JLabel("Today:");
		GridBagConstraints gbc_lblToday = new GridBagConstraints();
		gbc_lblToday.insets = new Insets(0, 0, 5, 5);
		gbc_lblToday.gridx = 7;
		gbc_lblToday.gridy = 0;
		panel.add(lblToday, gbc_lblToday);
		
		JLabel lblPrice = new JLabel("Price:");
		GridBagConstraints gbc_lblPrice = new GridBagConstraints();
		gbc_lblPrice.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrice.gridx = 2;
		gbc_lblPrice.gridy = 1;
		panel.add(lblPrice, gbc_lblPrice);
		
		JLabel lblprice = new JLabel("#PRICE");
		GridBagConstraints gbc_lblprice = new GridBagConstraints();
		gbc_lblprice.insets = new Insets(0, 0, 5, 5);
		gbc_lblprice.gridx = 3;
		gbc_lblprice.gridy = 1;
		panel.add(lblprice, gbc_lblprice);
		
		JLabel lblDailyChnage = new JLabel("Day High:");
		GridBagConstraints gbc_lblDailyChnage = new GridBagConstraints();
		gbc_lblDailyChnage.insets = new Insets(0, 0, 5, 5);
		gbc_lblDailyChnage.gridx = 7;
		gbc_lblDailyChnage.gridy = 1;
		panel.add(lblDailyChnage, gbc_lblDailyChnage);
		
		JLabel lbldh = new JLabel("#DH");
		GridBagConstraints gbc_lbldh = new GridBagConstraints();
		gbc_lbldh.insets = new Insets(0, 0, 5, 0);
		gbc_lbldh.gridx = 8;
		gbc_lbldh.gridy = 1;
		panel.add(lbldh, gbc_lbldh);
		
		JLabel lblMarketCap = new JLabel("Market Cap");
		GridBagConstraints gbc_lblMarketCap = new GridBagConstraints();
		gbc_lblMarketCap.insets = new Insets(0, 0, 5, 5);
		gbc_lblMarketCap.gridx = 2;
		gbc_lblMarketCap.gridy = 2;
		panel.add(lblMarketCap, gbc_lblMarketCap);
		
		JLabel lblmc = new JLabel("#MC");
		GridBagConstraints gbc_lblmc = new GridBagConstraints();
		gbc_lblmc.insets = new Insets(0, 0, 5, 5);
		gbc_lblmc.gridx = 3;
		gbc_lblmc.gridy = 2;
		panel.add(lblmc, gbc_lblmc);
		
		JLabel lblNewLabel_1 = new JLabel("Day Low");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 7;
		gbc_lblNewLabel_1.gridy = 2;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel lbldl = new JLabel("#DL");
		GridBagConstraints gbc_lbldl = new GridBagConstraints();
		gbc_lbldl.insets = new Insets(0, 0, 5, 0);
		gbc_lbldl.gridx = 8;
		gbc_lbldl.gridy = 2;
		panel.add(lbldl, gbc_lbldl);
		
		JLabel lblNewLabel = new JLabel("P/E Ratio");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 3;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblpe = new JLabel("#PE");
		GridBagConstraints gbc_lblpe = new GridBagConstraints();
		gbc_lblpe.insets = new Insets(0, 0, 0, 5);
		gbc_lblpe.gridx = 3;
		gbc_lblpe.gridy = 3;
		panel.add(lblpe, gbc_lblpe);
		
		JLabel lblVolume = new JLabel("Volume");
		GridBagConstraints gbc_lblVolume = new GridBagConstraints();
		gbc_lblVolume.insets = new Insets(0, 0, 0, 5);
		gbc_lblVolume.gridx = 7;
		gbc_lblVolume.gridy = 3;
		panel.add(lblVolume, gbc_lblVolume);
		
		JLabel lblvol = new JLabel("#Vol");
		GridBagConstraints gbc_lblvol = new GridBagConstraints();
		gbc_lblvol.gridx = 8;
		gbc_lblvol.gridy = 3;
		panel.add(lblvol, gbc_lblvol);
		
		mPanel = getContentPane();
		
		
	}
	
	public Container getCPane(){
		return this.mPanel;
	}
}
