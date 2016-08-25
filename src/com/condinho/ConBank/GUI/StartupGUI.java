package com.condinho.ConBank.GUI;

import java.awt.*;
import java.awt.event.*;

public class StartupGUI {
	// UI Components
	private Frame mainFrame;
	private Label msgLabel;
	private Panel optionPanel;
	
	// Constructor
	public StartupGUI() {
		prepareInterface();
	}
	
	private void prepareInterface() {		
		// Create the initial dialog message
		mainFrame = new Frame("Conbank Systems");
		mainFrame.setSize(400, 200);
		mainFrame.setLayout(new FlowLayout());
		mainFrame.setLocationRelativeTo(null);
		mainFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
		
		// Create button panel
		optionPanel = new Panel();
		optionPanel.setLayout(new GridLayout(3,1));
		
		// Create Buttons
		Button userBtn = new Button("User View");
		Button bankBtn = new Button("Bank View");
		Button vendorBtn = new Button("Vendor View");
		
		// Assign Button commands
		userBtn.setActionCommand("User");
		bankBtn.setActionCommand("Bank");
		vendorBtn.setActionCommand("Vendor");
		
		// Link Listener Class to buttons
		userBtn.addActionListener(new ButtonClickListener()); 
		bankBtn.addActionListener(new ButtonClickListener());
		vendorBtn.addActionListener(new ButtonClickListener());
		
		// Add Buttons to option Panel
		optionPanel.add(userBtn);
		optionPanel.add(bankBtn);
		optionPanel.add(vendorBtn);
		
		// Add items to main frame
		mainFrame.add(optionPanel);
		mainFrame.setVisible(true);	
	}
	
	private class ButtonClickListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String command = e.getActionCommand();
			if (command.equals("User")) {
				UserInterface user = new UserInterface();
			} else if (command.equals("Bank")) {
				BackendInterface bnk = new BackendInterface();
			} else {
				VendorInterface vend = new VendorInterface();
			}
			mainFrame.dispose();
		}
	}
	

}
