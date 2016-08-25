package com.condinho.ConBank.GUI;

import java.awt.*;

public class Options {
	// Different option arrays
	private String Backend[] = new String[] {"Add New Customer","Modify Existing Customer", "Process Transaction", "Verify Customer"};
	private String Users[] = new String[] {"View Account Details", "View Transactions", "Withdraw", "Deposit", "Make Payment", "Check Balance"};
	private String Vendor[] = new String[] {"New Sale", "Process Return", "View Transaction", "Daily Sales Total" };
	private Panel optionPanel;
	private Button btnList[];
	
	// Constructor
	public Options(String arg) {
		if(arg.equals("Backend")) {
			prepareGUI("Backend");
		} else if (arg.equals("User")) {
			prepareGUI("User");
		} else {
			prepareGUI("Vendor");
		}
	}
	
	private void prepareGUI(String arg) {
		int optionList, i;
		Button temp;
		
		// Determine Number of buttons to add
		if(arg.equals("Backend")) {
			optionList = Backend.length;
			optionPanel = new Panel(new GridLayout(optionList,1));
			// add Buttons
			for(i = 0; i < optionList; i++) {
				temp = new Button();
				temp.setLabel(Backend[i]);
				optionPanel.add(temp);
			}
			
		} else if (arg.equals("User")) {
			optionList = Users.length;
			optionPanel = new Panel(new GridLayout(optionList,1));
			// add Buttons
			for(i = 0; i < optionList; i++) {
				temp = new Button();
				temp.setLabel(Users[i]);
				optionPanel.add(temp);
			}
		} else {
			optionList = Vendor.length;
			optionPanel = new Panel(new GridLayout(optionList,1));
			// add Buttons
			for(i = 0; i < optionList; i++) {
				temp = new Button();
				temp.setLabel(Vendor[i]);
				optionPanel.add(temp);
			}
		}
		
		optionPanel.setVisible(true);
	}
	
	public Panel getPanel() {
		return optionPanel;
	}
}
