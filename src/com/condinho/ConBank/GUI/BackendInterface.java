package com.condinho.ConBank.GUI;

import java.awt.*;
import java.awt.event.*;

public class BackendInterface {
	private Frame mainFrame;
	private Button statusLabel;
	private Panel backendPanel;
	private Options optMenu = new Options("Backend");
	
	public BackendInterface() {
		prepareGUI();
	}
	
	private void prepareGUI() {		
		mainFrame = new Frame("Bank View");
		mainFrame.setExtendedState(Frame.MAXIMIZED_BOTH);
		mainFrame.setLayout(new GridBagLayout());
		mainFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
		
		GridBagConstraints c = new GridBagConstraints();
		
		backendPanel = optMenu.getPanel();
		c.fill = GridBagConstraints.BOTH;
		c.weightx = 0.15;
		c.weighty = 1;
		c.gridx = 0;
		c.gridy = 0;
		
		mainFrame.add(backendPanel, c);
		
		statusLabel = new Button();
		statusLabel.setLabel("Main View");
		c.fill = GridBagConstraints.BOTH;
		c.weightx = 0.85;
		c.weighty = 1;
		c.gridx = 1;
		c.gridy = 0;
		mainFrame.add(statusLabel, c);
		
		mainFrame.setVisible(true);
	}
}

