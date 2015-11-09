package gui.view;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import gui.controller.GUIController;

public class GUIPanel extends JPanel
{
	private GUIController baseController;
	private JButton firstButton;
	private JTextField firstField;
	
	public GUIPanel(GUIController baseController)
	{
		this.baseController = baseController;
		
		firstButton = new JButton("DO NOT CLICK THIS BUTTON...");
		firstField = new JTextField("Type words here...");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
